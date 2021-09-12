package ru.oshkin;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + " " + buildAge(age) + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String buildAge(int age) {
        age = age % 100;
        if (age == 0) {
            return "лет";
        }
        if (age >= 5 && age <= 20) {
            return "лет";
        }
        age = age % 10;
        if (age == 1) {
            return "год";
        }
        if (age >= 2 && age <= 4) {
            return "года";
        } else {
            return "лет";
        }
    }
}
