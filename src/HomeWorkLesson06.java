import java.util.Scanner;

public class HomeWorkLesson06 {

    public static void main (String[] args) {
        Cat cat = new Cat("Муська");
        Dog dog = new Dog("Шарик");
        Cat catOne = new Cat("Мурзик");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите столько бежит кошка " + cat.name);
        int lengCat = scanner.nextInt();
        if (lengCat <= 200) cat.run(lengCat);
        else System.out.println(cat.name + " столько не пробежит!!!");
        System.out.println("Введите столько бежит собака " + dog.name);
        int lengDog = scanner.nextInt();
        if (lengDog <= 500) dog.run(lengDog);
        else System.out.println(dog.name + " столько не пробежит!!!");

        System.out.println("Введите столько проплывет кошка " + cat.name);
        int distСat = scanner.nextInt();
        cat.swim(distСat);
        System.out.println("Введите столько проплывет собака " + dog.name);
        int distDog = scanner.nextInt();
        if (distDog <= 10) dog.swim(distDog);
        else System.out.println(dog.name + " столько не проплывет!!!");

        System.out.println();
        System.out.println("Всего кошек " + Cat.count);
        System.out.println("Всего собак " + Dog.count);
        System.out.println("Всего животных " + Animal.count);
    }
}
