package pages;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class americanAirlinesChooseFlightsPageObjects {
	//Initialize the Chrome Driver as null
	private static WebDriver driver= null;
	//Initialize the Choose Flights Label Text web element as null
	private static Boolean searchFlightsButtonTextAssertionResult=null;
	//Initialize the Choose Flights Label web element as null
	private static WebElement chooseFlightsLabel=null;







	//ALBERTA CANADA
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultAlberta(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
				Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Calgary, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Calgary, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Calgary, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Calgary, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//TERRITORIOS DEL NOROESTE
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultTerritoriosDelNoroeste(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
					Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Aklavik, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Aklavik, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Aklavik, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Aklavik, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//COLUMBIA BRITÁNICA
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultColumbiaBritanica(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
						Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Abbotsford, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Abbotsford, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Abbotsford, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Abbotsford, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//ONTARIO
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultOntario(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
							Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Angling Lake, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Angling Lake, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Angling Lake, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Angling Lake, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//MANITOBA
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultManitoba(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
								Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Berens River, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Berens River, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Berens River, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Berens River, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//ISLA DEL PRÍNCIPE EDUARDO
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultIslaDelPrincipeEduardo(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
							Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Charlottetown, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Charlottetown, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Charlottetown, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Charlottetown, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//NUEVO BRUNSWICK
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultNuevoBrunswick(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
								Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Bathurst, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Bathurst, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Bathurst, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Bathurst, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}

	//TERRITORIO NUNAVUT
	//Method for Verify the text of Choose Flights Label with an Assertion
	public static boolean getOutOfSearchLabelTextAssertionResultTerritorioNunavut(WebDriver driver) {
		//Initialize and wait till Choose Flights Label became clickable - timeout in 369 seconds
		//Save the Choose Flights Label Locator in a Web Element
		WebElement chooseFlightsLabel = new WebDriverWait(driver, Duration.ofSeconds(369))
				.until(ExpectedConditions.elementToBeClickable(By.id("aa-pageTitle")));

		//Save the expected text of Choose Flights Label in a String
		String chooseFlightsLabelExpectedText="Elegir vuelos";

		//Print the text of Choose Flights Label to compare with the expected Search Flights Button text
		System.out.println("\nThe expected text of Choose Flights Label is: "+chooseFlightsLabelExpectedText);

		//Save the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		String chooseFlightsLabelCurrentText=chooseFlightsLabel.getText();

		//Print the current text of Choose Flights Label in a string to compare with the expected Choose Flights Label text
		System.out.println("\nThe current text of Choose Flights Label is: "+chooseFlightsLabelCurrentText);

		/*Verify the text of Choose Flights Label with an Assertion
								Comparing the current text of Choose Flights Label with the expected text of Choose Flights Label*/
		boolean chooseFlightsLabelTextAssertionResult = false;
		try {
			assertEquals(chooseFlightsLabelExpectedText, chooseFlightsLabelCurrentText);
			chooseFlightsLabelTextAssertionResult = true;
			System.out.println("\nThe expected text of Choose Flights Label is equal to current text of Choose Flights Label."
					+ "\nThe navigator shows the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Passed.");
		} catch (AssertionError e) {
			//The assertion failed, so the result continues being false
			System.out.println("\nThe expected text of Choose Flights Label isn't equal to current text of Choose Flights Label."
					+ "\nThe navigator doesn´t show the expected text of Choose Flights Label Correctly."
					+ "\nThe Test Has Failed.");
		}

		//Obtain the page source code
		String pageSource = driver.getPageSource();

		//Verify that the text "Salida Birmingham, AL a Arviat, Canada Sábado, 31 de diciembre de 2022" appears in the page source code
		if (pageSource.contains("Salida")&&pageSource.contains("Birmingham, AL")&&pageSource.contains(" a ")&&pageSource.contains("Arviat, Canada")&&pageSource.contains("Sábado, 31 de diciembre de 2022")) {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Arviat, Canada Sábado, 31 de diciembre de 2022' Label appears on the page source code correctly."
					+ "\nThe Test Has Passed.");
		} else {
			System.out.println("\nThe expected text of 'Salida Birmingham, AL a Arviat, Canada Sábado, 31 de diciembre de 2022' Label doesn´t appear on the page source code correctly."
					+ "\nThe Test Has Failed.");
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

		//Return the Boolean Assertion
		return chooseFlightsLabelTextAssertionResult;

	}





	//Constructor method
	public americanAirlinesChooseFlightsPageObjects(WebDriver driver) {
		this.driver=driver;
	}


}
