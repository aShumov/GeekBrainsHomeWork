package homeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
/*
3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 */
        Cat cat = new Cat("Васька",200);
        Cat cat2 = new Cat("Рыжик", 200);
        Dog dog = new Dog("Мухтар",500,10);

        cat.runOn(150);
        cat.swimOn(1);
        cat2.runOn(201);
        cat2.swimOn(20);
        dog.runOn(550);
        dog.swimOn(11);

    }
}
