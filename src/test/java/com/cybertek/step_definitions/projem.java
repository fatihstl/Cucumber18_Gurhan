package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class projem {
    @Given("I am on thee page")
    public void i_am_on_thee_page(){
        Driver.getDriver().get("http://library2.cybertekschool.com/#dashboard");
      /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/#dashboard");
        driver.findElement(By.id("inputEmail")).sendKeys("librarian47@library");
        driver.findElement(By.id("inputPassword")).sendKeys("rJEIrUIt");
     driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
*/
    }

    @When("I hit U button")
    public void i_hit_u_button() {
        System.out.println("yaziyor");


    }
    @And("I will sleck L dropdown")
    public void i_will_sleck_l_dropdown() {
        System.out.println("yaziyor");


    }
    @Then("I will see l option")
    public void i_will_see_l_option() {
        System.out.println("yaziyor");


    }
}
