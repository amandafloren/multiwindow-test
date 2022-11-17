package mapping
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SendChatToDroid {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I go to Inside Store")
	def open_inside_store() {
		WebUI.callTestCase(findTestCase("Test Cases/Open Chat/Navigate to Inside Store"),[:], FailureHandling.STOP_ON_FAILURE)
	}
	@Given("I go to Inside Store using incognito mode browser")
	def open_inside_store_incognito() {
		WebUI.callTestCase(findTestCase("Test Cases/Open Chat/Navigate to Inside Store Incognito Mode"),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click on Droid")
	def click_on_droid() {
		WebUI.callTestCase(findTestCase("Test Cases/Open Chat/Click Droid"),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input email to droid chat (.*)")
	def input_email(String email) {
		WebUI.callTestCase(findTestCase("Test Cases/Open Chat/Input email to droid"),[('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input phone number to droid chat (.*)")
	def input_phonenumber(String phonenumber) {
		WebUI.callTestCase(findTestCase("Test Cases/Open Chat/Input text to droid"),[('text') : phonenumber], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I input a message to droid chat (.*)")
	def message(String message) {
		WebUI.callTestCase(findTestCase("Test Cases/Open Chat/Input text to droid"),[('text') : message], FailureHandling.STOP_ON_FAILURE)
	}
}