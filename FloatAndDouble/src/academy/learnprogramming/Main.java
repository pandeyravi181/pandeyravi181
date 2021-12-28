package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 12 / 5;
        float myFloatValue = 12f / 5f;
        double myDoubleValue = 12d / 5d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue=" + myFloatValue);
        System.out.println("MyDoubleValue=" + myDoubleValue);

        double numberOfPonds = 200d;
        double numberOfKilogram = numberOfPonds * 0.45359237d;
        System.out.println("Converted Kilogram = " + numberOfKilogram);

    }
}
