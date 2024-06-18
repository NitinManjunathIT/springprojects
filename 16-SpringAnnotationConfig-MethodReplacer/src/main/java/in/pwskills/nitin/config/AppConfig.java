package in.pwskills.nitin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "in.pwskills.nitin")
@ImportResource(locations = "in/pwskills/nitin/cfgs/applicationContext.xml")
public class AppConfig {

}
