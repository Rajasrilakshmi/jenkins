package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffSteps {
static WebDriver driver;
@Given("user should be in the telecom home pagee")
public void user_should_be_in_the_telecom_home_pagee() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Srilakshmi\\Cucumber10\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
}

@Given("user click on add tariff button")
public void user_click_on_add_tariff_button() {
	 driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("user enters all the fields with valid dataA")
public void user_enters_all_the_fields_with_valid_dataA(DataTable tList) {
	List<String> data1 = tList.asList(String.class);
	driver.findElement(By.id("rental1")).sendKeys(data1.get(0));
	driver.findElement(By.id("local_minutes")).sendKeys(data1.get(1));
	driver.findElement(By.id("inter_minutes")).sendKeys(data1.get(2));
	driver.findElement(By.name("sms_pack")).sendKeys(data1.get(3));
	driver.findElement(By.id("minutes_charges")).sendKeys(data1.get(4));
	driver.findElement(By.id("inter_charges")).sendKeys(data1.get(5));
	driver.findElement(By.id("sms_charges")).sendKeys(data1.get(6));
}

@When("user clicks on submit buttonn")
public void user_clicks_on_submit_buttonn() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("user should be displayed home is generated")
public void user_should_be_displayed_home_is_generated() {
	driver.findElement(By.xpath("(//a[text()='Home'])[1]")).isDisplayed();
}

@When("user enters all the fields with valid dataB")
public void user_enters_all_the_fields_with_valid_dataB(io.cucumber.datatable.DataTable tMap) {
	Map<String,String> data2 = tMap.asMap(String.class,String.class);
	driver.findElement(By.id("rental1")).sendKeys(data2.get("MonRen"));
	driver.findElement(By.id("local_minutes")).sendKeys(data2.get("locMin"));
	driver.findElement(By.id("inter_minutes")).sendKeys(data2.get("IntMin"));
	driver.findElement(By.name("sms_pack")).sendKeys(data2.get("Sms"));
	driver.findElement(By.id("minutes_charges")).sendKeys(data2.get("locChrg"));
	driver.findElement(By.id("inter_charges")).sendKeys(data2.get("IntChrg"));
	driver.findElement(By.id("sms_charges")).sendKeys(data2.get("SmsChrg"));
}
//Scenario outline

@When("user enters all the fields with valid dataC{string},{string},{string},{string},{string},{string},{string}")
public void user_enters_all_the_fields_with_valid_dataC(String MonRen, String locMin, String IntMin, String Sms, String locChrg, String IntChrg, String SmsChrg) {
	driver.findElement(By.id("rental1")).sendKeys(MonRen);
	driver.findElement(By.id("local_minutes")).sendKeys(locMin);
	driver.findElement(By.id("inter_minutes")).sendKeys(IntMin);
	driver.findElement(By.name("sms_pack")).sendKeys(Sms);
	driver.findElement(By.id("minutes_charges")).sendKeys(locChrg);
	driver.findElement(By.id("inter_charges")).sendKeys(IntChrg);
	driver.findElement(By.id("sms_charges")).sendKeys(SmsChrg);
}

}
