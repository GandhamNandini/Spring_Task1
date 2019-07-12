package com.stackroute.domain;

public class Movie {
    private Actor actor;

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
}
