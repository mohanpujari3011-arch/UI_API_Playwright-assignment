Architecture Diagram

TestNG
  |
  v
Test Classes (UI / API)
  |
  v
Page Objects / API Client
  |
  v
Playwright Engine
  |
  v
Reporting (Extent)



Folder Structure

PlaywrightAssignment/
├── src
│   ├── main/java
│   │   ├── core
│   │   │   ├── PlaywrightFactory.java
│   │   │   └── APIClient.java
│   │   ├── pages
│   │   │   └── LoginPage.java
│   │   ├── utils
│   │   │   ├── Reports.java
│   │   │   ├── ConfigReader.java
│   │   │   └── DataReader.java
│   ├── test/java
│   │   ├── ui
│   │   │   └── LoginTests.java
│   │   └── api
│   │       └── UserApiTest.java
│   ├── test/resources
│   │   ├── testdata.json
│   │   └── config.properties
├── testng.xml
├── pom.xml
├── Jenkinsfile/.github/workflows/ci.yml
└── README.md



Technology Choices & Rationale
Component	    Choice	          Reason
UI Automation	Playwright Java	  Modern, fast, auto-wait, cross-browser
API Testing	    Playwright API	  Same tool, shared lifecycle
Test Runner	    TestNG	          Parallelism, listeners, CI support
Reporting	    Extent Reports	  Rich HTML, screenshots
Build Tool	    Maven	          Industry standard
CI	            Jenkins/GitHub 	  Enterprise ready
