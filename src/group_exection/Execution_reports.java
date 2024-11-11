package group_exection;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execution_reports extends BaseClass{
	
	@Test(groups = {"smoke","sanity"})
	public void executeReports()
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	}

}
