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
// Perform horizontal swipe using W3C PointerInput
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import org.openqa.selenium.WebDriver
import java.time.Duration
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

String apkPath = GlobalVariable.APK_PATH;
Mobile.startApplication(apkPath, true);

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.EditText - Usercode'), 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - Password'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - POS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 5'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 5'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), '8', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - UPDATE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - NEXT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - ICED COFFEE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ICED COFFEE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ICED SALTED BUTTER CARAMEL AFFOGATO'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Iced Salted Butter Caramel Affogato'), 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Iced Salted Butter Caramel Affogato'), 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - 7'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Iced Salted Butter Caramel Affogato'), 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DULCE DE LECHE FRAPPE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - SC PER SHARE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SC PER SHARE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Seniors'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Seniors'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SAVE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 'Jimuel', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - ID No'), '5400', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - OK'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 'MC', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - ID No'), '5443', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - OK'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 'Erwin', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - ID No'), '6428', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - HOLD ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 5'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 5'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

