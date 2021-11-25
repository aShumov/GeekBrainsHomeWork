package homeWork7;

public class Plate {
    private int food;


    public Plate(int food){
        this.food = food;
    }

    public boolean enoughFood(int appetite) {
        return appetite <= food; }

/*
7. decreaseFood должен иметь возвращаемый тип void
 */

    public void decreaseFood(int appepite) {
        if (!enoughFood(appepite)) {
            System.out.println("Кошкам не хватает еды в тарелке");
        }
        else {
            food = food - appepite;
        }
    }


    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }

    //public void decreaseFood(int appepite){
    //    this.food -= appepite;
    //}

/*
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

    public void increaseFood(int countOfFood) {
        if (countOfFood < 0) {
            return;
        }
        food += countOfFood;
    }
}
