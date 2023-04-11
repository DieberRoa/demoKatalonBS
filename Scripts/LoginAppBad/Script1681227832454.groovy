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

Mobile.startApplication('bs://2c21f8d4802ffab69385e0c815313c55b37ec356', true)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Return'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeTextField - Babilonia123'), 0)

Mobile.setText(findTestObject('Object Repository/XCUIElementTypeTextField - Babilonia123 (1)'), 'maria.correa@epayco.co', 
    0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeTextField (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Eye'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeSecureTextField'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeSecureTextField (1)'), 0)

Mobile.setText(findTestObject(''), 'Babilonia123+', 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Ingresa'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Ingresa (1)'), 0)

Mobile.takeScreenshot('/var/folders/b8/rw33sszs53n68nyp0rg6_pq40000gn/T/screenshot8297280794817201056.png')

Mobile.closeApplication()

