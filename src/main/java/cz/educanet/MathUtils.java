package cz.educanet;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findGreatestCommonDenominator(int a, int b) {
        int mensi = a;
        if (b < a) {// najde mensi cislo
            mensi = b;
        }
        for (int i = mensi; i > 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {// zjistuje co je delitelne
                return i;
            }
        }
        return 1;
        //throw new UnsupportedOperationException();
    }

    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findLowestCommonMultiple(int a, int b) {
        //throw new UnsupportedOperationException();
        int vetsi = a;
        if (b > a) {
            vetsi = b;
        }
        int i = vetsi;
        while (true) {
           if ((i % a == 0) && (i % b == 0)){// nachazi delitele
               return i;
           }
           i++;// aby se v dalsim kole hledalo dalsi cislo
        }
    }
}
