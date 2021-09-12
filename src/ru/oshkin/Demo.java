package ru.oshkin;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo { //
    //      В основной программе: Создайте ArrayList Animal ##Создайте в консоли меню, при входе в приложение на экран
//      выводится запрос команды add/list/exit Команды оформить в enum При вводе команды она
//      должна быть регистронезависимой и обрезать
//      пробелы в начале и конце ##Если add спросить какое животное(cat/dog/duck) Спросить имя,
//      возраст, вес, цвет Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
//      Вернуться к главному//  меню ##Если list Вывести на экран метод toString() для всех елементов массива
//      ##Если exit выйти из программы
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        boolean b = true;
        while (b) {
            System.out.print("Выберете add/list/exit:");
            String input = scanner.nextLine();
            Command command = Command.valueOf(input.trim().toUpperCase());
            switch (command) {
                case ADD:
                    Animal animal = buildAnimal();
                    animals.add(animal);
                    break;
                case LIST:
                    for (Animal value : animals) {
                        System.out.println(value.toString());
                    }
                    break;
                case EXIT:
                    b = false;
                    break;
                default:
                    System.out.println("Ошибочный ввод");

            }
        }
    }

    /**
     * Считываем с клавиатуры и возвращаем объект
     * класса Animal
     */
    private static Animal buildAnimal() {
        System.out.println("Выберите животное, которое вы хотите создать cat/dog/duck");
        String input = scanner.nextLine();
        Animal animal; // ссылка на объект
        switch (input) {
            case "cat":
                animal = new Cat();
                fillData(animal);
                break;

            case "dog":
                animal = new Dog();
                fillData(animal);
                break;

            case "duck":
                animal = new Duck();
                fillData(animal);
                break;
            default:
                throw new IllegalStateException("Необходимо было выбрать cat/dog/dcuck: " + input);
        }
        return animal;
    }

    private static void fillData(Animal animal) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        animal.setName(name);

        System.out.println("Введите цвет");
        String color = scanner.nextLine();
        animal.setColor(color);

        System.out.println("Введите вес:");
        double weight = scanner.nextDouble();
        animal.setWeight(weight);

        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        animal.setAge(age);
        scanner.nextLine();
    }
}
