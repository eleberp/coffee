package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelOrder {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize Chrome browser
		ChromeDriver driverChrome = new ChromeDriver();
		
		//Open olx.ro
		driverChrome.get("https://www.olx.ro/");
		
		//Maximize window
		driverChrome.manage().window().maximize();
		
		Thread.sleep(8000);
		
		//Accept cookies
		driverChrome.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		//Go to 'Contul meu'
		driverChrome.findElement(By.xpath("//*[@id=\"hydrate-root\"]/header/div/div/div[2]/a")).click();
		
		Thread.sleep(8000);
		
		//Enter e-mail address
		driverChrome.findElement(By.xpath("//input[@type='email']")).click();
		driverChrome.findElement(By.xpath("//input[@type='email']")).sendKeys("elenaberdilap@gmail.com");
		
		//Enter password
		driverChrome.findElement(By.xpath("//input[@type='password']")).click();
		driverChrome.findElement(By.xpath("//input[@type='password']")).sendKeys("testO123LX");
		
		Thread.sleep(8000);
		
		//Click on 'Intra in cont' button
		driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div[2]/div[2]/div[2]/form/button[2]/span/span")).click();
		
		//Click on 'Livrare prin OLX' button
		driverChrome.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/ul/li[8]/a")).click();
		
		Thread.sleep(8000);
		
		//Click on 'Refuza' button
		//No such button found => a bug report should be made :D
		

	}

}
