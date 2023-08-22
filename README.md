# page-object-model-orange-hrm

This is a Selenium Page Object Model based Test Automation Framework. 
Here we are automating the organge hrm testing website.

we are using a concept of logical test **session** that is shared accross the framework components at runtime : page objects, tests, utilites etc.
The session is set in an engine using **TestNg's** **setTestContext()** before every test execution starts

