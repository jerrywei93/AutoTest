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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('ChuRuKu/login_case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/span_'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/span__1'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/a_'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/button_ _1'))

WebUI.setText(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/input__ant-input'), '大豆1')

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/button_ (1)'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/button_ _1'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/div__ant-select-selection__rendered'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/li_gl'))

WebUI.setText(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/input__inspectStandard'), '1')

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/div__ant-select-selection            ant-se_851fda'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/li_'))

WebUI.setText(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/input__sortNum'), '1')

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/svg'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/li__1'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/button_ _1_2'))

WebUI.setText(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/input__ant-input'), '100')

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/svg_1'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/li__1_2'))

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/button_ _1_2_3'))

WebUI.setText(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/input__varietyName'), '大豆1')

WebUI.click(findTestObject('ChuRuKu_1_page/Pinzhong_page/Page_/button_ _1_2_3_4'))

WebUI.closeBrowser()

