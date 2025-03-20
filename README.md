🚀 Selenium Automation Home Task

📌 Overview
  This is a Selenium-based test automation project using the Page Object Model (POM) and TestNG. The project is managed with Maven and includes data-driven testing capabilities.

🛠 Prerequisites
Before running the project, ensure you have the following installed:

  ✅ Java 16 (Ensure JAVA_HOME is set & Verify with java -version)
  ✅ Maven (Ensure path is set in the enviroment variable and Verify with mvn -version)
  ✅ Git (For cloning the repository)
  ✅ Google Chrome (Or update WebDriver for your browser in src/test/java/testCases/BaseTest.java line 24) i.e. WebDriverManager.chromedriver().setup(); to WebDriverManager.firefoxdriver().setup();

📥 Clone the Repository
  To get started, clone the repository using the following command:
  
      git clone https://github.com/AneeqNawaz/ReizTechAutomationHomeTask.git

📦 Install Dependencies
    Navigate to the project folder and install dependencies using Maven:
    
    cd <your-project-folder>
    mvn clean install

▶️ Running the Tests

    mvn test

📊 Reports & Logs

    Not Implemented

📂 Project Structure

📜 Explanation of Functionality

🔹 Page Object Model (POM): Each page has a corresponding class in pageObjects/ that contains locators and methods.
🔹 Test Cases: Located in testCases/, they utilize POM classes to interact with the application.
🔹 TestNG: Manages test execution and reporting.
🔹 Data-Driven Testing: Configurable via testData/config.properties.
🔹 Maven: Handles dependencies and test execution.


🛠 Troubleshooting
If you encounter issues:
🔹 Ensure the correct Java version is installed.
🔹 Run mvn clean install to resolve dependency issues.
🔹 Check logs in logs/ for errors.

📧 Contact
For any questions, feel free to reach out! 🚀
