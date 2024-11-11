package group_exection;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_users extends BaseClass {

	@Test(groups = {"sanity"})
	public void executeUser()
	{
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
	}
}
