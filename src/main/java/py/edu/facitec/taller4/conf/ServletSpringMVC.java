package py.edu.facitec.taller4.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	protected Class<?>[] getRootConfigClasses() {
	
	return new Class[]{AppWebConfiguration.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
	    return null;
	}
	
	protected String[] getServletMappings() {
	
	return new String[] {"/"};
	}
}
