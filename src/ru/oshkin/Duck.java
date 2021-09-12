package ru.oshkin;
//#5) Создайте класс Duck унаследуйте его от Animal, реализуйте интерфейс Flying
// Переопределить метод Say(Вывод на экран: "Кря") Реализовать метод Fly(Вывод на экран: "Я лечу")

public class Duck extends Animal implements Flying {
    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }
}
