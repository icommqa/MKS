package com.aiite.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;


	public static void browserLaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static String excelReadCell(int rowNumber, int columnNumber) throws IOException{
		File file = new File("C:\\Users\\user\\Desktop\\Data\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);

		Sheet sheet = wk.getSheet("Sheet1");
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);

		String value = cell.getStringCellValue();

		return value;
	}
	
	public static String fileRead(String key) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\ProjectClass7\\src\\test\\resources\\Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties po = new Properties();
		po.load(fis);
		String value = po.getProperty(key);
		return value;
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
