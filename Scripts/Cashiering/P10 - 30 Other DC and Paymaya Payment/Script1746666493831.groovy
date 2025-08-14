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

Mobile.scrollToText('Table 10', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 10'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 10'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), '1', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - UPDATE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

def driver = MobileDriverFactory.getDriver()
def finger = new PointerInput(PointerInput.Kind.TOUCH, "finger")
def swipe = new Sequence(finger, 1)

// Optional: use screen size to make it dynamic
int deviceWidth = Mobile.getDeviceWidth()
int deviceHeight = Mobile.getDeviceHeight()
int startX = (deviceWidth * 0.7).toInteger()   // right side
int endX = (deviceWidth * 0.5).toInteger()     // left side
int startY = (deviceHeight * 0.3).toInteger()  // vertical center
swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
       PointerInput.Origin.viewport(), startX, startY))
swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
swipe.addAction(finger.createPointerMove(Duration.ofMillis(500),
       PointerInput.Origin.viewport(), endX, startY + 10)) // slight Y diff
swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
driver.perform([swipe])

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - ICED COFFEE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ICED COFFEE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - DULCE DE LECHE FRAPPE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DULCE DE LECHE FRAPPE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - 30 OTHER DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - 30 OTHER DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - HOLD ORDER'), 0)

Mobile.scrollToText('Table 10', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 10'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 10'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.scrollToText('Table 10', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 10'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 10'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

// Third swipe must be a fresh PointerInput and Sequence
def driver3 = MobileDriverFactory.getDriver()
def finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger3")
def swipe3 = new Sequence(finger3, 3)

int deviceWidth3 = Mobile.getDeviceWidth()
int deviceHeight3 = Mobile.getDeviceHeight()

int startX3 = (deviceWidth3 * 0.7).toInteger()
int endX3 = (deviceWidth3 * 0.5).toInteger()
int startY3 = (deviceHeight3 * 0.3).toInteger()

swipe3.addAction(finger3.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX3, startY3))
swipe3.addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
swipe3.addAction(finger3.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX3, startY3 + 10))
swipe3.addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

driver.perform([swipe3])

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMAYA'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMAYA'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.EditText - REF NO'), 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - REF NO'), '73618924342', 0)

Mobile.setText(findTestObject('Object Repository/Cashiering/android.widget.EditText - CUS NAME'), 'Echo Jade', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - CONFIRM'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CONFIRM'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

