package t23;
//delete
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E4 {
	
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
		
		driver.get("http://collaborativemanagementsystemsqa.free.nf/view/Developer/code.php");
		Thread.sleep(1000);

		
		String projectName = "b"; 
		String deleteButtonXPath = "//tr[td[text()='" + projectName + "']]//a[contains(text(),'Delete')]";

		
			
			WebElement deleteButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[4]/a[2]"));
			deleteButton.click();
			Thread.sleep(1000);

			
			driver.switchTo().alert().accept();
			driver.switchTo().alert().accept();

		String desired_url = "http://collaborativemanagementsystemsqa.free.nf/view/Developer/code.php";
		String actual_url = driver.getCurrentUrl(); 
				
		if(desired_url.equals(actual_url)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}

