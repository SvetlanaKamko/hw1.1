public class Task4 {
    public static void main(String[] args) {
        int allWhiteAndBrown = 120;
        int oneClassWhite = 2;
        int oneClassBrown = 4;
        int oneClassColor = oneClassBrown + oneClassWhite;
        int allClass = allWhiteAndBrown / oneClassColor;
        int whiteColor = allClass * oneClassWhite;
        int brownColor = allClass * oneClassBrown;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски.");
    }
}
