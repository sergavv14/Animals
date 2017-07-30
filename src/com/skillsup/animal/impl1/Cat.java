package com.skillsup.animal.impl1;

import com.skillsup.animal.Pet;
import java.security.PublicKey;

public class Cat extends Pet {
    Cat(String name){
        super(name);
        this.ownerName = "Vasya";
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void eat(){
        System.out.println("Обожаю кушать рыбку, ммм");
    }

    public void sleepOnKeyBoerd(){
        System.out.println("Клавиатура тепленькая, я так люблю на ней спать, мур");
    }

    // мы предопределили поведение, заданое в родительськом классе
    @Override
    public void sleep() {
        this.sleepOnKeyBoerd();
    }

    public void peeOnTray(){
        System.out.println("Я никогда не писяю хозяину"+ownerName+"в тапки");
    }
}
