package homeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    //private Person host;
    //public Cat(String name, int appetite, Person host){

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        isFull = false;

        //this.host = host;
    }
    public void addFood(Plate plate, int food) {
        System.out.println(name + " нажимает на педальку добавления еды"); // у них автоматизированная кормушка
        plate.increaseFood(food);
    }

/*
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
 */

    public void eat(Plate plate) {
        if (plate.enoughFood(appetite) && !isFull) {
            System.out.println(name + " ест");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (isFull) {
            System.out.println(name + " наелся");
        }

/*
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 */

        else if (!plate.enoughFood(appetite)) {
            System.out.println(name + " недоволен, в тарелке мало еды");
            addFood(plate, appetite);

            //host.addFood(plate, appetite);
        }
    }
}
