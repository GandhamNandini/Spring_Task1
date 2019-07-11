package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
        Movie s=c.getBean("movie", Movie.class);
        s.displayActorInfo();

        //Resource r=new ClassPathResource("beans.xml");
        BeanFactory f=new ClassPathXmlApplicationContext("beans.xml");
        Movie m=(Movie)f.getBean("movie");
        m.displayActorInfo();


    }
}
