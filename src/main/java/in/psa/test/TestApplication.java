package in.psa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		String name="mike";
		int x =100;
		int y=200;
		double z=10.3;
		boolean is present=false;
		float m=10.3f;
		SpringApplication.run(TestApplication.class, args);
	}

}
