package homeWork2;

public class Tasks {
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
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int outsideTemperature = 25;
        if (outsideTemperature >= 5) {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int personsAge = 20;
        boolean kindergarten = personsAge >= 2 && personsAge <= 6;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в детский сад.");
        }
        boolean school = personsAge >= 7 && personsAge <= 18;
        if (school) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в школу.");
        }
        boolean university = personsAge > 18 && personsAge <= 24;
        if (university) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в университет.");
        }
        boolean job = personsAge > 24;
        if (job) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить на раьоту.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int childsAge = 7;
        boolean ageIsNotForAttractions = childsAge < 5;
        if (ageIsNotForAttractions) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему нельзя кататься на аттракционах.");
        }
        boolean ageRestrictionsForAttractions = childsAge >= 5 && childsAge < 14;
        if (ageRestrictionsForAttractions) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        boolean ageForAttractions = childsAge >= 14;
        if (ageForAttractions) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int countOfPassengerWhoWantToBoard = 54;
        int seatsOccupied = 31;
        int standingOccupied = 32;
        int carriageCapacity = 102;
        int seatPlace = 60;
        int standingPlace = carriageCapacity - seatPlace;
        boolean theCarriageIsFull = (standingOccupied + seatsOccupied) == carriageCapacity;
        if (theCarriageIsFull) {
            System.out.println("В вагоне нет свободных мест.");
        }
        boolean freePlace = countOfPassengerWhoWantToBoard <= (carriageCapacity - seatsOccupied - standingOccupied);
        if (freePlace) {
            System.out.println("Вcе желающие " + countOfPassengerWhoWantToBoard + " пассажира могут войти в вагон");
        } else {
            System.out.println("На всех желающих войти пассажиров мест не хватит.");
        }
        boolean freeSeatsPlace = seatsOccupied < seatPlace && standingOccupied <= standingPlace;
        if (freeSeatsPlace) {
            System.out.println("В вагоне есть " + (seatPlace - seatsOccupied) + " свободных сидячих мест.");
        } else {
            System.out.println("В вагоне нет свободных сидячих мест.");
        }
        boolean freeStandingPlace = standingOccupied < standingPlace && seatsOccupied <= seatPlace;
        if (freeStandingPlace) {
            System.out.println("В вагоне есть " + (standingPlace - standingOccupied) + " свободных стоячих мест");
        } else {
            System.out.println("В вагоне нет свободных стоячих мест.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int one = 180;
        int two = 18;
        int three = 180;

        if (one >= two) {
            if (one >= three) {
                System.out.println("Число " + one + " является большим из представленных.");
            }
        }
        if (two > one) {
            if (two >= three) {
                System.out.println("Число " + two + " является большим из представленных.");
            }
        }
        if (three > one) {
            if (three > two) {
                System.out.println("Число " + three + " является большим из представленных");
            }
        }

    }
}
