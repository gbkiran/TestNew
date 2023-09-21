 package testCases;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginCred_FormPage;
import utilities.BaseClass1;

public class TC1 extends BaseClass1 {

	@Test(priority = 1)
	public void preSetup() {
		openBrowser("Chrome", 50);
		openUrl();
	}

	@Test(priority = 2)
	public void login() {
		HomePage.ClickingTestingPage();
	}

	@Test(priority = 3, dataProvider = "supplyData")
	public void loginCredintals (String firstName, String lastName, String add, String nationalityCitizen, String gender, String interest)
	{
		LoginCred_FormPage.loginCred(firstName, lastName, add, nationalityCitizen, gender, interest);

	}

	
	@DataProvider
	public Object [][] supplyData() throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".//dataSet/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Login");
		
		int numrows = sh.getLastRowNum()+1;
		int numcols = sh.getRow(0).getLastCellNum();

		// Declaring each dimensions of two dimensional objects
		Object[][] dataSet = new Object[numrows][numcols];

		for (int row = 0; row <numrows; row++) {
			for (int col = 0; col < numcols; col++) {
				dataSet [row] [col] = sh.getRow(row).getCell(col).toString();
				
			}
		}
		return dataSet;
	}
	
	
	}  

