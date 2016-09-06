package master.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MasterSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringMvcApplication.class, args);
	}


/*
	@Configuration
	@Import(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class)
	@EnableConfigurationProperties({ WebMvcProperties.class,
			ResourceProperties.class })
	public static class WebMvcAutoConfigurationAdapter extends
			WebMvcConfigurerAdapter {}*/

}
