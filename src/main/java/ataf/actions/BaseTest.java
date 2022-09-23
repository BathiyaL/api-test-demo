package ataf.actions;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ataf.constants.ProgramConstants;

public class BaseTest {

	protected URI baseURI;
	public static WebDriver driver;

	protected void bindBaseURL(String baseurlParameter) throws URISyntaxException {		
		if(baseurlParameter==null || baseurlParameter.isEmpty() || baseurlParameter.contains(ProgramConstants.TESTNG_PARM_VALUE_NOT_FOUND_MSG)) {
			baseURI = new URI(ProgramConstants.DEFAULT_BASE_URL);

		} else {
			baseURI = new URI(baseurlParameter);
		}

	}
	
	@BeforeSuite
	@Parameters({"baseURL"})	
	public void setUp(@Optional(ProgramConstants.DEFAULT_BASE_URL) String baseurlParm) throws URISyntaxException {
		System.out.println(baseurlParm);
		String path = System.getProperty("user.dir");
		System.out.println(path);  
		System.setProperty("webdriver.chrome.driver" ,  path+"/src/test/resources/drivers/chromedriver");
		System.setProperty("webdriver.chrome.whitelistedIps","");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		
		driver = new ChromeDriver(options);
		//driver.get("http://google.com"); 
		this.bindBaseURL(baseurlParm);

	}
	
	public String getURL(String partilaURL) {
		return baseURI.resolve(partilaURL).toString();
	}
	
	@AfterSuite
	public void tearDownTestSuite() {
		System.out.println("After Suite");
		driver.quit();
	}
}
