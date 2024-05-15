Feature: Jobs Search Functionality
  As a job seeker on NHS Jobs website
  I want to search for a job with my preferences
  So that I can get recently posted job results

Scenario: Job Searching
  Given I am a job seeker on NHS Jobs website
  And i click on the accept analytics cookies button
  When I enter Automation Test Analyst into the Search functionality
  And I click on the search button
  Then I should get a list of jobs which matches my preferences
  And sort my search results with the newest date posted