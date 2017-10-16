package Login;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String a = driver.getTitle();
		System.out.println(a);
		System.out.println("Welcome to class");
		System.out.println("Welcome to class");
		System.out.println("Selenium Class");
		

	}

}
