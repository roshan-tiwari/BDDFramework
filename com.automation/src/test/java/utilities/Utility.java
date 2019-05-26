package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;


public class Utility {

	Utility util;
	private String key;
	private String value;

	public void patternmatch(String key, String value)
	{
		Pattern p = Pattern.compile(key);
		// get a matcher object
		Matcher m = p.matcher(value);

		StringBuffer sb = new StringBuffer();      
	}
	
//	public String replaceParameterizedValuesInString(String value) {
//
//        Pattern pattern = Pattern.compile("\\{\\{.*?}}");
//
//        Matcher matcher = pattern.matcher(value);
//
//        StringBuffer sb = new StringBuffer();
//
//
//
//        while (matcher.find()) {
//
//               String keyword = matcher.group().replaceAll("\\{\\{", "").replaceAll("\\}\\}", "");
//
//
//
//               try {
//
//                     matcher.appendReplacement(sb, this.getPropertyKey(keyword));
//
//               } catch (NullPointerException var7) {
//
//                     throw new NullPointerException("From properties file:" + this.getPropertyKey(keyword) + "keyword: "
//
//                                   + keyword + " not found in the envConfig properties file.");
//
//               }
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
			System.out.println("Element no clicked");
		}

	}
}



