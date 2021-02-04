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
import java.math.BigInteger as BigInteger
import java.security.SecureRandom as SecureRandom
import java.util.UUID;
import java.io.File as File

String uuid = UUID.randomUUID().toString();
//return testString

File file = new File('file\\logo-200.png')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-viber.f1soft.com/business/auth/login')

WebUI.maximizeWindow()

WebUI.doubleClick(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_email'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_email'), 
    'sanjip.thapa@f1soft.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/button_Login'))


WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/a_Message Template'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/span_Create Message Template'))

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_message_template_formtitle'), 
   uuid)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input_Sms_create_message_template_formchannels'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/select_Select Message TypeText MessageImage_41a676'), 
    '8', true)

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/textarea__create_message_template_formviber_75636d'), 
    'This is rich media message.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/select_Select Button TypeRegular ButtonTrac_4313d8'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_message_template_formviberBus_c7ada7'), 
    'like')

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_message_template_formviberBus_67b953'))

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_message_template_formviberBus_67b953'), 
    'https://f1soft.com')

WebUI.uploadFile(findTestObject('File upload 1/Page_Messaging Service  F1Soft  Viber/input__create_message_template_formviberBusinessTemplateimage'), 
    file.getAbsolutePath())

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/textarea__create_message_template_formsmsTe_3705db'), 
    'This is sms')

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/i_viber,sms_fa fa-eye'))

WebUI.delay(5)

WebUI.executeJavaScript('window.scrollTo(0,document.body.scrollHeight)', null)
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/img'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/a_Logout'))
WebUI.closeBrowser()


String generateRandomString() {
    return 'Automation' + new BigInteger(10, new SecureRandom()).toString()
}

