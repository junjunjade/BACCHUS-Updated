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

String apkPath = GlobalVariable.APK_PATH;
Mobile.startApplication(apkPath, true);

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.EditText - Usercode'), 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - Password'), '123', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - POS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - POS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 3'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 3'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - NEXT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - SALADS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SALADS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - SALADE NICOSE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SALADE NICOSE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - GB-CHOPPED SALAD'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - COFFEE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - MACCHIATO'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - MACCHIATO'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - LATTE OR FLATWHITE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - HOLD ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 3'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 3'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 3'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 3'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - GCASH'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - GCASH'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.EditText - REF NO'), 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - REF NO'), '6662227771928', 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - CUS NAME'), 'Gericho', 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CONFIRM'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

