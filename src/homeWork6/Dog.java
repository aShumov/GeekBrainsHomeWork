package homeWork6;/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть.
В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 */

public class Dog extends Animal {
    public Dog(String name, float runLimit, float swimLimit) {
        super(name, runLimit, swimLimit);
    }
}

/*
4. В коде должно отсутствовать дублирование
(при дублировании можно заметить кусочки кода с одинаковой логикой, разница лишь в значениях).
*/