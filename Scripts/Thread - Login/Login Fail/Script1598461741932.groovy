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

WebUI.click(findTestObject('Object Repository/TestingRR/Thread/Page_Home  Thread Travel/a_Login'))

WebUI.setText(findTestObject('Object Repository/TestingRR/Thread/Page_Log In  Thread Travel/input_Email Address_fxbac2bf0ba-853c-4d4b-8_d45a66'), 
    'nicole.okeeffe@velir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestingRR/Thread/Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_c3446d'), 
    'ojICzitWdMd/c4PA6VQslA==')

WebUI.scrollToElement(findTestObject('TestingRR/Thread/Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_88fb55'), 
    0)

WebUI.click(findTestObject('Object Repository/TestingRR/Thread/Page_Log In  Thread Travel/input_Password_fxbac2bf0ba-853c-4d4b-8412-1_88fb55'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TestingRR/Thread/Page_Log In  Thread Travel/li_Invalid credentials Please try again'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.closeBrowser()

