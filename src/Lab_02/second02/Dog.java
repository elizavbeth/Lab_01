package Lab_02.second02;

import Lab_03.Pet;

public class Dog extends Pet {
    public static int count = 0;

    public Dog() {
        super();
        count++;
    }

    public Dog(String name, int age) {
        super(name, age);
        count++;
    }

    public Dog(int age) {
        this.age = age;
        count++;
    }

    public Dog(int age, String name) {
        if (age == 0) {
            name = "Unknown";
        }
        this.name = name;
        this.age = age;
    }

    public Dog(int name, int age) {
    }

    public void voice() {
        for (int i = 0; i < age; i++) {
            System.out.println("bark");
        }
    }
}
