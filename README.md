# thescore-qa-challenge

This project is a QA challenge submission for theScore, utilizing Appium 2.5.4, Java 11, Maven, testng and Selenium.

## Setup

### Prerequisites

- Java 12 
- Maven
- selenium
- Android SDK

### Installation

1. Clone the repository.
2. Install dependencies with Maven.

   ```bash
   mvn clean install
   
Configure the following desired capabilities in your Appium tests:
json
JSON CODE
{
  "platformName": "Android",
  "platformVersion": "11.0",
  "deviceName": "Pixel 8 Pro API 30",
  "automationName": "UiAutomator2"
}


 
