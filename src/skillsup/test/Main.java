package skillsup.test;

import com.skillsup.animal.Animal;
import com.skillsup.animal.impl1.Cat;

public class Main {
    public static void main(String args[]){
        Animal murchik = new Cat("Мурчик");
        Cat max = new Cat("Макс");

        //наблюдаем полиморфизм в действии
        max.sleep();
        murchik.sleep(); 
        //пробуем создавать объекты разных типов, с типом референса интерфейсов,
        //абстрактных классов или конкретных классов, вызываем метода объектов обращаем внимание на результат,
        //если не понятен результат, задаем вопросы

    }
}
