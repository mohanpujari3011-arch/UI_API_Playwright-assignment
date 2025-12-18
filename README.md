# UI & API Automation Framework – Playwright (Java)

## 📌 Overview
This repository contains a **scalable test automation framework** built using **Playwright with Java** and **TestNG**.  
The framework supports **UI automation**, **API automation**, **data-driven testing**, **HTML reporting**, and **CI execution**.

It is designed to demonstrate **real-world automation best practices** suitable for enterprise domains such as **banking, healthcare, and e-commerce**.


## 🧰 Tech Stack
- **Language:** Java 17
- **UI Automation:** Playwright
- **API Automation:** Playwright APIRequestContext
- **Test Runner:** TestNG
- **Build Tool:** Maven
- **Reporting:** Extent Reports
- **CI/CD:** Jenkins / GitHub Actions

## 📂 Project Structure

UI_API_Playwright-assignment/
├── src
│ ├── main/java
│ │ ├── Core
│ │ │ ├── PlaywrightFactory.java
│ │ │ ├── BaseTest.java
│ │ │ └── APIClient.java
│ │ ├── Pages
│ │ │ └── LoginPage.java
│ │ └── Utils
│ │ ├── Reports.java
│ │ └── DataSheet.java
│ ├── test/java
│ │ ├── UI
│ │ │ └── LoginTests.java
│ │ └── api
│ │ └── UserApiTest.java
│ └── test/resources
│ └── testdata.json
├── Data
│ ├── loginData.json
│ └── TestLoginData.xlsx
├── testng.xml
├── pom.xml
├── DESIGN_DOCUMENT.md
├── RETROSPECTIVE.md
└── README.md

yaml
Copy code


## 🧪 Test Coverage

### UI Tests
- Login success
- Login failure  

**Demo Site:**  
https://the-internet.herokuapp.com/login

### API Tests
- Create resource (happy path)
- Invalid endpoint (negative scenario)  

**Public API:**  
https://jsonplaceholder.typicode.com


## 📊 Reporting
- HTML reports generated using **Extent Reports**
- Single consolidated report for **UI + API tests**

📁 Report location:
test-output/ExtentReports/Report.html

yaml
Copy code

## 📑 Data-Driven Testing
- External test data using Excel**
- Improves maintainability and reusability
- Test logic is separated from test data


## ▶️ How to Run Tests Locally

### Prerequisites
- Java 17 or above
- Maven installed
- Internet connection

### Run All Tests
```bash
mvn clean test
Run Using TestNG XML
bash
Copy code
mvn test -DsuiteXmlFile=testng.xml
🤖 CI Execution
Jenkins
Use the provided Jenkinsfile

Pipeline stages:

Build

Test execution

Publish HTML report

GitHub Actions
Sample workflow included

Executes tests on every push

🔐 Sensitive Data Handling
No credentials hard-coded in source code

Test data externalized

Secrets can be injected using environment variables in CI

Sensitive values are not logged in reports

📄 Documentation
DESIGN_DOCUMENT.md
→ Architecture, framework design, scalability, and security considerations

RETROSPECTIVE.md
→ Trade-offs, lessons learned, and next steps for scaling to a banking product

🚀 Future Enhancements
Screenshot capture on UI test failures

API response attachment in reports

Cross-browser execution

Performance and security testing integration

Test tagging (smoke, regression)

👤 Author
Automation Engineer
(Java | Playwright | API Testing | CI/CD)

✅ Notes
This framework is designed to be clean, scalable, and enterprise-ready, following industry-standard automation practices.
