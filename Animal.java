import java.util.Scanner;

 public  class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

     class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

  class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("choose an animal: 1 for the dog and 2 for the cat");
        int choose = scanner.nextInt();

        if (choose == 1) {
            animal = new Dog();
        } else if (choose == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice.");
            animal = new Animal();
        }

        animal.makeSound();

    }
}