public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int temperature = 3;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int speed = 70;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        int age = 23;

        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age >= 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        int age = 10; // возраст ребёнка

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        int capacity = 102;
        int numSeats = 60;
        int passengers = 20;

        if (passengers < numSeats) {
            System.out.println("Есть свободные сидячие места");
        } else if (passengers < capacity) {
            System.out.println("Есть только стоячие места");
        } else {
            System.out.println("Вагон полностью заполнен");
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int one = 1;
        int two = 5;
        int three = 4;

        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}