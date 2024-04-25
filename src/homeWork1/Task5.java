package homeWork1;

public class Task5 {
    public static void main(String[] args) {
        int totalBottles = 16;
        int totalMinutes = 2;
        int bottlesPerMinute = totalBottles / totalMinutes;
        int bottlesFor20 = bottlesPerMinute * 20;
        int bottlesForDay = bottlesPerMinute * 1440;
        int bottlesFor3Day = bottlesForDay * 3;
        int bottlesPerOneMonth = bottlesForDay * 30;

        System.out.println("За 20 минут машина произвела " + bottlesFor20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesForDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesFor3Day + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesPerOneMonth + " штук бутылок.");

    }
}
