package homeWork7;
/*
1. Расширить задачу про котов и тарелки с едой.
 */
public class Main {
    public static void main(String[] args) {

        //Cat mуCat = new Cat("Рыжик", 10);
        //Person host = new Person();

/*
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
и потом вывести информацию о сытости котов в консоль.
 */

        Cat[] cats = {
                new Cat("Рыжик", 7),
                new Cat("Барсик", 12),
                new Cat("Пушок", 10),
        //    new Cat("Рыжик", 7, host),
        //    new Cat("Барсик", 12, host),
        //    new Cat("Пушок", 10, host),
        //    new Cat("Васька",9, host),
        //    new Cat("Валера",9, host)
        // С большим количеством котов требуется кормить большее количество раз (for)
        // или надо как-то оптимизировать цикл for
        };

        Plate myPlate = new Plate(20);
        myPlate.info();

        for (Cat cat : cats) {
            cat.eat(myPlate);
            myPlate.info();
        }
        for (Cat cat : cats) {
            cat.eat(myPlate);
            myPlate.info();
        }

        //for (Cat cat : cats) {
        //    cat.eat(myPlate);
        //    myPlate.info();
        //}

        //mуCat.eat(myPlate);
        //myPlate.info();
    }
}
