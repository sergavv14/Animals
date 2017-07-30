package com.skillsup.animal;

public abstract class WildAnimal implements Animal {
    // мы не указали явно интерфейс, поэтому java на этапе компиляции добавит дефолтный

    public void sleep(){
        System.out.println("Я сплю в природной среде обитания");
    }

    abstract void steelChicken();
}

