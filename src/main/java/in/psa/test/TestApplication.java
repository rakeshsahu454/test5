package in.psa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		String name="mike";
		int x =100;
		boolean is present=false;
		int y=200;
		char x ='a';
		

		SpringApplication.run(TestApplication.class, args);
	}

}
