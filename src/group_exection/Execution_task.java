package group_exection;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execution_task extends BaseClass {

	@Test(groups = {"smoke"})
	public void taskExection()
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	}
}
