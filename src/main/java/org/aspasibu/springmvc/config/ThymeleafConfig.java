package org.aspasibu.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;

@Configuration
public class ThymeleafConfig {

	@Bean
	public ThymeleafViewResolver templateEngine() {
		ThymeleafViewResolver templateEngine = new ThymeleafViewResolver();
		templateEngine.setOrder(1);
		templateEngine.setViewNames(new String[] { "*.html", "*.xhtml" });
		return templateEngine;
	}
}
