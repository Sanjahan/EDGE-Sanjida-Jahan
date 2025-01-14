package t23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Libs\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://collaborativemanagementsystemsqa.free.nf/view/login.php");
		
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("james");
		driver.findElement(By.name("password")).sendKeys("james@08");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(500);
		
		String actual_url = driver.getCurrentUrl();
		String desired_url = "http://collaborativemanagementsystemsqa.free.nf/view/Developer/loggedDashboard.php";
		
		if (actual_url.equals(desired_url)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}

