-------------------
Read Me
-------------------

Ansible folder structure
=========================
.
├── ansible.cfg
├── hosts
├── installjava.yml
└── roles
    └── java
        ├── files
        │   └── java_test.java
        ├── tasks
        │   └── main.yml
        └── vars
            └── main.yml

Contents
========
1. ansible.cfg
   - The configuration maps a local host file within the current directory structure.

2. hosts
   - List all the host ip address in the specified location
     All the host windows environment are expected to have the same admin credentials

3. installjava.yml
   - The yml refers to the role 'java' 

4. files
   - The java_test.java is a simple java program, that displays a custom message with the host ip and name
     The program will be compiled and executed after java is installed. This step is to ensure, java is worked as expected after the installation.

5. vars
   - The jdk versions are defined as variables

6. tasks
   - The roles the following taks
     - Install jdk<version> using chocolatey. (*Note - If Chocolatey is not installed, the process installs it automatically)
     - Set JAVA_HOME
     - Add Java to the PATH
     - Verify the installed java version
     - Pushes java_test.java to host
     - Compile java_test.java and creates the GetMyIPAddress.class
     - Executes and displays the output from the java program 
     - Clears the java files

Execution
=========
ansible-playbook installjava.yml --ask-pass
<Provide the password for the user specified in the hosts file>

WhiteListing URL
================
https://chocolatey.org
https://packages.chocolatey.org
           

              