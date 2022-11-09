Feature: Login Validation
@Smoketest @login
Scenario: Verify login in facebook
Given user is in the facebook page
When user enters username


@Regression @error
Scenario: Error message for invalid login username
Given user is in the facebook page
When user enters the invalid  username 
