package UilityFunctions;

import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CSVDataReader {
    private static Map<String, String> testData = new HashMap<>();

    // Load CSV file when the class is initialized
    static {
        loadCSVData();
    }

    private static void loadCSVData() {
        try {
            File file = new File("src/test/resources/testdata.csv");
            System.out.println("Loading CSV from: " + file.getAbsolutePath());

            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    if (nextLine.length == 2) {
                        String key = nextLine[0].trim(); // Trim key
                        String value = nextLine[1].trim(); // Trim value
                        testData.put(key, value);
                        System.out.println("✅ Loaded key: " + key + " | Value: " + value);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("❌ Error loading CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String actor(String key) {
        String value = testData.getOrDefault(key, null);
        if (value == null) {
            System.out.println("❌ Key not found: " + key);
            return "Key not found";
        }
        return value.trim(); // Ensure trimming when retrieving values
    }
}
