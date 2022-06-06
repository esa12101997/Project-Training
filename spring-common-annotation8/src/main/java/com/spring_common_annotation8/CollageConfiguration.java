package com.spring_common_annotation8;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.napier.it.spring_common_annotation8")
@Configuration
@PropertySource("classpath:collage-info.properties")
//@PropertySource(value =  "collage-info.properties" )
public class CollageConfiguration {

	/*
	 * @Bean public Teacher mathTeacher() { return new MathTeacher(); }
	 * 
	 * @Bean public Principle principleBean() { return new Principle(); }
	 * 
	 * // @Bean(name = {"collBean","anothehrName"})
	 * 
	 * @Bean public Collage collageBean1() { Collage col = new Collage();
	 * col.setPrincliple(principleBean()); col.setTeacher(mathTeacher()); return
	 * col; }
	 */
}
