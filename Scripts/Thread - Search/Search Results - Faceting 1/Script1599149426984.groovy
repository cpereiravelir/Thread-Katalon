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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.graybox.velir.com/qa-automated-testing-folder/qa-search-page?q&sortBy=relevance&sortOrder=asc&page=1')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/TestingRR/Thread/Thread - Search/Page_Search  Thread Travel/input_Search_site-search'), 
    'QA')

WebUI.sendKeys(findTestObject('Object Repository/TestingRR/Thread/Thread - Search/Page_Search  Thread Travel/input_Search_site-search'), 
    Keys.chord(Keys.ENTER))

element = driver.findElements(By.className('search-results__status'))

qaResultTestObject = WebUI.convertWebElementToTestObject(element[0])

qaResultValue = WebUI.getText(qaResultTestObject).replaceAll('\\n|\\r', '')

Pattern regexExtractTotalResults = Pattern.compile('\\d+ results')

Pattern regexTotalResultsOnlyNumbers = Pattern.compile('\\d+')

Matcher qaMatch = regexExtractTotalResults.matcher(qaResultValue)

if (qaMatch.find()) {
    String r = qaMatch.group()

    Matcher mat2 = regexTotalResultsOnlyNumbers.matcher(r)

    if (mat2.find()) {
        int totalRecords = mat2.group().toInteger()

        WebUI.verifyGreaterThan(totalRecords, 35, FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.scrollToElement(findTestObject('TestingRR/Thread/Thread - Search/Page_Search  Thread Travel/svg_Locations_icon'),
	0)


WebUI.click(findTestObject('Object Repository/TestingRR/Thread/Thread - Search/Page_Search  Thread Travel/svg_Locations_icon'))

WebUI.delay(4)

WebUI.check(findTestObject('Object Repository/TestingRR/Thread/Thread - Search/Page_Search  Thread Travel/input_Europe(3)_Polar Regions'))

element = driver.findElements(By.className('search-results__status'))

polarRegionResultTestObject = WebUI.convertWebElementToTestObject(element[0])

polarRegionResultValue = WebUI.getText(polarRegionResultTestObject).replaceAll('\\n|\\r', '')

Matcher polarRegionsMatch = regexExtractTotalResults.matcher(polarRegionResultValue)

if (polarRegionsMatch.find()) {
    String r = polarRegionsMatch.group()

    Matcher mat2 = regexTotalResultsOnlyNumbers.matcher(r)

    if (mat2.find()) {
        int totalRecords = mat2.group().toInteger()

        WebUI.verifyLessThanOrEqual(totalRecords, 10, FailureHandling.STOP_ON_FAILURE)
    }
}

