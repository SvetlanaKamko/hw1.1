package homeWork3;

public class HomeWork3 {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int clientOS = 1;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Ошибка. Вы не выбрали ОС: 0-iOS или 1-Android.");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2020;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не високосный.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня доставки");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня доставки");
        } else {
            System.out.println("Доставки нет.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц январь. Принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Месяц февраль. Принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Месяц март. Принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Месяц апрель. Принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Месяц май. Принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Месяц июнь. Принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Месяц июль. Принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Месяц июль. Принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Месяц сентябрь. Принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Месяц октябрь. Принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Месяц ноябрь. Принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Месяц декабрь. Принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Ошибка. Такого месяца не существует.");

        }

    }


}
