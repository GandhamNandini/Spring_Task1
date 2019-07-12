package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After all properties are set" +message);
    }
    public void initIt() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }
    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }



}
