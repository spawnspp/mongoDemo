package com.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringFactory implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringFactory.applicationContext = applicationContext;
    } 

    public static ApplicationContext getContext() {
        return applicationContext;
    }

    
    public static Object getbean(String name) {
    	return getContext().getBean(name);
    }
    
}