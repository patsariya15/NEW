package testkarna;

import org.testng.annotations.Test;

public class TestData {
	@Test
	public void readdata() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		
		
	}
}
