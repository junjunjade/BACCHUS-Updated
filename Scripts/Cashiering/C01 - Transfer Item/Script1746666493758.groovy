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

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - POS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - ORDER'), 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - Number of Pax'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - FRENCH TOAST'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - MANGO AND CREAM FRENCH TOAST'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - STRAWBERRY NUTELLA FRENCH TOAST'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CREPES SUCREES'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - EMMENTAL CHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - GB-BASIC CHOCOLATE CREPE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - HOLD ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - ORDER'), 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - Number of Pax'), '2', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - UPDATE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CREPE CAKE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - FRENCH VANILLA CREPE CAKE SLICE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CHOCOLATE CREPE CAKE SLICE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - FRENCH VANILLA CREPE CAKE WHOLE'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - HOLD ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 2'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - TRANSFER ITEM'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - TRANSFER ITEM'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - TRANSFER ITEM (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 2'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PRINT BILL'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CASH'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CASH'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 0'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - Table 2'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CASH'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CASH'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 0'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

