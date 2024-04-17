public class Task7 {
    public static void main(String[] args) {
        int excessWeightInKilograms = 7;
        int excessWeightInGrams = excessWeightInKilograms * 1000;
        int minWeightLossPerDay = 250;
        int maxWeightLossPerDay = 500;
        int dayWeightLossWithLoss250Grams = excessWeightInGrams / minWeightLossPerDay;
        System.out.println(dayWeightLossWithLoss250Grams);
        int dayWeightLossWithLoss500Grams = excessWeightInGrams / maxWeightLossPerDay;
        System.out.println(dayWeightLossWithLoss500Grams);
        int averageNumberOfDaysForWeightLoss = (dayWeightLossWithLoss250Grams + dayWeightLossWithLoss500Grams) / 2;
        System.out.println(averageNumberOfDaysForWeightLoss);
    }
}
