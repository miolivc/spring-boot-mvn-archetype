#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.personrestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonRestAppApplication.class, args);
	}
}
