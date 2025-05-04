package lowestPriceDate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LowestDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		Thread.sleep(2000);
	List<WebElement> prices=	driver.findElements(By.xpath("//p[@class=' todayPrice']"));
	List<WebElement> Dates = driver.findElements(By.xpath("//p[@class=' todayPrice']/preceding-sibling::*"));
	List<Integer> priceList = new ArrayList();
	
for(WebElement p :prices) {

	//priceList.add(Integer.parseInt(p.getText().replace(",", "")));
	priceList.add(Integer.parseInt(p.getText().replace(",","")));
}
	
int minPrice = Collections.min(priceList);

List<Integer> minPriceDates = new ArrayList();

for(int i = 0;i<priceList.size();i++) {
	if(priceList.get(i)==minPrice) {
		minPriceDates.add(Integer.parseInt(Dates.get(i).getText()));
	}
}

//int indexOfMinPrice = priceList.indexOf(minPrice);
//System.out.println(Dates.get(indexOfMinPrice).getText());
for(int i = 0;i<minPriceDates.size();i++) {
	System.out.println(minPriceDates.get(i));
}

	
	driver.quit();
	}
	
	

}
