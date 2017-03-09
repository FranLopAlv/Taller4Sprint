package py.edu.facitec.taller4.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.taller4.controller.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
    @Bean//metodo gestionable
   public InternalResourceViewResolver internalResourceViewResolver() {
	
       InternalResourceViewResolver resolver = new InternalResourceViewResolver();
                           //carpeta donde se ubicara el archivo
                      resolver.setPrefix("/WEB-INF/views/");
                           //la extencion del archivo
                      resolver.setSuffix(".jsp");
       return resolver;
   }

}
