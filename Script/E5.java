package t23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E5 {

	public static void login(ChromeDriver driver) throws InterruptedException {
		driver.get("http://collaborativemanagementsystemsqa.free.nf/view/login.php");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("james");
		driver.findElement(By.name("password")).sendKeys("james@08");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(500);
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Libs\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		login(driver);
		
		driver.findElement(By.xpath("/html/body/main/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/form/div[1]/input[1]")).click();
		String projectName = "DAKU";
		String searchButtonXPath = "//tr[td[text()='" + projectName + "']]//a[contains(text(),'Search')]";
		Thread.sleep(500);
		
		
		String desired_url = "http://collaborativemanagementsystemsqa.free.nf/view/Developer/code.php";
		String actual_url = driver.getCurrentUrl(); 
				
		if(desired_url.equals(actual_url)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}








///html/body/form/div[1]/input[1]