package org.javaee.web.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.SpringProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiLocatorDelegate;

@SpringBootApplication
@EntityScan({"org.javaee.web.hello.entity"})
@EnableJpaRepositories({ "org.javaee.web.hello.repository" })
public class HelloApplication {

	public static void main(String[] args) {
		SpringProperties.setFlag(JndiLocatorDelegate.IGNORE_JNDI_PROPERTY_NAME);
		
		SpringApplication.run(HelloApplication.class, args);
	}

}
