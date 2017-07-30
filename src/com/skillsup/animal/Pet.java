package com.skillsup.animal;

public abstract class Pet implements Animal {
    //constructor
    Pet(String name){
        this.name = name;
    }

    private String name;
    //protected is available in child classes
    protected String ownerName;

    //geter
    public String getName() {
        return name;
    }

    //overridden method
    public void sleep(){
        System.out.println("Я сплю в постели хозяина");
    }

    // new abstract mathod
    abstract void peelnTray();
}
