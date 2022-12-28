package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class americanAirlinesHomePageObjects {
	//Variables
	//Initialize the Chrome Driver as null
	private static WebDriver driver= null;
	//Initialize the American Airlines URL web element as null
	private static Boolean expectedAmericanAirlinesURLAssertionResult=null;
	//Initialize the text of Get Out Of Search Label web element as null
	private static Boolean getOutOfSearchLabelTextAssertionResult=null;
	//Initialize the Get Out Of Search Dropdown web element as null
	private static WebElement getOutOfSearchDropdown=null;
	//Initialize the Country/region Dropdown web element as null
	private static WebElement countryRegionDropdown=null;	
	//Initialize the USA Country/region Dropdown Option Text web element as null
	private static Boolean usaCountryRegionDropdownOptionTextAssertionResult=null;
	//Initialize the USA Country/region Dropdown Option web element as null
	private static WebElement usaCountryRegionDropdownOption=null;
	//Initialize theState Dropdown web element as null
	private static WebElement stateDropdown=null;
	//Initialize the Alabama State Dropdown Option Text web element as null
	private static Boolean alabamaStateDropdownOptionTextAssertionResult=null;
	//Initialize the Alabama State Dropdown Option web element as null
	private static WebElement alabamaStateDropdownOption=null;
	//Initialize the BHM airport code Text web element as null
	private static Boolean bhmAirportCodeTextAssertionResult=null;
	//Initialize the BHM airport code web element as null
	private static WebElement bhmAirportCode=null;
	//Initialize the Reach Search Label web element as null
	private static WebElement reachSearchLabel=null;
	//Initialize the Reach Search Label Text web element as null
	private static Boolean reachSearchLabelTextAssertionResult=null;
	//Initialize the Reach Search Dropdown web element as null
	private static WebElement reachSearchDropdown=null;
	//Initialize the Country/region Dropdown2 web element as null
	private static WebElement countryRegionDropdown2=null;
	//Initialize the Canada Country/region Dropdown Option Text web element as null
	private static Boolean canadaCountryRegionDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Country/region Dropdown Option web element as null
	private static WebElement canadaCountryRegionDropdownOption=null;
	//Initialize the Province Dropdown web element as null
	private static WebElement provinceDropdown=null;



	//ALBERTA CANADA
	//Initialize the Canada Alberta Province Dropdown Option Text web element as null
	private static Boolean albertaProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Alberta Province Dropdown Option web element as null
	private static WebElement albertaProvinceDropdownOption=null;
	//Initialize the YYC airport code Text web element as null
	private static Boolean yycAirportCodeTextAssertionResult=null;
	//Initialize the YYC airport code web element as null
	private static WebElement yycAirportCode=null;

	//TERRITORIOS DEL NOROESTE
	//Initialize the Canada Territorios del Noroeste Province Dropdown Option Text web element as null
	private static Boolean territoriosDelNoroesteProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Territorios del Noroeste Province Dropdown Option web element as null
	private static WebElement territoriosDelNoroesteProvinceDropdownOption=null;
	//Initialize the LAK airport code Text web element as null
	private static Boolean lakAirportCodeTextAssertionResult=null;
	//Initialize the LAK airport code web element as null
	private static WebElement lakAirportCode=null;

	//COLUMBIA BRITÁNICA
	//Initialize the Canada Columbia Británica Province Dropdown Option Text web element as null
	private static Boolean columbiaBritanicaProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Columbia Británica Province Dropdown Option web element as null
	private static WebElement columbiaBritanicaProvinceDropdownOption=null;
	//Initialize the YXX airport code Text web element as null
	private static Boolean yxxAirportCodeTextAssertionResult=null;
	//Initialize the YXX airport code web element as null
	private static WebElement yxxAirportCode=null;

	//ONTARIO
	//Initialize the Canada Ontario Province Dropdown Option Text web element as null
	private static Boolean ontarioProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Ontario Province Dropdown Option web element as null
	private static WebElement ontarioProvinceDropdownOption=null;
	//Initialize the YAX airport code Text web element as null
	private static Boolean yaxAirportCodeTextAssertionResult=null;
	//Initialize the YAX airport code web element as null
	private static WebElement yaxAirportCode=null;

	//MANITOBA
	//Initialize the Canada Manitoba Province Dropdown Option Text web element as null
	private static Boolean manitobaProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Manitoba Province Dropdown Option web element as null
	private static WebElement manitobaProvinceDropdownOption=null;
	//Initialize the YBV airport code Text web element as null
	private static Boolean ybvAirportCodeTextAssertionResult=null;
	//Initialize the YBV airport code web element as null
	private static WebElement ybvAirportCode=null;

	//ISLA DEL PRINCIPE EDUARDO
	//Initialize the Canada Isla del Príncipe Eduardo Province Dropdown Option Text web element as null
	private static Boolean islaDelPrincipeEduardoProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Isla del Príncipe Eduardo Province Dropdown Option web element as null
	private static WebElement islaDelPrincipeEduardoProvinceDropdownOption=null;
	//Initialize the YYG airport code Text web element as null
	private static Boolean yygAirportCodeTextAssertionResult=null;
	//Initialize the YYG airport code web element as null
	private static WebElement yygAirportCode=null;

	//NUEVO BRUNSWICK
	//Initialize the Canada Nuevo Brunswick Province Dropdown Option Text web element as null
	private static Boolean nuevoBrunswickProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Nuevo Brunswick Province Dropdown Option web element as null
	private static WebElement nuevoBrunswickProvinceDropdownOption=null;
	//Initialize the ZBF airport code Text web element as null
	private static Boolean zbfAirportCodeTextAssertionResult=null;
	//Initialize the ZBF airport code web element as null
	private static WebElement zbfAirportCode=null;

	//TERRITORIO NUNAVUT
	//Initialize the Canada Territorio Nunavut Province Dropdown Option Text web element as null
	private static Boolean territorioNunavutProvinceDropdownOptionTextAssertionResult=null;
	//Initialize the Canada Territorio Nunavut Province Dropdown Option web element as null
	private static WebElement territorioNunavutProvinceDropdownOption=null;
	//Initialize the YEK airport code Text web element as null
	private static Boolean yekAirportCodeTextAssertionResult=null;
	//Initialize the YEK airport code web element as null
	private static WebElement yekAirportCode=null;



	//Initialize the Number of Passengers Dropdown web element as null
	private static WebElement numberOfPassengers=null;
	//Initialize the Number of Passengers Dropdown Option 1 Text web element as null
	private static Boolean numberOfPassengersDropdownOption1TextAssertionResult=null;
	//Initialize the Number of Passengers Dropdown Option 1 web element as null
	private static WebElement numberOfPassengersDropdownOption1=null;
	//Initialize the Departure date Calendar Time Slot Button web element as null
	private static WebElement departureDateCalendarTimeSlotButton=null;
	//Initialize the Departure Date 2022 December 31 Text web element as null
	private static Boolean departureDate2022December31TextAssertionResult=null;
	//Initialize the Departure Date 2022 December 31 web element as null
	private static WebElement departureDate2022December31=null;
	//Initialize the Return date Calendar Time Slot Button web element as null
	private static WebElement returnDateCalendarTimeSlotButton=null;
	//Initialize the Return Date 2023 January 31 Text web element as null
	private static Boolean returnDate2023January31TextAssertionResult=null;
	//Initialize the Return Date 2023 January 31 web element as null
	private static WebElement returnDate2023January31=null;
	//Initialize the Search Flights Button Text web element as null
	private static Boolean searchFlightsButtonTextAssertionResult=null;
	//Initialize the Search Flights Button web element as null
	private static WebElement searchFlightsButton=null;



	//METHODS
	//Method for Verify the American Airlines URL with an Assertion
	public static boolean expectedAmericanAirlinesURLAssertionResult(WebDriver driver) {
		/*Save the Expected American Airlines URL in a String Variable (When the page is visit
			 from México location it musts redirect to "https://www.aa.com/homePage.do?locale=es_MX")*/
		String expectedAmericanAirlinesURL="https://www.aa.com/homePage.do?locale=es_MX";

		//Print the Expected American Airlines URL
		System.out.println("\nThe Expected American Airlines URL is: "+expectedAmericanAirlinesURL);

		//Obtaining the Current URL and parse to String to compare with the Expected American Airlines URL
		String currentURL=driver.getCurrentUrl().toString();

		//Print the Current URL
		System.out.println("\nThe Current URL is: "+currentURL);

		/*Verify the American Airlines URL with an Assertion
			Comparing the current URL with the expected American Airlines URL*/
		//Assert.assertTrue(currentURL.contains(expectedAmericanAirlinesURL));
		boolean expectedAmericanAirlinesURLAssertionResult = false;
		try {
			assertEquals(expectedAmericanAirlinesURL, currentURL);
			expectedAmericanAirlinesURLAssertionResult = true;
			System.out.println("\nThe expected American Airlines URL is equal to current URL."
					+ "\nThe navigator shows the expected American Airlines URL page Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected American Airlines URL isn't equal to current URL."
					+ "\nThe navigator doesn't show the expected American Airlines URL page Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return expectedAmericanAirlinesURLAssertionResult;
	}
	//Method for Verify the text of Get Out Of Search Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Get Out Of Search Label became clickable - timeout in 369 seconds
		//Save the Get Out Of Search Label Locator in a Web Element
		WebElement getOutOfSearchLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[3]/div[1]/div/label")));

		//Save the expected text of Get Out Of Search Label in a String
		String getOutOfSearchLabelExpectedText="Salir de";

		//Print the text of Get Out Of Search Label to compare with the expected Get Out Of Search Label text
		System.out.println("\nThe expected text of Get Out Of Search Label is: "+getOutOfSearchLabelExpectedText);

		//Save the current text of Get Out Of Search Label in a string to compare with the expected Get Out Of Search Dropdown text
		String getOutOfSearchLabelCurrentText=getOutOfSearchLabel.getText();

		//Print the current text of Get Out Of Search Label to compare with the expected Get Out Of Search Dropdown text
		System.out.println("\nThe current text of Get Out Of Search Label is: "+getOutOfSearchLabelCurrentText);

		/*Verify the text of Get Out Of Search Label with an Assertion
		Comparing the current text of Get Out Of Search Label with the expected text of Get Out Of Search Label*/
		boolean getOutOfSearchLabelTextAssertionResult = false;
		try {
			assertEquals(getOutOfSearchLabelExpectedText, getOutOfSearchLabelCurrentText);
			getOutOfSearchLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Get Out Of Search Label is equal to current text of Get Out Of Search Label."
					+ "\nThe navigator shows the expected text of Get Out Of Search Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Get Out Of Search Label isn't equal to current text of Get Out Of Search Label."
					+ "\nThe navigator doesn´t show the expected text of Get Out Of Search Label Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return getOutOfSearchLabelTextAssertionResult;
	}

	//Method for Click on Get Out Of Search Dropdown Web Element
	public static WebElement clickOnGetOutOfSearchDropdown(WebDriver driver) {
		//Initialize and wait till Get Out Of Search Dropdown became clickable - timeout in 369 seconds
		//Save the Get Out Of Search Dropdown Locator in a Web Element
		getOutOfSearchDropdown = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[3]/div[1]/div/a/span[1]")));
		getOutOfSearchDropdown.click();
		//Return the Web Element
		return getOutOfSearchDropdown;
	}
	//Method for Click on Country/region Dropdown Web Element
	public static WebElement clickOnCountryRegionDropdown(WebDriver driver) {
		//Initialize and wait till Country/region Dropdown became clickable - timeout in 369 seconds
		//Save the Country/region Dropdown Locator in a Web Element
		WebElement countryRegionDropdown = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("countryCode")));
		countryRegionDropdown.click();
		//Return the Web Element
		return countryRegionDropdown;
	}
	//Method for Verify the text of USA Country/region Dropdown Option with an Assertion
	public static boolean usaCountryRegionDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till USA Country/region Dropdown Option became clickable - timeout in 369 seconds
		//Save the USA Country/region Dropdown Option Locator in a Web Element
		WebElement usaCountryRegionDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[1]/label/select/option[2]")));

		//Save the expected text of USA Country/region Dropdown Option in a String
		String usaCountryRegionDropdownOptionExpectedText="Estados Unidos";

		//Print the text of USA Country/region Dropdown Option to compare with the expected USA Country/region Dropdown Option text
		System.out.println("\nThe expected text of USA Country/region Dropdown Option is: "+usaCountryRegionDropdownOptionExpectedText);

		//Save the current text of USA Country/region Dropdown Option in a string to compare with the expected USA Country/region Dropdown Option text
		String usaCountryRegionDropdownOptionCurrentText=usaCountryRegionDropdownOption.getText();

		//Print the current text of USA Country/region Dropdown Option in a string to compare with the expected USA Country/region Dropdown Option text
		System.out.println("\nThe current text of USA Country/region Dropdown Option is: "+usaCountryRegionDropdownOptionCurrentText);

		/*Verify the text of USA Country/region Dropdown Option with an Assertion
						Comparing the current text of USA Country/region Dropdown Option with the expected text of USA Country/region Dropdown Option*/
		boolean usaCountryRegionDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(usaCountryRegionDropdownOptionExpectedText, usaCountryRegionDropdownOptionCurrentText);
			usaCountryRegionDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of USA Country/region Dropdown Option is equal to current text of USA Country/region Dropdown Option."
					+ "\nThe navigator shows the expected text of USA Country/region Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of USA Country/region Dropdown Option isn't equal to current text of USA Country/region Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of USA Country/region Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return usaCountryRegionDropdownOptionTextAssertionResult;
	}
	//Method for Click on USA Country/region Dropdown Option Web Element
	public static WebElement clickOnUsaCountryRegionDropdownOption(WebDriver driver) {
		//Initialize and wait till USA Country/region Dropdown Option became clickable - timeout in 369 seconds
		//Save the USA Country/region Dropdown Option Locator in a Web Element
		WebElement usaCountryRegionDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[1]/label/select/option[2]")));
		usaCountryRegionDropdownOption.click();
		//Return the Web Element
		return stateDropdown;
	}
	//Method for Click on State Dropdown Web Element
	public static WebElement clickOnStateDropdown(WebDriver driver) {
		//Initialize and wait till Country/region Dropdown became clickable - timeout in 369 seconds
		//Save the Country/region Dropdown Locator in a Web Element
		WebElement stateDropdown = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("countryCode")));
		stateDropdown.click();
		//Return the Web Element
		return stateDropdown;
	}
	//Method for Verify the text of Alabama State Dropdown Option with an Assertion
	public static boolean alabamaStateDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Alabama State Dropdown Option became clickable - timeout in 369 seconds
		//Save the Alabama State Dropdown Option Locator in a Web Element
		WebElement alabamaStateDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[2]")));

		//Save the expected text of Alabama State Dropdown Option in a String
		String alabamaStateDropdownOptionExpectedText="Alabama";

		//Print the text of Alabama State Dropdown Option to compare with the expected Alabama State Dropdown Option text
		System.out.println("\nThe expected text of Alabama State Dropdown Option is: "+alabamaStateDropdownOptionExpectedText);

		//Save the current text of Alabama State Dropdown Option in a string to compare with the expected Alabama State Dropdown Option text
		String alabamaStateDropdownOptionCurrentText=alabamaStateDropdownOption.getText();

		//Print the current text of Alabama State Dropdown Option in a string to compare with the expected Alabama State Dropdown Option text
		System.out.println("\nThe current text of Alabama State Dropdown Option is: "+alabamaStateDropdownOptionCurrentText);

		/*Verify the text of Alabama State Dropdown Option with an Assertion
				Comparing the current text of Alabama State Dropdown Option with the expected text of Alabama State Dropdown Option*/
		boolean alabamaStateDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(alabamaStateDropdownOptionExpectedText, alabamaStateDropdownOptionCurrentText);
			alabamaStateDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Alabama State Dropdown Option is equal to current text of Alabama State Dropdown Option."
					+ "\nThe navigator shows the expected text of Alabama State Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Alabama State Dropdown Option isn't equal to current text of Alabama State Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Alabama State Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return alabamaStateDropdownOptionTextAssertionResult;
	}
	//Method for Click on Alabama State Dropdown Option Web Element
	public static WebElement clickOnAlabamaStateDropdownOption(WebDriver driver) {
		//Initialize and wait till Alabama State Dropdown Option became clickable - timeout in 369 seconds
		//Save the Alabama State Dropdown Option Locator in a Web Element
		WebElement alabamaStateDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[2]")));
		alabamaStateDropdownOption.click();
		/*
		//Send the Escape key
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");*/
		//Return the Web Element
		return alabamaStateDropdownOption;
	}
	//Method for Verify the text of BHM airport code with an Assertion
	public static boolean bhmAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till BHM airport code became clickable - timeout in 369 seconds
		//Save the BHM airport code Locator in a Web Element
		WebElement bhmAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of BHM airport code in a String
		String bhmAirportCodeExpectedText="BHM";

		//Print the text of BHM airport code to compare with the expected BHM airport code text
		System.out.println("\nThe expected text of BHM airport code is: "+bhmAirportCodeExpectedText);

		//Save the current text of BHM airport code in a string to compare with the expected BHM airport code text
		String bhmAirportCodeCurrentText=bhmAirportCode.getText();

		//Print the current text of BHM airport code in a string to compare with the expected BHM airport code text
		System.out.println("\nThe current text of BHM airport code is: "+bhmAirportCodeCurrentText);

		/*Verify the text of BHM airport code with an Assertion
				Comparing the current text of BHM airport code with the expected text of BHM airport code*/
		boolean bhmAirportCodeTextAssertionResult = false;
		try {
			assertEquals(bhmAirportCodeExpectedText, bhmAirportCodeCurrentText);
			bhmAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of BHM airport code is equal to current text of BHM airport code."
					+ "\nThe navigator shows the expected text of BHM airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of BHM airport code isn't equal to current text of BHM airport code."
					+ "\nThe navigator doesn´t show the expected text of BHM airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return bhmAirportCodeTextAssertionResult;
	}
	//Method for Click on BHM airport code Web Element
	public static WebElement clickOnBhmAirportCode(WebDriver driver) {
		//Initialize and wait till BHM airport code became clickable - timeout in 369 seconds
		//Save the BHM airport code Locator in a Web Element
		WebElement bhmAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		bhmAirportCode.click();
		//Return the Web Element
		return bhmAirportCode;
	}
	//Method for Verify the text of Reach Search Label with an Assertion
	public static boolean reachSearchLabelTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Reach Search Label became clickable - timeout in 369 seconds
		//Save the Reach Search Label Locator in a Web Element
		WebElement reachSearchLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[3]/div[2]/div/label")));

		//Save the expected text of Reach Search Label in a String
		String reachSearchLabelExpectedText="Llegar a";

		//Print the text of Reach Search Label to compare with the expected Reach Search Label text
		System.out.println("\nThe expected text of Reach Search Label is: "+reachSearchLabelExpectedText);

		//Save the current text of Reach Search Label in a string to compare with the expected Reach Search Label text
		String reachSearchLabelCurrentText=reachSearchLabel.getText();

		//Print the current text of Reach Search Label in a string to compare with the expected Reach Search Label text
		System.out.println("\nThe current text of Reach Search Label is: "+reachSearchLabelCurrentText);

		/*Verify the text of Reach Search Label with an Assertion
						Comparing the current text of Reach Search Label with the expected text of Reach Search Label*/
		boolean reachSearchLabelTextAssertionResult = false;
		try {
			assertEquals(reachSearchLabelExpectedText, reachSearchLabelCurrentText);
			reachSearchLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Reach Search Label is equal to current text of Reach Search Label."
					+ "\nThe navigator shows the expected text of Reach Search Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Reach Search Label isn't equal to current text of Reach Search Label."
					+ "\nThe navigator doesn´t show the expected text of Reach Search Label Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return reachSearchLabelTextAssertionResult;
	}
	//Method for Click on Reach Search Dropdown Web Element
	public static WebElement clickOnReachSearchDropdown(WebDriver driver) {
		//Initialize and wait till Reach Search Dropdown became clickable - timeout in 369 seconds
		//Save the Reach Search Label Locator in a Web Element
		WebElement reachSearchDropdown = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[3]/div[2]/div/a/span[1]")));
		reachSearchDropdown.click();
		//Return the Web Element
		return reachSearchDropdown;
	}
	//Method for Click on Country/region Dropdown2 Web Element
	public static WebElement clickOnCountryRegionDropdown2(WebDriver driver) {
		//Initialize and wait till Country/region Dropdown2 became clickable - timeout in 369 seconds
		//Save the Country/region Dropdown2 Locator in a Web Element
		WebElement countryRegionDropdown2 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("countryCode")));
		countryRegionDropdown2.click();
		//Return the Web Element
		return countryRegionDropdown2;
	}
	//Method for Verify the text of Canada Country/region Dropdown Option with an Assertion
	public static boolean canadaCountryRegionDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Canada Country/region Dropdown Option became clickable - timeout in 369 seconds
		//Save the Canada Country/region Dropdown Option Locator in a Web Element
		WebElement canadaCountryRegionDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[1]/label/select/option[3]")));

		//Save the expected text of Canada Country/region Dropdown Option in a String
		String canadaCountryRegionDropdownOptionExpectedText="Canadá";

		//Print the text of Canada Country/region Dropdown Option to compare with the expected Canada Country/region Dropdown Option text
		System.out.println("\nThe expected text of Canada Country/region Dropdown Option is: "+canadaCountryRegionDropdownOptionExpectedText);

		//Save the current text of Canada Country/region Dropdown Option in a string to compare with the expected Canada Country/region Dropdown Option text
		String canadaCountryRegionDropdownOptionCurrentText=canadaCountryRegionDropdownOption.getText();

		//Print the current text of Canada Country/region Dropdown Option in a string to compare with the expected Canada Country/region Dropdown Option text
		System.out.println("\nThe current text of Canada Country/region Dropdown Option is: "+canadaCountryRegionDropdownOptionCurrentText);

		/*Verify the text of Canada Country/region Dropdown Option with an Assertion
				Comparing the current text of Canada Country/region Dropdown Option with the expected text of Canada Country/region Dropdown Option*/
		boolean canadaCountryRegionDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(canadaCountryRegionDropdownOptionExpectedText, canadaCountryRegionDropdownOptionCurrentText);
			canadaCountryRegionDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Canada Country/region Dropdown Option is equal to current text of Canada Country/region Dropdown Option."
					+ "\nThe navigator shows the expected text of Canada Country/region Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Canada Country/region Dropdown Option isn't equal to current text of Canada Country/region Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Canada Country/region Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return canadaCountryRegionDropdownOptionTextAssertionResult;
	}
	//Method for Click on Canada Country/region Dropdown Option Web Element
	public static WebElement clickOnCanadaCountryRegionDropdownOption(WebDriver driver) {
		//Initialize and wait till Canada Country/region Dropdown Option became clickable - timeout in 369 seconds
		//Save the Canada Country/region Dropdown Option Locator in a Web Element
		WebElement canadaCountryRegionDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[1]/label/select/option[3]")));
		canadaCountryRegionDropdownOption.click();
		//Return the Web Element
		return canadaCountryRegionDropdownOption;
	}
	//Method for Click on Province Dropdown Web Element
	public static WebElement clickOnProvinceDropdown(WebDriver driver) {
		//Initialize and wait till Province Dropdown became clickable - timeout in 369 seconds
		//Save the Province Dropdown Locator in a Web Element
		WebElement provinceDropdown = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("stateCode")));
		provinceDropdown.click();
		//Return the Web Element
		return provinceDropdown;
	}



	//ALBERTA CANADA
	//Method for Verify the text of Alberta Province Dropdown Option with an Assertion
	public static boolean albertaProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Alberta Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Alberta Province Dropdown Option Locator in a Web Element
		WebElement albertaProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[2]")));

		//Save the expected text of Alberta Province Dropdown Option in a String
		String albertaProvinceDropdownOptionExpectedText="Alberta";

		//Print the text of Alberta Province Dropdown Option to compare with the expected Alberta Province Dropdown Option text
		System.out.println("\nThe expected text of Alberta Province Dropdown Option is: "+albertaProvinceDropdownOptionExpectedText);

		//Save the current text of Alberta Province Dropdown Option in a string to compare with the expected Alberta Province Dropdown Option text
		String albertaProvinceDropdownOptionCurrentText=albertaProvinceDropdownOption.getText();

		//Print the current text of Alberta Province Dropdown Option in a string to compare with the expected Alberta Province Dropdown Option text
		System.out.println("\nThe current text of Alberta Province Dropdown Option is: "+albertaProvinceDropdownOptionCurrentText);

		/*Verify the text of Alberta Province Dropdown Option with an Assertion
						Comparing the current text of Alberta Province Dropdown Option with the expected text of Alberta Province Dropdown Option*/
		boolean albertaProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(albertaProvinceDropdownOptionExpectedText, albertaProvinceDropdownOptionCurrentText);
			albertaProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Alberta Province Dropdown Option is equal to current text of Alberta Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Alberta Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Alberta Province Dropdown Option isn't equal to current text of Alberta Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Alberta Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return albertaProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Alberta Province Dropdown Option Web Element
	public static WebElement clickOnAlbertaProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Alberta Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Alberta Province Dropdown Option Locator in a Web Element
		WebElement albertaProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[2]")));
		albertaProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return albertaProvinceDropdownOption;
	}
	//Method for Verify the text of YYC airport code with an Assertion
	public static boolean yycAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till YYC airport code became clickable - timeout in 369 seconds
		//Save the BHM airport code Locator in a Web Element
		WebElement yycAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of YYC airport code in a String
		String yycAirportCodeExpectedText="YYC";

		//Print the text of YYC airport code to compare with the expected YYC airport code text
		System.out.println("\nThe expected text of YYC airport code is: "+yycAirportCodeExpectedText);

		//Save the current text of YYC airport code in a string to compare with the expected YYC airport code text
		String yycAirportCodeCurrentText=yycAirportCode.getText();

		//Print the current text of YYC airport code in a string to compare with the expected YYC airport code text
		System.out.println("\nThe current text of YYC airport code is: "+yycAirportCodeCurrentText);

		/*Verify the text of YYC airport code with an Assertion
						Comparing the current text of YYC airport code with the expected text of YYC airport code*/
		boolean yycAirportCodeTextAssertionResult = false;
		try {
			assertEquals(yycAirportCodeExpectedText, yycAirportCodeCurrentText);
			yycAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of YYC airport code is equal to current text of YYC airport code."
					+ "\nThe navigator shows the expected text of YYC airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of YYC airport code isn't equal to current text of YYC airport code."
					+ "\nThe navigator doesn´t show the expected text of YYC airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return yycAirportCodeTextAssertionResult;
	}
	//Method for Click on YYC airport code Web Element
	public static WebElement clickOnYycAirportCode(WebDriver driver) {
		//Initialize and wait till YYC airport code became clickable - timeout in 369 seconds
		//Save the BHM airport code Locator in a Web Element
		WebElement yycAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		yycAirportCode.click();
		//Return the Web Element
		return yycAirportCode;
	}

	//TERRITORIOS DEL NOROESTE
	//Method for Verify the text of Territorios del Noroeste Province Dropdown Option with an Assertion
	public static boolean territoriosDelNoroesteProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Territorios del Noroeste Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Territorios del Noroeste Province Dropdown Option Locator in a Web Element
		WebElement territoriosDelNoroesteProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[3]")));

		//Save the expected text of Territorios del Noroeste Province Dropdown Option in a String
		String territoriosDelNoroesteProvinceDropdownOptionExpectedText="Territorios del Noroeste";

		//Print the text of Territorios del Noroeste Province Dropdown Option to compare with the expected Territorios del Noroeste Province Dropdown Option text
		System.out.println("\nThe expected text of Territorios del Noroeste Province Dropdown Option is: "+territoriosDelNoroesteProvinceDropdownOptionExpectedText);

		//Save the current text of Territorios del Noroeste Province Dropdown Option in a string to compare with the expected Territorios del Noroeste Province Dropdown Option text
		String territoriosDelNoroesteProvinceDropdownOptionCurrentText=territoriosDelNoroesteProvinceDropdownOption.getText();

		//Print the current text of Territorios del Noroeste Province Dropdown Option in a string to compare with the expected Territorios del Noroeste Province Dropdown Option text
		System.out.println("\nThe current text of Territorios del Noroeste Province Dropdown Option is: "+territoriosDelNoroesteProvinceDropdownOptionCurrentText);

		/*Verify the text of Territorios del Noroeste Province Dropdown Option with an Assertion
			Comparing the current text of Territorios del Noroeste Province Dropdown Option with the expected text of Territorios del Noroeste Province Dropdown Option*/
		boolean territoriosDelNoroesteProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(territoriosDelNoroesteProvinceDropdownOptionExpectedText, territoriosDelNoroesteProvinceDropdownOptionCurrentText);
			territoriosDelNoroesteProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Territorios del Noroeste Province Dropdown Option is equal to current text of Territorios del Noroeste Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Territorios del Noroeste Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Territorios del Noroeste Province Dropdown Option isn't equal to current text of Territorios del Noroeste Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Territorios del Noroeste Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return territoriosDelNoroesteProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Territorios del Noroeste Province Dropdown Option Web Element
	public static WebElement clickOnTerritoriosDelNoroesteProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Territorios del Noroeste Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Territorios del Noroeste Province Dropdown Option Locator in a Web Element
		WebElement territoriosDelNoroesteProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[3]")));
		territoriosDelNoroesteProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return territoriosDelNoroesteProvinceDropdownOption;
	}
	//Method for Verify the text of LAK airport code with an Assertion
	public static boolean lakAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till LAK airport code became clickable - timeout in 369 seconds
		//Save the LAK airport code Locator in a Web Element
		WebElement lakAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of LAK airport code in a String
		String lakAirportCodeExpectedText="LAK";

		//Print the text of LAK airport code to compare with the expected LAK airport code text
		System.out.println("\nThe expected text of LAK airport code is: "+lakAirportCodeExpectedText);

		//Save the current text of LAK airport code in a string to compare with the expected LAK airport code text
		String lakAirportCodeCurrentText=lakAirportCode.getText();

		//Print the current text of LAK airport code in a string to compare with the expected LAK airport code text
		System.out.println("\nThe current text of LAK airport code is: "+lakAirportCodeCurrentText);

		/*Verify the text of LAK airport code with an Assertion
			Comparing the current text of LAK airport code with the expected text of LAK airport code*/
		boolean lakAirportCodeTextAssertionResult = false;
		try {
			assertEquals(lakAirportCodeExpectedText, lakAirportCodeCurrentText);
			lakAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of LAK airport code is equal to current text of LAK airport code."
					+ "\nThe navigator shows the expected text of LAK airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of LAK airport code isn't equal to current text of LAK airport code."
					+ "\nThe navigator doesn´t show the expected text of LAK airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return lakAirportCodeTextAssertionResult;
	}
	//Method for Click on LAK airport code Web Element
	public static WebElement clickOnLakAirportCode(WebDriver driver) {
		//Initialize and wait till LAK airport code became clickable - timeout in 369 seconds
		//Save the LAK airport code Locator in a Web Element
		WebElement lakAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		lakAirportCode.click();
		//Return the Web Element
		return lakAirportCode;
	}

	//COLUMBIA BRITÁNICA
	//Method for Verify the text of Columbia Británica Province Dropdown Option with an Assertion
	public static boolean columbiaBritanicaProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Columbia Británica Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Columbia Británica Province Dropdown Option Locator in a Web Element
		WebElement columbiaBritanicaProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[4]")));

		//Save the expected text of Columbia Británica Province Dropdown Option in a String
		String columbiaBritanicaProvinceDropdownOptionExpectedText="Columbia Británica";

		//Print the text of Columbia Británica Province Dropdown Option to compare with the expected Columbia Británica Province Dropdown Option text
		System.out.println("\nThe expected text of Columbia Británica Province Dropdown Option is: "+columbiaBritanicaProvinceDropdownOptionExpectedText);

		//Save the current text of Columbia Británica Province Dropdown Option in a string to compare with the expected Columbia Británica Province Dropdown Option text
		String columbiaBritanicaProvinceDropdownOptionCurrentText=columbiaBritanicaProvinceDropdownOption.getText();

		//Print the current text of Columbia Británica Province Dropdown Option in a string to compare with the expected Columbia Británica Province Dropdown Option text
		System.out.println("\nThe current text of Columbia Británica Province Dropdown Option is: "+columbiaBritanicaProvinceDropdownOptionCurrentText);

		/*Verify the text of Columbia Británica Province Dropdown Option with an Assertion
		Comparing the current text of Columbia Británica Province Dropdown Option with the expected text of Columbia Británica Province Dropdown Option*/
		boolean columbiaBritanicaProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(columbiaBritanicaProvinceDropdownOptionExpectedText, columbiaBritanicaProvinceDropdownOptionCurrentText);
			columbiaBritanicaProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Columbia Británica Province Dropdown Option is equal to current text of Columbia Británica Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Columbia Británica Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Columbia Británica Province Dropdown Option isn't equal to current text of Columbia Británica Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Columbia Británica Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return columbiaBritanicaProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Columbia Británica Province Dropdown Option Web Element
	public static WebElement clickOnColumbiaBritanicaProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Columbia Británica Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Columbia Británica Province Dropdown Option Locator in a Web Element
		WebElement columbiaBritanicaProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[4]")));
		columbiaBritanicaProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return columbiaBritanicaProvinceDropdownOption;
	}
	//Method for Verify the text of YXX airport code with an Assertion
	public static boolean yxxAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till YXX airport code became clickable - timeout in 369 seconds
		//Save the YXX airport code Locator in a Web Element
		WebElement yxxAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of YXX airport code in a String
		String yxxAirportCodeExpectedText="YXX";

		//Print the text of YXX airport code to compare with the expected YXX airport code text
		System.out.println("\nThe expected text of YXX airport code is: "+yxxAirportCodeExpectedText);

		//Save the current text of YXX airport code in a string to compare with the expected YXX airport code text
		String yxxAirportCodeCurrentText=yxxAirportCode.getText();

		//Print the current text of YXX airport code in a string to compare with the expected YXX airport code text
		System.out.println("\nThe current text of YXX airport code is: "+yxxAirportCodeCurrentText);

		/*Verify the text of YXX airport code with an Assertion
		Comparing the current text of YXX airport code with the expected text of YXX airport code*/
		boolean yxxAirportCodeTextAssertionResult = false;
		try {
			assertEquals(yxxAirportCodeExpectedText, yxxAirportCodeCurrentText);
			yxxAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of YXX airport code is equal to current text of YXX airport code."
					+ "\nThe navigator shows the expected text of YXX airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of YXX airport code isn't equal to current text of YXX airport code."
					+ "\nThe navigator doesn´t show the expected text of YXX airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return yxxAirportCodeTextAssertionResult;
	}
	//Method for Click on YXX airport code Web Element
	public static WebElement clickOnYxxAirportCode(WebDriver driver) {
		//Initialize and wait till YXX airport code became clickable - timeout in 369 seconds
		//Save the YXX airport code Locator in a Web Element
		WebElement yxxAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		yxxAirportCode.click();
		//Return the Web Element
		return yxxAirportCode;
	}

	//ONTARIO
	//Method for Verify the text of Ontario Province Dropdown Option with an Assertion
	public static boolean ontarioProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Ontario Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Ontario Province Dropdown Option Locator in a Web Element
		WebElement ontarioProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[5]")));

		//Save the expected text of Ontario Province Dropdown Option in a String
		String ontarioProvinceDropdownOptionExpectedText="Ontario";

		//Print the text of Ontario Province Dropdown Option to compare with the expected Ontario Province Dropdown Option text
		System.out.println("\nThe expected text of Ontario Province Dropdown Option is: "+ontarioProvinceDropdownOptionExpectedText);

		//Save the current text of Ontario Province Dropdown Option in a string to compare with the expected Ontario Province Dropdown Option text
		String ontarioProvinceDropdownOptionCurrentText=ontarioProvinceDropdownOption.getText();

		//Print the current text of Ontario Province Dropdown Option in a string to compare with the expected Ontario Province Dropdown Option text
		System.out.println("\nThe current text of Ontario Province Dropdown Option is: "+ontarioProvinceDropdownOptionCurrentText);

		/*Verify the text of Ontario Province Dropdown Option with an Assertion
			Comparing the current text of Ontario Province Dropdown Option with the expected text of Ontario Province Dropdown Option*/
		boolean ontarioProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(ontarioProvinceDropdownOptionExpectedText, ontarioProvinceDropdownOptionCurrentText);
			ontarioProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Ontario Province Dropdown Option is equal to current text of Ontario Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Ontario Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Ontario Province Dropdown Option isn't equal to current text of Ontario Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Ontario Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return ontarioProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Ontario Province Dropdown Option Web Element
	public static WebElement clickOnOntarioProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Ontario Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Ontario Province Dropdown Option Locator in a Web Element
		WebElement ontarioProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[5]")));
		ontarioProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return ontarioProvinceDropdownOption;
	}
	//Method for Verify the text of YAX airport code with an Assertion
	public static boolean yaxAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till YAX airport code became clickable - timeout in 369 seconds
		//Save the YAX airport code Locator in a Web Element
		WebElement yaxAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of YAX airport code in a String
		String yaxAirportCodeExpectedText="YAX";

		//Print the text of YAX airport code to compare with the expected YAX airport code text
		System.out.println("\nThe expected text of YAX airport code is: "+yaxAirportCodeExpectedText);

		//Save the current text of YAX airport code in a string to compare with the expected YAX airport code text
		String yaxAirportCodeCurrentText=yaxAirportCode.getText();

		//Print the current text of YAX airport code in a string to compare with the expected YAX airport code text
		System.out.println("\nThe current text of YAX airport code is: "+yaxAirportCodeCurrentText);

		/*Verify the text of YAX airport code with an Assertion
			Comparing the current text of YAX airport code with the expected text of YAX airport code*/
		boolean yaxAirportCodeTextAssertionResult = false;
		try {
			assertEquals(yaxAirportCodeExpectedText, yaxAirportCodeCurrentText);
			yaxAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of YAX airport code is equal to current text of YAX airport code."
					+ "\nThe navigator shows the expected text of YAX airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of YAX airport code isn't equal to current text of YAX airport code."
					+ "\nThe navigator doesn´t show the expected text of YAX airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return yaxAirportCodeTextAssertionResult;
	}
	//Method for Click on YAX airport code Web Element
	public static WebElement clickOnYaxAirportCode(WebDriver driver) {
		//Initialize and wait till YAX airport code became clickable - timeout in 369 seconds
		//Save the YAX airport code Locator in a Web Element
		WebElement yaxAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		yaxAirportCode.click();
		//Return the Web Element
		return yaxAirportCode;
	}

	//MANITOBA
	//Method for Verify the text of Manitoba Province Dropdown Option with an Assertion
	public static boolean manitobaProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Manitoba Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Manitoba Province Dropdown Option Locator in a Web Element
		WebElement manitobaProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[6]")));

		//Save the expected text of Manitoba Province Dropdown Option in a String
		String manitobaProvinceDropdownOptionExpectedText="Manitoba";

		//Print the text of Manitoba Province Dropdown Option to compare with the expected Manitoba Province Dropdown Option text
		System.out.println("\nThe expected text of Manitoba Province Dropdown Option is: "+manitobaProvinceDropdownOptionExpectedText);

		//Save the current text of Manitoba Province Dropdown Option in a string to compare with the expected Manitoba Province Dropdown Option text
		String manitobaProvinceDropdownOptionCurrentText=manitobaProvinceDropdownOption.getText();

		//Print the current text of Manitoba Province Dropdown Option in a string to compare with the expected Manitoba Province Dropdown Option text
		System.out.println("\nThe current text of Manitoba Province Dropdown Option is: "+manitobaProvinceDropdownOptionCurrentText);

		/*Verify the text of Manitoba Province Dropdown Option with an Assertion
				Comparing the current text of Manitoba Province Dropdown Option with the expected text of Manitoba Province Dropdown Option*/
		boolean manitobaProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(manitobaProvinceDropdownOptionExpectedText, manitobaProvinceDropdownOptionCurrentText);
			manitobaProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Manitoba Province Dropdown Option is equal to current text of Manitoba Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Manitoba Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Manitoba Province Dropdown Option isn't equal to current text of Manitoba Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Manitoba Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return manitobaProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Manitoba Province Dropdown Option Web Element
	public static WebElement clickOnManitobaProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Manitoba Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Manitoba Province Dropdown Option Locator in a Web Element
		WebElement manitobaProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[6]")));
		manitobaProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return manitobaProvinceDropdownOption;
	}
	//Method for Verify the text of YBV airport code with an Assertion
	public static boolean ybvAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till YBV airport code became clickable - timeout in 369 seconds
		//Save the YBV airport code Locator in a Web Element
		WebElement ybvAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of YBV airport code in a String
		String ybvAirportCodeExpectedText="YBV";

		//Print the text of YBV airport code to compare with the expected YBV airport code text
		System.out.println("\nThe expected text of YBV airport code is: "+ybvAirportCodeExpectedText);

		//Save the current text of YBV airport code in a string to compare with the expected YBV airport code text
		String ybvAirportCodeCurrentText=ybvAirportCode.getText();

		//Print the current text of YBV airport code in a string to compare with the expected YBV airport code text
		System.out.println("\nThe current text of YBV airport code is: "+ybvAirportCodeCurrentText);

		/*Verify the text of YBV airport code with an Assertion
				Comparing the current text of YBV airport code with the expected text of YBV airport code*/
		boolean ybvAirportCodeTextAssertionResult = false;
		try {
			assertEquals(ybvAirportCodeExpectedText, ybvAirportCodeCurrentText);
			ybvAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of YBV airport code is equal to current text of YBV airport code."
					+ "\nThe navigator shows the expected text of YBV airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of YBV airport code isn't equal to current text of YBV airport code."
					+ "\nThe navigator doesn´t show the expected text of YBV airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return ybvAirportCodeTextAssertionResult;
	}
	//Method for Click on YBV airport code Web Element
	public static WebElement clickOnYbvAirportCode(WebDriver driver) {
		//Initialize and wait till YBV airport code became clickable - timeout in 369 seconds
		//Save the YBV airport code Locator in a Web Element
		WebElement ybvAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		ybvAirportCode.click();
		//Return the Web Element
		return ybvAirportCode;
	}

	//ISLA DEL PRÍNCIPE EDUARDO
	//Method for Verify the text of Isla del Príncipe Eduardo Province Dropdown Option with an Assertion
	public static boolean islaDelPrincipeEduardoProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Isla del Príncipe Eduardo Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Isla del Príncipe Eduardo Province Dropdown Option Locator in a Web Element
		WebElement islaDelPrincipeEduardoProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[7]")));

		//Save the expected text of Isla del Príncipe Eduardo Province Dropdown Option in a String
		String islaDelPrincipeEduardoProvinceDropdownOptionExpectedText="Isla del Príncipe Eduardo";

		//Print the text of Isla del Príncipe Eduardo Province Dropdown Option to compare with the expected Isla del Príncipe Eduardo Province Dropdown Option text
		System.out.println("\nThe expected text of Isla del Príncipe Eduardo Province Dropdown Option is: "+islaDelPrincipeEduardoProvinceDropdownOptionExpectedText);

		//Save the current text of Isla del Príncipe Eduardo Province Dropdown Option in a string to compare with the expected Isla del Príncipe Eduardo Province Dropdown Option text
		String islaDelPrincipeEduardoProvinceDropdownOptionCurrentText=islaDelPrincipeEduardoProvinceDropdownOption.getText();

		//Print the current text of Isla del Príncipe Eduardo Province Dropdown Option in a string to compare with the expected Isla del Príncipe Eduardo Province Dropdown Option text
		System.out.println("\nThe current text of Isla del Príncipe Eduardo Province Dropdown Option is: "+islaDelPrincipeEduardoProvinceDropdownOptionCurrentText);

		/*Verify the text of Isla del Príncipe Eduardo Province Dropdown Option with an Assertion
				Comparing the current text of Isla del Príncipe Eduardo Province Dropdown Option with the expected text of Isla del Príncipe Eduardo Province Dropdown Option*/
		boolean islaDelPrincipeEduardoProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(islaDelPrincipeEduardoProvinceDropdownOptionExpectedText,islaDelPrincipeEduardoProvinceDropdownOptionCurrentText);
			islaDelPrincipeEduardoProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Isla del Príncipe Eduardo Province Dropdown Option is equal to current text of Isla del Príncipe Eduardo Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Isla del Príncipe Eduardo Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Isla del Príncipe Eduardo Province Dropdown Option isn't equal to current text of Isla del Príncipe Eduardo Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Isla del Príncipe Eduardo Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return islaDelPrincipeEduardoProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Isla del Príncipe Eduardo Province Dropdown Option Web Element
	public static WebElement clickOnIslaDelPrincipeEduardoProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Isla del Príncipe Eduardo Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Isla del Príncipe Eduardo Province Dropdown Option Locator in a Web Element
		WebElement islaDelPrincipeEduardoProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[7]")));
		islaDelPrincipeEduardoProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return islaDelPrincipeEduardoProvinceDropdownOption;
	}
	//Method for Verify the text of YYG airport code with an Assertion
	public static boolean yygAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till YYG airport code became clickable - timeout in 369 seconds
		//Save the YYG airport code Locator in a Web Element
		WebElement yygAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of YYG airport code in a String
		String yygAirportCodeExpectedText="YYG";

		//Print the text of YYG airport code to compare with the expected YYG airport code text
		System.out.println("\nThe expected text of YYG airport code is: "+yygAirportCodeExpectedText);

		//Save the current text of YYG airport code in a string to compare with the expected YYG airport code text
		String yygAirportCodeCurrentText=yygAirportCode.getText();

		//Print the current text of YYG airport code in a string to compare with the expected YYG airport code text
		System.out.println("\nThe current text of YYG airport code is: "+yygAirportCodeCurrentText);

		/*Verify the text of YYG airport code with an Assertion
				Comparing the current text of YYG airport code with the expected text of YYG airport code*/
		boolean yygAirportCodeTextAssertionResult = false;
		try {
			assertEquals(yygAirportCodeExpectedText, yygAirportCodeCurrentText);
			yygAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of YYG airport code is equal to current text of YYG airport code."
					+ "\nThe navigator shows the expected text of YYG airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of YYG airport code isn't equal to current text of YYG airport code."
					+ "\nThe navigator doesn´t show the expected text of YYG airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return yygAirportCodeTextAssertionResult;
	}
	//Method for Click on YYG airport code Web Element
	public static WebElement clickOnYygAirportCode(WebDriver driver) {
		//Initialize and wait till YYG airport code became clickable - timeout in 369 seconds
		//Save the YYG airport code Locator in a Web Element
		WebElement yygAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		yygAirportCode.click();
		//Return the Web Element
		return yygAirportCode;
	}

	//NUEVO BRUNSWICK
	//Method for Verify the text of Nuevo Brunswick Province Dropdown Option with an Assertion
	public static boolean nuevoBrunswickProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Nuevo Brunswick Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Nuevo Brunswick Province Dropdown Option Locator in a Web Element
		WebElement nuevoBrunswickProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[8]")));

		//Save the expected text of Nuevo Brunswick Province Dropdown Option in a String
		String nuevoBrunswickProvinceDropdownOptionExpectedText="Nuevo Brunswick";

		//Print the text of Nuevo Brunswick Province Dropdown Option to compare with the expected Nuevo Brunswick Province Dropdown Option text
		System.out.println("\nThe expected text of Nuevo Brunswick Province Dropdown Option is: "+nuevoBrunswickProvinceDropdownOptionExpectedText);

		//Save the current text of Nuevo Brunswick Province Dropdown Option in a string to compare with the expected Nuevo Brunswick Province Dropdown Option text
		String nuevoBrunswickProvinceDropdownOptionCurrentText=nuevoBrunswickProvinceDropdownOption.getText();

		//Print the current text of Nuevo Brunswick Province Dropdown Option in a string to compare with the expected Nuevo Brunswick Province Dropdown Option text
		System.out.println("\nThe current text of Nuevo Brunswick Province Dropdown Option is: "+nuevoBrunswickProvinceDropdownOptionCurrentText);

		/*Verify the text of Nuevo Brunswick Province Dropdown Option with an Assertion
					Comparing the current text of Nuevo Brunswick Province Dropdown Option with the expected text of Nuevo Brunswick Province Dropdown Option*/
		boolean nuevoBrunswickProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(nuevoBrunswickProvinceDropdownOptionExpectedText,nuevoBrunswickProvinceDropdownOptionCurrentText);
			nuevoBrunswickProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Nuevo Brunswick Province Dropdown Option is equal to current text of Nuevo Brunswick Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Nuevo Brunswick Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Nuevo Brunswick Province Dropdown Option isn't equal to current text of Nuevo Brunswick Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Nuevo Brunswick Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return nuevoBrunswickProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Nuevo Brunswick Province Dropdown Option Web Element
	public static WebElement clickOnNuevoBrunswickProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Nuevo Brunswick Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Nuevo Brunswick Province Dropdown Option Locator in a Web Element
		WebElement nuevoBrunswickProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[8]")));
		nuevoBrunswickProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return nuevoBrunswickProvinceDropdownOption;
	}
	//Method for Verify the text of ZBF airport code with an Assertion
	public static boolean zbfAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till ZBF airport code became clickable - timeout in 369 seconds
		//Save the ZBF airport code Locator in a Web Element
		WebElement zbfAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of ZBF airport code in a String
		String zbfAirportCodeExpectedText="ZBF";

		//Print the text of ZBF airport code to compare with the expected ZBF airport code text
		System.out.println("\nThe expected text of ZBF airport code is: "+zbfAirportCodeExpectedText);

		//Save the current text of ZBF airport code in a string to compare with the expected ZBF airport code text
		String zbfAirportCodeCurrentText=zbfAirportCode.getText();

		//Print the current text of ZBF airport code in a string to compare with the expected ZBF airport code text
		System.out.println("\nThe current text of ZBF airport code is: "+zbfAirportCodeCurrentText);

		/*Verify the text of ZBF airport code with an Assertion
					Comparing the current text of ZBF airport code with the expected text of ZBF airport code*/
		boolean zbfAirportCodeTextAssertionResult = false;
		try {
			assertEquals(zbfAirportCodeExpectedText, zbfAirportCodeCurrentText);
			zbfAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of ZBF airport code is equal to current text of ZBF airport code."
					+ "\nThe navigator shows the expected text of ZBF airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of ZBF airport code isn't equal to current text of ZBF airport code."
					+ "\nThe navigator doesn´t show the expected text of ZBF airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return zbfAirportCodeTextAssertionResult;
	}
	//Method for Click on ZBF airport code Web Element
	public static WebElement clickOnZbfAirportCode(WebDriver driver) {
		//Initialize and wait till ZBF airport code became clickable - timeout in 369 seconds
		//Save the ZBF airport code Locator in a Web Element
		WebElement zbfAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		zbfAirportCode.click();
		//Return the Web Element
		return zbfAirportCode;
	}

	//TERRITORIO NUNAVUT
	//Method for Verify the text of Territorio Nunavut Province Dropdown Option with an Assertion
	public static boolean territorioNunavutProvinceDropdownOptionTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Territorio Nunavut Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Territorio Nunavut Province Dropdown Option Locator in a Web Element
		WebElement territorioNunavutProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[9]")));

		//Save the expected text of Territorio Nunavut Province Dropdown Option in a String
		String territorioNunavutProvinceDropdownOptionExpectedText="Territorio Nunavut";

		//Print the text of Territorio Nunavut Province Dropdown Option to compare with the expected Territorio Nunavut Province Dropdown Option text
		System.out.println("\nThe expected text of Territorio Nunavut Province Dropdown Option is: "+territorioNunavutProvinceDropdownOptionExpectedText);

		//Save the current text of Territorio Nunavut Province Dropdown Option in a string to compare with the expected Territorio Nunavut Province Dropdown Option text
		String territorioNunavutProvinceDropdownOptionCurrentText=territorioNunavutProvinceDropdownOption.getText();

		//Print the current text of Territorio Nunavut Province Dropdown Option in a string to compare with the expected Territorio Nunavut Province Dropdown Option text
		System.out.println("\nThe current text of Territorio Nunavut Province Dropdown Option is: "+territorioNunavutProvinceDropdownOptionCurrentText);

		/*Verify the text of Territorio Nunavut Province Dropdown Option with an Assertion
						Comparing the current text of Territorio Nunavut Province Dropdown Option with the expected text of Territorio Nunavut Province Dropdown Option*/
		boolean territorioNunavutProvinceDropdownOptionTextAssertionResult = false;
		try {
			assertEquals(territorioNunavutProvinceDropdownOptionExpectedText,territorioNunavutProvinceDropdownOptionCurrentText);
			territorioNunavutProvinceDropdownOptionTextAssertionResult = true;
			System.out.println("\nThe expected text of Territorio Nunavut Province Dropdown Option is equal to current text of Territorio Nunavut Province Dropdown Option."
					+ "\nThe navigator shows the expected text of Territorio Nunavut Province Dropdown Option Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Territorio Nunavut Province Dropdown Option isn't equal to current text of Territorio Nunavut Province Dropdown Option."
					+ "\nThe navigator doesn´t show the expected text of Territorio Nunavut Province Dropdown Option Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return territorioNunavutProvinceDropdownOptionTextAssertionResult;
	}
	//Method for Click on Territorio Nunavut Province Dropdown Option Web Element
	public static WebElement clickOnTerritorioNunavutProvinceDropdownOption(WebDriver driver) {
		//Initialize and wait till Territorio Nunavut Province Dropdown Option became clickable - timeout in 369 seconds
		//Save the Territorio Nunavut Province Dropdown Option Locator in a Web Element
		WebElement territorioNunavutProvinceDropdownOption = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/section/div[2]/div[2]/label/select/option[9]")));
		territorioNunavutProvinceDropdownOption.click();
		//Send the Escape key
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ESCAPE).perform();
		System.out.println("The Escape Key was pressed correctly");
		//Return the Web Element
		return territorioNunavutProvinceDropdownOption;
	}
	//Method for Verify the text of YEK airport code with an Assertion
	public static boolean yekAirportCodeTextAssertionResult(WebDriver driver) {
		//Initialize and wait till YEK airport code became clickable - timeout in 369 seconds
		//Save the YEK airport code Locator in a Web Element
		WebElement yekAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));

		//Save the expected text of YEK airport code in a String
		String yekAirportCodeExpectedText="YEK";

		//Print the text of YEK airport code to compare with the expected YEK airport code text
		System.out.println("\nThe expected text of YEK airport code is: "+yekAirportCodeExpectedText);

		//Save the current text of YEK airport code in a string to compare with the expected YEK airport code text
		String yekAirportCodeCurrentText=yekAirportCode.getText();

		//Print the current text of YEK airport code in a string to compare with the expected YEK airport code text
		System.out.println("\nThe current text of YEK airport code is: "+yekAirportCodeCurrentText);

		/*Verify the text of YEK airport code with an Assertion
						Comparing the current text of YEK airport code with the expected text of YEK airport code*/
		boolean yekAirportCodeTextAssertionResult = false;
		try {
			assertEquals(yekAirportCodeExpectedText, yekAirportCodeCurrentText);
			yekAirportCodeTextAssertionResult = true;
			System.out.println("\nThe expected text of YEK airport code is equal to current text of YEK airport code."
					+ "\nThe navigator shows the expected text of YEK airport code Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of YEK airport code isn't equal to current text of YEK airport code."
					+ "\nThe navigator doesn´t show the expected text of YEK airport code Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return yekAirportCodeTextAssertionResult;
	}
	//Method for Click on YEK airport code Web Element
	public static WebElement clickOnYekAirportCode(WebDriver driver) {
		//Initialize and wait till YEK airport code became clickable - timeout in 369 seconds
		//Save the YEK airport code Locator in a Web Element
		WebElement yekAirportCode = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/span[1]")));
		yekAirportCode.click();
		//Return the Web Element
		return yekAirportCode;
	}









	//Method for Click on Number of Passengers Dropdown Web Element
	public static WebElement clickOnNumberOfPassengers(WebDriver driver) {
		//Initialize and wait till Number of Passengers Dropdown became clickable - timeout in 369 seconds
		//Save the Number of Passengers Dropdown Locator in a Web Element
		WebElement numberOfPassengers = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
		numberOfPassengers.click();
		//Return the Web Element
		return numberOfPassengers;
	}
	//Method for Verify the text of Number of Passengers Dropdown Option 1 with an Assertion
	public static boolean numberOfPassengersDropdownOption1TextAssertionResult(WebDriver driver) {
		//Initialize and wait till Number of Passengers Dropdown Option 1 became clickable - timeout in 369 seconds
		//Save the Number of Passengers Dropdown Option 1 Locator in a Web Element
		WebElement numberOfPassengersDropdownOption1 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[3]/div[3]/div/label/select/option[1]")));

		//Save the expected text of Number of Passengers Dropdown Option 1 in a String
		String numberOfPassengersDropdownOption1ExpectedText="1";

		//Print the text of Number of Passengers Dropdown Option 1 to compare with the expected Number of Passengers Dropdown Option 1 text
		System.out.println("\nThe expected text of Number of Passengers Dropdown Option 1 is: "+numberOfPassengersDropdownOption1ExpectedText);

		//Save the current text of Number of Passengers Dropdown Option 1 in a string to compare with the expected Number of Passengers Dropdown Option 1 text
		String numberOfPassengersDropdownOption1CurrentText=numberOfPassengersDropdownOption1.getText();

		//Print the current text of Number of Passengers Dropdown Option 1 in a string to compare with the expected Number of Passengers Dropdown Option 1 text
		System.out.println("\nThe current text of Number of Passengers Dropdown Option 1 is: "+numberOfPassengersDropdownOption1CurrentText);

		/*Verify the text of Number of Passengers Dropdown Option 1 with an Assertion
				Comparing the current text of Number of Passengers Dropdown Option 1 with the expected text of Number of Passengers Dropdown Option 1*/
		boolean numberOfPassengersDropdownOption1TextAssertionResult = false;
		try {
			assertEquals(numberOfPassengersDropdownOption1ExpectedText, numberOfPassengersDropdownOption1CurrentText);
			numberOfPassengersDropdownOption1TextAssertionResult = true;
			System.out.println("\nThe expected text of Number of Passengers Dropdown Option 1 is equal to current text of Number of Passengers Dropdown Option 1."
					+ "\nThe navigator shows the expected text of Number of Passengers Dropdown Option 1 Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Number of Passengers Dropdown Option 1 isn't equal to current text of Number of Passengers Dropdown Option 1."
					+ "\nThe navigator doesn´t show the expected text of Number of Passengers Dropdown Option 1 Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return numberOfPassengersDropdownOption1TextAssertionResult;
	}
	//Method for Click on Number of Passengers Dropdown Option 1 Web Element
	public static WebElement clickOnNumberOfPassengersDropdownOption1(WebDriver driver) {
		//Initialize and wait till Number of Passengers Dropdown Option 1 became clickable - timeout in 369 seconds
		//Save the Number of Passengers Dropdown Option 1 Locator in a Web Element
		WebElement numberOfPassengersDropdownOption1 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[3]/div[3]/div/label/select/option[1]")));
		numberOfPassengersDropdownOption1.click();
		//Return the Web Element
		return numberOfPassengersDropdownOption1;
	}
	//Method for Click on Departure Date Calendar Time Slot Button Web Element
	public static WebElement clickOnDepartureDateCalendarTimeSlotButton(WebDriver driver) {
		//Initialize and wait till Departure date Calendar Time Slot Button became clickable - timeout in 369 seconds
		//Save the Departure date Label Locator in a Web Element
		WebElement departureDateCalendarTimeSlotButton = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[4]/div[1]/div/button")));
		departureDateCalendarTimeSlotButton.click();
		//Return the Web Element
		return departureDateCalendarTimeSlotButton;
	}
	//Method for Verify the text of Departure Date 2022 December 31 with an Assertion
	public static boolean departureDate2022December31TextAssertionResult(WebDriver driver) {
		//Initialize and wait till Departure Date 2022 December 31 became clickable - timeout in 369 seconds
		//Save the Departure Date 2022 December 31 Locator in a Web Element
		WebElement departureDate2022December31 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[5]/td[7]/a")));

		//Save the expected text of Departure Date 2022 December 31 in a String
		String departureDate2022December31ExpectedText="31";

		//Print the text of Departure Date 2022 December 31 to compare with the expected Departure Date 2022 December 31 text
		System.out.println("\nThe expected text of Departure Date 2022 December 31 is: "+departureDate2022December31ExpectedText);

		//Save the current text of Departure Date 2022 December 31 in a string to compare with the expected Departure Date 2022 December 31 text
		String departureDate2022December31CurrentText=departureDate2022December31.getText();

		//Print the current text of Departure Date 2022 December 31 in a string to compare with the expected Departure Date 2022 December 31 text
		System.out.println("\nThe current text of Departure Date 2022 December 31 is: "+departureDate2022December31CurrentText);

		/*Verify the text of Departure Date 2022 December 31 with an Assertion
				Comparing the current text of Departure Date 2022 December 31 with the expected text of Departure Date 2022 December 31*/
		boolean departureDate2022December31TextAssertionResult = false;
		try {
			assertEquals(departureDate2022December31ExpectedText, departureDate2022December31CurrentText);
			departureDate2022December31TextAssertionResult = true;
			System.out.println("\nThe expected text of Departure Date 2022 December 31 is equal to current text of Departure Date 2022 December 31."
					+ "\nThe navigator shows the expected text of Departure Date 2022 December 31 Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Departure Date 2022 December 31 isn't equal to current text of Departure Date 2022 December 31."
					+ "\nThe navigator doesn´t show the expected text of Departure Date 2022 December 31 Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return departureDate2022December31TextAssertionResult;
	}
	//Method for Click on Departure Date 2022 December 31 Web Element
	public static WebElement clickOnDepartureDate2022December31(WebDriver driver) {
		//Initialize and wait till Departure Date 2022 December 31 became clickable - timeout in 369 seconds
		//Save the Departure Date 2022 December 31 Locator in a Web Element
		WebElement departureDate2022December31 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[5]/td[7]/a")));
		departureDate2022December31.click();
		//Return the Web Element
		return departureDate2022December31;
	}
	//Method for Click on Return Date Calendar Time Slot Button Web Element
	public static WebElement clickOnReturnDateCalendarTimeSlotButton(WebDriver driver) {
		//Initialize and wait till Return date Calendar Time Slot Button became clickable - timeout in 369 seconds
		//Save the Return date Calendar Time Slot Button Locator in a Web Element
		WebElement returnDateCalendarTimeSlotButton = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div[1]/form/div[4]/div[2]/div/button")));
		returnDateCalendarTimeSlotButton.click();
		//Return the Web Element
		return returnDateCalendarTimeSlotButton;
	}
	//Method for Verify the text of Return Date 2023 January 31 with an Assertion
	public static boolean returnDate2023January31TextAssertionResult(WebDriver driver) {
		//Initialize and wait till Return Date 2023 January 31 became clickable - timeout in 369 seconds
		//Save the Return Date 2023 January 31 Locator in a Web Element
		WebElement returnDate2023January31 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[2]/table/tbody/tr[5]/td[3]/a")));

		//Save the expected text of Return Date 2023 January 31 in a String
		String returnDate2023January31ExpectedText="31";

		//Print the text of Return Date 2023 January 31 to compare with the expected Return Date 2023 January 31 text
		System.out.println("\nThe expected text of departure Date 2023 January 31 is: "+returnDate2023January31ExpectedText);

		//Save the current text of Return Date 2023 January 31 in a string to compare with the expected Return Date 2023 January 31 text
		String returnDate2023January31CurrentText=returnDate2023January31.getText();

		//Print the current text of Return Date 2023 January 31 in a string to compare with the expected Return Date 2023 January 31 text
		System.out.println("\nThe current text of Return Date 2023 January 31 is: "+returnDate2023January31CurrentText);

		/*Verify the text of Return Date 2023 January 31 with an Assertion
				Comparing the current text of Return Date 2023 January 31 with the expected text of Return Date 2023 January 31*/
		boolean returnDate2023January31TextAssertionResult = false;
		try {
			assertEquals(returnDate2023January31ExpectedText, returnDate2023January31CurrentText);
			returnDate2023January31TextAssertionResult = true;
			System.out.println("\nThe expected text of Return Date 2023 January 31 is equal to current text of Return Date 2023 January 31."
					+ "\nThe navigator shows the expected text of Return Date 2023 January 31 Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Return Date 2023 January 31 isn't equal to current text of Return Date 2023 January 31."
					+ "\nThe navigator doesn´t show the expected text of Return Date 2023 January 31 Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return returnDate2023January31TextAssertionResult;
	}
	//Method for Click on Return Date 2023 January 31 Web Element
	public static WebElement clickOnReturnDate2023January31(WebDriver driver) {
		//Initialize and wait till Return Date 2023 January 31 became clickable - timeout in 369 seconds
		//Save the Return Date 2023 January 31 Locator in a Web Element
		WebElement returnDate2023January31 = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[2]/table/tbody/tr[5]/td[3]/a")));
		returnDate2023January31.click();
		//Return the Web Element
		return returnDate2023January31;
	}
	//Method for Verify the text of Search Flights Button with an Assertion
	public static boolean searchFlightsButtonTextAssertionResult(WebDriver driver) {
		//Initialize and wait till Search Flights Button became clickable - timeout in 369 seconds
		//Save the Search Flights Button Locator in a Web Element
		WebElement searchFlightsButton = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("flightSearchForm.button.reSubmit")));

		//Save the expected text of Search Flights Button in a String
		String searchFlightsButtonExpectedText="Buscar vuelos";

		//Print the text of Search Flights Button to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Search Flights Button is: "+searchFlightsButtonExpectedText);

		//Save the current text of Search Flights Button in a string to compare with the expected Search Flights Button text
		String searchFlightsButtonCurrentText=searchFlightsButton.getAttribute("value");

		//Print the current text of Search Flights Button in a string to compare with the expected Search Flights Button text
		System.out.println("\nThe current text of Search Flights Button is: "+searchFlightsButtonCurrentText);

		/*Verify the text of Search Flights Button with an Assertion
				Comparing the current text of Search Flights Button with the expected text of Search Flights Button*/
		boolean searchFlightsButtonTextAssertionResult = false;
		try {
			assertEquals(searchFlightsButtonExpectedText, searchFlightsButtonCurrentText);
			searchFlightsButtonTextAssertionResult = true;
			System.out.println("\nThe expected text of Search Flights Button is equal to current text of Search Flights Button."
					+ "\nThe navigator shows the expected text of Search Flights Button Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Search Flights Button isn't equal to current text of Search Flights Button."
					+ "\nThe navigator doesn´t show the expected text of Search Flights Button Correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return searchFlightsButtonTextAssertionResult;
	}
	//Method for Click on Search Flights Button Web Element
	public static WebElement clickOnSearchFlightsButton(WebDriver driver) {
		//Initialize and wait till Search Flights Button became clickable - timeout in 369 seconds
		//Save the Search Flights Button Locator in a Web Element
		WebElement searchFlightsButton = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("flightSearchForm.button.reSubmit")));
		searchFlightsButton.click();
		//Return the Web Element
		return searchFlightsButton;
	}


	//Constructor method
	public americanAirlinesHomePageObjects(WebDriver driver) {
		this.driver=driver;
	}
}
