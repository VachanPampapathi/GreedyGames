package Package;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Package.Free_Single_App;

//Use this class to run on all of the top charted Apps

public class TopApps {

/**
 * @param args
 * @throws IOException
 * @throws ParseException
 * @throws InterruptedException 
 */
public static void main (String [] args) throws IOException, ParseException, InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "\\Users\\Vachan\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	
	
	driver.navigate().to("https://play.google.com/store/apps/top");
	
	Thread.sleep(2000);
	
	System.out.println("Scores of Top free apps");

	for(int i=1;i<5;i++){
	int path = i;
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/c-wiz[1]/div[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/c-wiz[1]/c-wiz[1]/div[1]/div[2]/div["+ path +"]")).click();			
	String URL =  driver.getCurrentUrl();
    Free_Single_App scoring = new Free_Single_App();
    scoring.single(URL);
    
    driver.navigate().back();
    
	}
	
	System.out.println("\n Scores of Top paid apps \n");

	
	for(int j=1;j<5;j++){
		int path = j;
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/c-wiz[1]/div[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/c-wiz[2]/c-wiz[1]/div[1]/div[2]/div["+ path +"]")).click();			
		String URL =  driver.getCurrentUrl();
	    Paid_Single_App scoring = new Paid_Single_App();
	    scoring.paid(URL);
	    
	    driver.navigate().back();
   
		}
	
	System.out.println("\n Scores of Top Grossing apps \n");

	for(int k=1;k<5;k++){
		int path = k;
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/c-wiz[1]/div[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/c-wiz[3]/c-wiz[1]/div[1]/div[2]/div["+ path +"]")).click();			
		String URL =  driver.getCurrentUrl();
	    Free_Single_App scoring = new Free_Single_App();
	    scoring.single(URL);
	    
	    driver.navigate().back();
		}
	
	System.out.println("\n Scores of Top Free games \n");

	
	for(int l=1;l<5;l++){
		int path = l;
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/c-wiz[1]/div[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/c-wiz[4]/c-wiz[1]/div[1]/div[2]/div["+ path +"]")).click();			
		String URL =  driver.getCurrentUrl();
	    Free_Single_App scoring = new Free_Single_App();
	    scoring.single(URL);
	    
	    driver.navigate().back();
		}
	
	System.out.println("\n Scores of Top Paid games \n");

	
	for(int m=1;m<5;m++){
		int path = m;
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/c-wiz[1]/div[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/c-wiz[5]/c-wiz[1]/div[1]/div[2]/div["+ path +"]")).click();			
		String URL =  driver.getCurrentUrl();
	    Paid_Single_App scoring = new Paid_Single_App();
	    scoring.paid(URL);
	    
	    driver.navigate().back();
   
		}
	System.out.println("\n Scores of Top Grossing games \n");

	
	for(int n=1;n<5;n++){
		int path = n;
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/c-wiz[1]/div[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/c-wiz[6]/c-wiz[1]/div[1]/div[2]/div["+ path +"]")).click();			
		String URL =  driver.getCurrentUrl();
	    Free_Single_App scoring = new Free_Single_App();
	    scoring.single(URL);
	    
	    driver.navigate().back();
		}
	
	
}

}


