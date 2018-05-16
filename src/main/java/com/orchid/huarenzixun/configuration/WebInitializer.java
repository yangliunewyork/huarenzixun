package com.orchid.huarenzixun.configuration;


import com.orchid.huarenzixun.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/***
 * Here we configure DispatcherServlet and the Spring application context
 * in the application's servlet context.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {

        return new String[] { "/" };
    }

}