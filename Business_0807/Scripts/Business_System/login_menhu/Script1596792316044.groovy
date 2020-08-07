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

WebUI.openBrowser('http://10.13.4.18:8010/home/index')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Business_System_Page/menhu_page/button_login'), 10)

WebUI.click(findTestObject('Business_System_Page/menhu_page/button_login'))

WebUI.check(findTestObject('Business_System_Page/Page_login/input__username'))

WebUI.verifyElementClickable(findTestObject('Business_System_Page/Page_login/button_login'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Business_System_Page/Page_login/input__username'), GlobalVariable.user)

WebUI.sendKeys(findTestObject('Business_System_Page/Page_login/input__password'), GlobalVariable.password)

WebUI.click(findTestObject('Business_System_Page/Page_login/button_login'))

WebUI.click(findTestObject('Business_System_Page/menhu_page/div_yewuxitong'))

