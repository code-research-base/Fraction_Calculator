package logic;

import design.exceptions.NoCommonDivisorsException;

import java.util.ArrayList;

class SimplificationMethods {


    static double[] getDivisors(double number) {
        ArrayList<Double> possibleDivisors =  new ArrayList<>();
        for (double i = 1; i <= number / 2; i++)
            if (number % 1 == 0)
                possibleDivisors.add(i);
        possibleDivisors.add(number);
        return arrayListToArray(possibleDivisors);
    }

    static double[] getCommonDivisors(double[] divisors1, double[] divisors2) throws NoCommonDivisorsException {
        ArrayList<Double> possibleCommonDivisors = new ArrayList<>();
        for (double divisor1 : divisors1)
            for(double divisor2 : divisors2)
                if (divisor1 == divisor2) {
                    possibleCommonDivisors.add(divisor1);
                    break;
                }
        if (possibleCommonDivisors.size() == 0)
            throw new NoCommonDivisorsException("");
        possibleCommonDivisors.remove(0);
        return reverse(arrayListToArray(possibleCommonDivisors));
    }

    private static double[] arrayListToArray(ArrayList<Double> arrayList) {
        double[] array = new double[arrayList.size()];
        for (Double item : arrayList)
            array[arrayList.indexOf(item)] = item;

        return array;
    }

    private static double[] reverse(double[] array) {
        double[] temp = new double[array.length];
        int tempIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            temp[tempIndex] = array[i];
            tempIndex++;
        }

        return temp;
    }
}
