package br.com.dominio.creditManagement.docs;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Iago Magalhães 25/04/2019
 *Class responsible for generating System Documentation
 */
//@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	 public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("endpoint"))
	                .paths(PathSelectors.any())	                
	                .build()
	                .apiInfo(metaData());
	    }
	@SuppressWarnings({ "deprecation"})
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Gerenciamento de Crédito by Iago Magalhães")
				.description("Customer CRUD and interest control over risk by Iago Magalhães")
				.version("1.01")
				.contact("iagomagalhaess@gmail.com")
				.license("Apache License Version 2.0")
				.licenseUrl("Url apache")
				.build();
	}

}
