import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class usingChromeCFT {
	public static void main(String[] args) {
		ChromeOptions ch = new ChromeOptions();
		ch.setBrowserVersion("116");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
}
