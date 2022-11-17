import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.Dimension
import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory




def urlInsideStore = GlobalVariable.baseUrl
WebDriver normalChrome = openChromeBrowserPlain()
resizeHorizontalHalfLocateLeft(normalChrome)
DriverFactory.changeWebDriver(normalChrome)
WebUI.navigateToUrl(urlInsideStore)
WebUI.waitForPageLoad(10)


/**
 * opens a Chrome browser with nothing special
 * returns the ChromeDriver instance that is assocated with the window
 * @return
 */
ChromeDriver openChromeBrowserPlain() {
	return openChromeBrowser(new ChromeOptions())
}

/**
 * opens a ChromeBrowser with the ChromeOptions given.
 * returns the ChromeDriver instance that is associated with the window
 * @param options
 * @return
 */
ChromeDriver openChromeBrowser(ChromeOptions options) {
	System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())
	return new ChromeDriver(options);
}

/**
 * resize the browser window to horizontal half, and move it to the right side
 * @param driver
 * @returns Dimension of the window
 */
Dimension resizeHorizontalHalfLocateLeft(WebDriver driver) {
	Dimension d = resizeToHorizontalHalf(driver)
	driver.manage().window().setPosition(new Point(0, 0));
	return d
}

/**
 * resize the browser window to half-width tile;
 * width=half of full screen, height=height of full screen
 *
 * @param driver
 * @return
 */
Dimension resizeToHorizontalHalf(WebDriver driver) {
	driver.manage().window().maximize()
	Dimension maxDim = driver.manage().window().getSize()
	Dimension curDim = new Dimension((Integer)(maxDim.getWidth() / 2), maxDim.getHeight())
	driver.manage().window().setSize(curDim)
	return curDim
}
