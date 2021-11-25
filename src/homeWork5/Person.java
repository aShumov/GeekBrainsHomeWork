package homeWork5;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Person {
    String fullName;
    String position;
    String email;
    String tel;
    int salary;
    int age;

// 2. Конструктор класса должен заполнять эти поля при создании объекта.

    Person (String fullName, String position, String email, String tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    void info() {
        System.out.println("ФИО: " + fullName + "; Должность: " + position + "; email: " + email + "; Зарплата: " + salary + "; Возраст: " + age);
    }

}
