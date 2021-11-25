package homeWork5;

public class FivePersons {
    public static void main(String[] args) {

//4. Создать массив из 5 сотрудников.

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Будыкин Денис Александрович", "Менеджер", "person1@gmail.com", "+79011111111", 45000, 27);
        persArray[1] = new Person("Меленцов Дмитрий Сергеевич", "Менеджер","person2@gmail.com", "+79022222222",45000, 27);
        persArray[2] = new Person("Маликов Максим Андреевич", "Начальник", "person3@gmail.com", "+79033333333", 100000, 44);
        persArray[3] = new Person("Яковлел Андрей Павлович", "Завхоз","person4@gmail.com", "+79044444444",60000, 40);
        persArray[4] = new Person("Шурбин Владимир Александрович", "Маргетолог", "person5@gmail.com", "+79055555555", 75000, 41);

// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        int age = 40;
        for (Person person : persArray) { //цикл foreach
            if (person.age > age) {
                person.info();
                System.out.println();
            }
        }
    }
}
