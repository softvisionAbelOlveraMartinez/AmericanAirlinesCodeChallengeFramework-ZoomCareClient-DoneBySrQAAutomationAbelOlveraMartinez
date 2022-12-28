package test;
import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.americanAirlinesHomePageObjects;
import pages.americanAirlinesChooseFlightsPageObjects;

public class testId007 {
	//Initialize the Chrome Driver
	private static WebDriver driver= null;

	public static void main(String[] args) {

		//Executing TestCaseId007
		TestCaseId007();
	}



	public static void TestCaseId007() {
		//Create an object for the american Airlines Home Page Objects
		americanAirlinesHomePageObjects americanAirlinesHomePageObjects=new americanAirlinesHomePageObjects(driver); {
			//This test automation code challenge Framework for ZoomCare American Airlines was done by the Sr. QA Engineer in Automation Abel Olvera Martinez
			System.out.println("This test automation code challenge Framework for ZoomCare American Airlines was done by the Sr. QA Engineer in Automation Abel Olvera Martinez");
			//Obtaining the project Path
			String projectPath=System.getProperty("user.dir");
			System.out.println("The Project Path is: "+projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			//Print the Test Case Id and Test Case Title
			System.out.println("\nTest Case Id: 007"
					+ "\nTest Case Title:"
					+ "\nVerify that the American Airlines page allows to search for Flights from:"
					+ "\n* Country/Region: USA"
					+ "\n* State/Province: Alabama"
					+ "\n* City: Birmingham"
					+ "\n* Airport: Birmingham"
					+ "\n* airport code: BHM"
					+ "\nto:"
					+ "\n* Country/Region: Canada"
					+ "\n* State/Province: Nuevo Brunswick"
					+ "\n* City: Bathurst"
					+ "\n* Airport: Bathurst"
					+ "\n* airport code: ZBF"
					+ "\ncorrectly.");

			//Initialize the Chrome Driver
			driver= new ChromeDriver();
			//Set an Implicit Wait of 369 Seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(369));
			//Go to https://www.zoomcare.com/
			driver.get("https://www.aa.com/homePage.do");
			//Maximize the Chrome Navigator Window
			driver.manage().window().maximize();
			//Verify the American Airlines URL with an Assertion
			americanAirlinesHomePageObjects.expectedAmericanAirlinesURLAssertionResult(driver);
			//Verify the text of Get Out Of Search Label with an Assertion
			americanAirlinesHomePageObjects.getOutOfSearchLabelTextAssertionResult(driver);
			//Click on Get Out Of Search Dropdown Web Element
			americanAirlinesHomePageObjects.clickOnGetOutOfSearchDropdown(driver);
			//Click on Country/region Dropdown Web Element
			americanAirlinesHomePageObjects.clickOnCountryRegionDropdown(driver);
			//Verify the text of USA Country/region Dropdown Option with an Assertion
			americanAirlinesHomePageObjects.usaCountryRegionDropdownOptionTextAssertionResult(driver);
			//Click on USA Country/region Dropdown Option Web Element
			americanAirlinesHomePageObjects.clickOnUsaCountryRegionDropdownOption(driver);
			//Click on State Dropdown Web Element
			americanAirlinesHomePageObjects.clickOnStateDropdown(driver);
			//Verify the text of Alabama State Dropdown Option with an Assertion
			americanAirlinesHomePageObjects.alabamaStateDropdownOptionTextAssertionResult(driver);
			//Click on Alabama State Dropdown Option Web Element
			americanAirlinesHomePageObjects.clickOnAlabamaStateDropdownOption(driver);
			//Verify the text of BHM airport code with an Assertion
			americanAirlinesHomePageObjects.bhmAirportCodeTextAssertionResult(driver);
			//Click on BHM airport code Web Element
			americanAirlinesHomePageObjects.clickOnBhmAirportCode(driver);
			//Verify the text of Reach Search Label with an Assertion
			americanAirlinesHomePageObjects.reachSearchLabelTextAssertionResult(driver);
			//Click on Reach Search Dropdown Web Element
			americanAirlinesHomePageObjects.clickOnReachSearchDropdown(driver);
			//Click on Country/region Dropdown2 Web Element
			americanAirlinesHomePageObjects.clickOnCountryRegionDropdown2(driver);
			//Verify the text of Canada Country/region Dropdown Option with an Assertion
			americanAirlinesHomePageObjects.canadaCountryRegionDropdownOptionTextAssertionResult(driver);
			//Click on Canada Country/region Dropdown Option Web Element
			americanAirlinesHomePageObjects.clickOnCanadaCountryRegionDropdownOption(driver);
			//Click on Province Dropdown Web Element
			americanAirlinesHomePageObjects.clickOnProvinceDropdown(driver);

			//Verify the text of Nuevo Brunswick Province Dropdown Option with an Assertion
			americanAirlinesHomePageObjects.nuevoBrunswickProvinceDropdownOptionTextAssertionResult(driver);
			//Click on Nuevo Brunswick Province Dropdown Option Web Element
			americanAirlinesHomePageObjects.clickOnNuevoBrunswickProvinceDropdownOption(driver);
			//Verify the text of ZBF airport code with an Assertion
			americanAirlinesHomePageObjects.zbfAirportCodeTextAssertionResult(driver);
			//Click on ZBF airport code Web Element
			americanAirlinesHomePageObjects.clickOnZbfAirportCode(driver);

			//Click on Number of Passengers Dropdown Web Element
			americanAirlinesHomePageObjects.clickOnNumberOfPassengers(driver);
			//Verify the text of Number of Passengers Dropdown Option 1 with an Assertion
			americanAirlinesHomePageObjects.numberOfPassengersDropdownOption1TextAssertionResult(driver);
			//Click on Number of Passengers Dropdown Option 1 Web Element
			americanAirlinesHomePageObjects.clickOnNumberOfPassengersDropdownOption1(driver);
			//Click on Departure Date Calendar Time Slot Button Web Element
			americanAirlinesHomePageObjects.clickOnDepartureDateCalendarTimeSlotButton(driver);
			//Verify the text of Departure Date 2022 December 31 with an Assertion
			americanAirlinesHomePageObjects.departureDate2022December31TextAssertionResult(driver);
			//Click on Departure Date 2022 December 31 Web Element
			americanAirlinesHomePageObjects.clickOnDepartureDate2022December31(driver);
			//Click on Return Date Calendar Time Slot Button Web Element
			americanAirlinesHomePageObjects.clickOnReturnDateCalendarTimeSlotButton(driver);
			//Verify the text of Return Date 2023 January with an Assertion
			americanAirlinesHomePageObjects.returnDate2023January31TextAssertionResult(driver);
			//Click on Return Date 2023 January 31 Web Element
			americanAirlinesHomePageObjects.clickOnReturnDate2023January31(driver);
			//Verify the text of Search Flights Button with an Assertion
			americanAirlinesHomePageObjects.searchFlightsButtonTextAssertionResult(driver);
			//Click on Search Flights Button Web Element
			americanAirlinesHomePageObjects.clickOnSearchFlightsButton(driver);
			//Verify the text of Choose Flights Label with an Assertion
			americanAirlinesChooseFlightsPageObjects.getOutOfSearchLabelTextAssertionResultColumbiaBritanica(driver);
		}
		//Close Web Browser Navigator
		//driver.close();

		//Quit Web Browser Navigator
		driver.quit();

		//Print Test Case Divisor
		System.out.println("****************************************************************************************************************************************************");
	}


}
