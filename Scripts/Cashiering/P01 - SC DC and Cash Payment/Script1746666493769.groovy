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

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), '2', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - UPDATE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CREPES SUCREES'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CREPES SUCREES'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - EMMENTAL CHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - EMMENTAL CHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - FRENCH TOAST'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - MANGO NUTELLA FRENCH'), 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - MANGO NUTELLA FRENCH'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - BANANA WALNUT FRENCH TOAST'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - LA POMME'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DISCOUNT'), 0)

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

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - SC DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SC DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 'Echo Nolasco', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - ID No'), '2387', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - HOLD ORDER'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 1'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - CASH'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - CASH'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.TextView - 6'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 6'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 8'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 5'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.TextView - 9'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Cashiering/android.widget.Button - OK PAYMENT'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

