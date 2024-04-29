package homeWork1;

public class Task8 {
    public static void main(String[] args) {
        int startSalaryMasha = 67760;
        int startSalaryDenis = 83690;
        int startSalaryKristina = 76230;
        double newSalaryMasha = startSalaryMasha * 1.1;
        double newSalaryDenis = startSalaryDenis * 1.1;
        double newSalaryKristina = startSalaryKristina * 1.1;
        double differenceInSalaryMasha = newSalaryMasha - startSalaryMasha;
        double differenceInSalaryDenis = newSalaryDenis - startSalaryDenis;
        double differenceInSalaryKristina = newSalaryKristina - startSalaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceInSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceInSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceInSalaryKristina + " рублей.");
    }
}
