package sk.upjs.ics.novotnyr.mstd.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("sk.upjs.ics.novotnyr.mstd.web")
public class WebApplicationContext  {
	/*
	 *  nothing to do here,
	 *  all beans are autodiscovered
	 */
}
