package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;
    ApplicationContext context;
    private ApplicationContextAware applicationContextAware;
    private  BeanFactoryAware beanFactoryAware;
    private  BeanNameAware beanNameAware;


    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public Actor getActor()
    {
        return actor;
    }

    public void setActor(Actor actor)
    {

        this.actor = actor;
    }
@Override
    public String toString()

    {
        return "Details : " + actor.toString();
    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}
