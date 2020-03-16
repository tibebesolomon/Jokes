package com.ethiopia.app.jokes.Recycler;

/**
 * Created by tibsolg on 2/21/2017.
 */
public class Jokes {

    private String name;
    private String description;

    public Jokes(String name,String description) {
        this.name = name;
        this.description=description;
    }
    public String getDescription(){return description;}
    public void setDescription(){
        this.description=description;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
