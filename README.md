What is the DevOps Lifecycle?

Devops is a framework that collaborate between Development and Operations teams. 


Continuous Intergration
- Regulary integrating code changes from mulitple developers into a central repository, followed
  by automated build and tests.

Continous Delivery
- Build on Continous Intergration, automating the software release process so developers
  can deploy application into production.

![alt text](https://www.manageengine.com/products/service-desk/images/devops-lifecycle-diagram.png)


The 8 phases of the DevOps LifeCycle
1) Plan: Define the goals and scopes. Developement and Operations teams collaborate to understand
   the requirements, set priorities, and plan the workflow.
   
2) Code: Developers write codes to create new features, debugs, or doing software enhancment.
   Version Control systems like Git are employed to manage and track changes to the codebase.
   
3) Build: Compiled or transformed into executable programs.

4) Test: Once the software is built, rigorous testing is undertaken to identify and fix defects. This could include:
   a) Unit Testing
   b) Integration Testing
   c) System Testing
   d) User Acceptance Testing
   
5) Release: Preparation for application deployment into the production environment
    
6) Deploy: The new code is moved into the production environment. Such as
    a) Container Orchestration Tools (e.g., Kubernetes)
    b) Configuration Management Tools (e.g., Ansible, Puppet, and Chef) 
    
7) Operate: Once deployed, ongoing maintenance and support is needed.
    
8) Monitor: Continuous monitoring tracks application performance, identifies issues, and gathers user feedback.



What is the Jenkin Pipeline?

It is a suite of plugins that allows to define and automate CI/CD process as code.

Instead of configuring build steps manually in the UI, you write your build, test, and deployment process in a file called a Jenkinsfile.

A Jenkins Pipeline automates steps which helps to automate software delivery in a repeatable and version-controlled way.:
1. Pulling code from Git
2. Building the application
3. Running tests
4. Packaging artifacts
5. Deploying to staging/production


🔹 Key Concepts
1. Pipeline → The entire CI/CD workflow
2. Stage → A major phase (Build, Test, Deploy)
3. Step → A single task inside a stage
4. Agent → Where the pipeline runs (node/container)
5. Jenkinsfile → File that defines the pipeline


Summary:
Ensure all pipeline stages are executed automatically.


What is the CI/CD Pipeline?

![alt text](https://i.ytimg.com/vi/PKcGy9oPVXg/maxresdefault.jpg)




What does Docker do?







