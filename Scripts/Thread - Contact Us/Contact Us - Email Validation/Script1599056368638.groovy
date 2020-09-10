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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.graybox.velir.com/')

WebUI.click(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Home  Thread Travel/a_Contact Us'))

WebUI.delay(3)

CurrentURL = WebUI.getUrl()

http: WebUI.verifyEqual(CurrentURL, 'https://dev.graybox.velir.com/contact-us', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/input_Name_fxbd1be240f-bef2-4b4a-9b62-f7691_6c6710'), 
    'claudia')

WebUI.setText(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/input_Email Address_fxbd1be240f-bef2-4b4a-9_25b8f7'), 
    'test@')

WebUI.setText(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/input_Subject_fxbd1be240f-bef2-4b4a-9b62-f7_f8362c'), 
    'subject')

WebUI.setText(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/textarea_Message_fxbd1be240f-bef2-4b4a-9b62_6db607'), 
    'testing')

WebUI.submit(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/input_Message_fxbd1be240f-bef2-4b4a-9b62-f7_46fc09'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TestingRR/Thread/ContactUs/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/Page_Contact Us  Thread Travel/span_Please enter a valid email address'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

