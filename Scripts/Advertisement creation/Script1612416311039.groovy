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
import java.util.UUID as UUID
import java.io.File as File
import java.math.BigInteger as BigInteger
import java.security.SecureRandom as SecureRandom

String id = UUID.randomUUID().toString()
String generateRandomString() {
	return 'This is Advertisement text' + new BigInteger(10, new SecureRandom()).toString()
}

File file = new File('file\\logo-200.png')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-viber.f1soft.com/business/auth/login')
WebUI.maximizeWindow()


WebUI.setText(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_email'), 
    'sanjip.thapa@f1soft.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/span_Advertisement Template'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/span_Create Advertisement Template'))

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formtitle'), 
    id)
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/textarea__create_advertisement_template_formtext'), 
    generateRandomString())


WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formcaption'), 
    'like')


WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formurl'), 
    'https://www.f1soft.com')


WebUI.uploadFile(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formimage'),
	file.getAbsolutePath())
WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formstartDate'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/button_Apply'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formendDate'))
WebUI.delay(2)
WebUI.executeJavaScript('window.scrollTo(0,document.body.scrollHeight)', null)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/i_Feb 2021_fa fa-chevron-right glyphicon gl_a15f23'))

//WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/button_Apply'))


//WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_advertisement_template_formendDate'))



//WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/i_Feb 2021_fa fa-chevron-right glyphicon gl_a15f23'))


WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/td_1'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/button/Page_Messaging Service  F1Soft  Viber/button_Apply'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/button_Create'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/i_Inactive_fa fa-edit'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/a_Cancel'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/img'))


WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/a_Logout'))

