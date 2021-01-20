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
import java.util.List as List
import org.openqa.selenium.WebElement as WebElement
import java.util.UUID;

String uuid = UUID.randomUUID().toString();

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-viber.f1soft.com/business/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_email'), 
    'sanjip.thapa@f1soft.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/input_Login_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Login  Viber Business Message  F1Soft _1949f6/button_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/a_Promotion'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/span_Create Promotion'))

WebUI.setText(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input__create_promotion_formtitle'), 
    uuid)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input_Sms_create_promotion_formchannels'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/span_Select Message Template'))

List<WebElement> listofelements = WebUI.findWebElements(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/li_This is sms fail over test'), 
    30)

for (int i = 0; i < listofelements.size(); i++) {
    if (listofelements.get(i).getText().contains('This is sms fail over test')) {
        listofelements.get(i).click()

        break
    }
}

//WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/li_This is sms fail over test'))
WebUI.uploadFile(findTestObject('File upload/Page_Messaging Service  F1Soft  Viber/input__create_promotion_formcsvFile'), 
    file)

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/input_Deliver Before_create_promotion_formd_6c959e'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/i_Requested_fa fa-check-circle-o'))

WebUI.waitForAlert(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/i_Approved_fa fa-eye'))

WebUI.delay(5)

WebUI.refresh()

WebUI.delay(5)

WebUI.executeJavaScript('window.scrollTo(0,document.body.scrollHeight)', null)

WebUI.delay(5)





WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/img'))

WebUI.click(findTestObject('Object Repository/Page_Messaging Service  F1Soft  Viber/a_Logout'))

WebUI.closeBrowser()

String generateRandomString() {
    return 'Automation' + new BigInteger(100000, new SecureRandom()).toString()
}

