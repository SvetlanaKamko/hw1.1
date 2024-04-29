package homeWork1;

public class Task6 {
    public static void main(String[] args) {
        int numberOfBananas = 5;
        int bananaWeight = 80;
        int milkWeightInMilliliters = 200;
        int gramsIn100Milliliters = 105;
        int numberOfIceCream = 2;
        int iceCreamWeight = 100;
        int numberOfRawEggs = 4;
        int eggWeight = 70;
        int milkWeightInGrams = milkWeightInMilliliters / 100 * gramsIn100Milliliters;
        int breakfastWeightInGrams = numberOfBananas * bananaWeight + milkWeightInGrams + numberOfIceCream * iceCreamWeight + numberOfRawEggs * eggWeight;
        System.out.println(breakfastWeightInGrams);
        int breakfastWeightInKilograms = breakfastWeightInGrams / 1000;
        System.out.println(breakfastWeightInKilograms);
        int remainderInGrams = breakfastWeightInGrams % 1000;
        System.out.println(remainderInGrams);

    }
}
