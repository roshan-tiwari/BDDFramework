package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import dataProvider.DataProvider;


public class Utility {

	Utility util;
	WebDriverWait wait;
	WebDriver driver;
	DataProvider dataProvider;

	public void patternmatch(String value)
	{
		Pattern p = Pattern.compile("\\{\\{.*?}}");
		// get a matcher object
		Matcher m = p.matcher(value);

		StringBuffer sb = new StringBuffer(); 

		while (m.find()) {

			String keyword = m.group().replaceAll("\\{\\{", "").replaceAll("\\}\\}", "");

			try {
				m.appendReplacement(sb,this.dataProvider.getProperty(value));

			}catch (Exception e) {

				throw new NullPointerException("From properties file:" + this.dataProvider.getProperty(value) + "keyword: "
						+ keyword + " not found in the envConfig properties file.");
			}
		}

	}


	///*	
	////	public String replaceParameterizedValuesInString(String value) {
	////
	////        Pattern pattern = Pattern.compile("\\{\\{.*?}}");
	////
	////        Matcher matcher = pattern.matcher(value);
	////
	////        StringBuffer sb = new StringBuffer();
	////
	////
	////
	////        while (matcher.find()) {
	////
	////               String keyword = matcher.group().replaceAll("\\{\\{", "").replaceAll("\\}\\}", "");
	////
	////
	////
	////               try {
	////
	////                     matcher.appendReplacement(sb, this.getPropertyKey(keyword));
	////
	////               } catch (NullPointerException var7) {
	////
	////                     throw new NullPointerException("From properties file:" + this.getPropertyKey(keyword) + "keyword: "
	////
	////                                   + keyword + " not found in the envConfig properties file.");
	////
	////               }
	//
	//        }
	//
	//
	//
	//        matcher.appendTail(sb);
	//
	//        return sb.toString();
	//
	// }


	public static void takeScreenShot(WebDriver driver, String screenshotname){

		try{	
			TakesScreenshot takescreenshot= (TakesScreenshot)driver;
			File source = takescreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/" +screenshotname+ ".png"));
		}
		catch (Exception e) {
			System.out.println("No screenshot captureds" +e.getMessage());
		}	
	}

	public void iclickon(WebElement element) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			if (element != null) {
				element.click();
				return;
			}
		}
		catch(Exception e)
		{
			System.out.println("Element not clicked");
		}

	}

	public void i_wait_for_seconds(int arg1) throws Throwable {

		wait = new WebDriverWait(driver, 10);

	}
}



