package mq.data_driven_testing_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Script02 {

	
	@DataProvider( name="data-provider")
	public Object[][] dataProviderMethod(){
		Object[][] tmp = new Object[][]{{"data one"},{"data two"},{"data three"}};
		return tmp;
	}
	
	@Test(dataProvider = "data-provider" , dataProviderClass =Script02.class)
	public void test01(String data){
		System.out.println(data);
	}
}
