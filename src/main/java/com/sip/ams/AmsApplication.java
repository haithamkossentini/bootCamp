package com.sip.ams;

import java.util.ArrayList;
import java.util.List;
import com.sip.ams.entities.Provider ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class AmsApplication {

	public static List<Provider> providers =  new ArrayList<>();
	public static void main(String[] args) {
		
		Provider p1 = new Provider("Nokia","nokia@hotmail.fr","China",1,"des1");
		Provider p2 = new Provider("Samsung","samsung@gmail.com","Korea",2,"des2");
		Provider p3 = new Provider("HP","hp@gmail.com","USA",3,"des3");
		providers.add(p1);
		providers.add(p2);
		providers.add(p3);
		SpringApplication.run(AmsApplication.class, args);
		//System.out.println(providers);
	}

}
