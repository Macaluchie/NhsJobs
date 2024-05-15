package StepDefinitions;

import PageObject.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchStepDef {

    private WebDriver driver;
    private SearchPage searchPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }
     @After
     public void teardown(){
        if (driver!=null)
     }
    @Given("I am a job seeker on NHS Jobs website")
    public void i_am_a_job_seeker_on_nhs_jobs_website() {


    }
    @And("i click on the accept analytics cookies button")
    public void i_click_on_the_accept_analytics_cookies_button() {

    }

    @When("I enter Automation Test Analyst into the Search functionality")
    public void i_put_my_preferences_into_the_search_functionality() {

    }
    @And("I click on the search button")
    public void i_click_on_the_search_button() {

    }

    @Then("I should get a list of jobs which matches my preferences")
    public void i_should_get_a_list_of_jobs_which_matches_my_preferences() {

    }

    @And("sort my search results with the newest date posted")
    public void sort_my_search_results_with_the_newest_date_posted() {

    }





}
