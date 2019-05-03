package testcase;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CreateCompany;
import Page.CreateUser;
import Page.Login;
import Util.TestUtil;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCreateCompany extends TestBase{
		Login login;
		CreateCompany createCompany;
		CreateUser createUser;
		TestUtil testUtil;
		
		String sheetName = "contacts";

public TestCreateCompany(){
		super();	
		}
@BeforeMethod
public void setUp() throws InterruptedException{
		initialization();
		testUtil = new TestUtil();
		createCompany = new CreateCompany();
		login = new Login();
		createCompany = login.login(prop.getProperty("Email"), prop.getProperty("Password"));

		}


@DataProvider
public Object[][] getCRMTestData(){
	Object data[][] = TestUtil.getTestData(sheetName);
	return data;
}

@Test(dataProvider="getCRMTestData")
public void loginTest(String CompanyName,String Code ) throws InterruptedException, IOException{
//Test1
		createCompany.CreateCompany(CompanyName, Code);
}
	
@AfterMethod
public void endTest() {
		driver.close();

		}}
