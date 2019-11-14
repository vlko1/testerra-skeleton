# Testerra Skeleton

This is a skeleton project for Testerra implements.

## Prerequisits

### Setup for existing Selenium Environment

You need to configure your Selenium environement in `test.properties`
```shell script
# Selenium environment
tt.selenium.server.url=http://[selenium-host]:[port]
#tt.webdriver.mode=local
```

### Install local Selenium Environment

Or install the following components into your environment

### On Windows using Chocolately
```shell script
choco install chromium chromedriver
```

### On Debian/Ubuntu
```shell script
apt-get install chromium-browser chromium-chromedriver
```

### On MacOSX (tdb)
```shell script
brew install
```

## Run the tests
```shell script
gradle test -Peverything
```

## View test results
Open `testerra-report/index.html` in a Browser of your choice.
