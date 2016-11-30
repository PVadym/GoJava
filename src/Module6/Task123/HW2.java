package Module6.Task123;

import java.util.Arrays;

/**
 * Created by Вадим on 29.11.2016.
 */
public class HW2 {

    public static void main(String[] args) {

        int [] intArray = new int[10];
        for (int i =0; i < intArray.length; i++ ) {
            intArray[i] = (int) ((Math.random()*2 - 1) * 100);;
        }

        System.out.println(Arrays.toString(intArray));

        System.out.println(ArraysUtils.sum(intArray));
        System.out.println(ArraysUtils.min(intArray));
        System.out.println(ArraysUtils.max(intArray));
        System.out.println(ArraysUtils.maxPositive(intArray));
        System.out.println(ArraysUtils.multiplication(intArray));
        System.out.println(ArraysUtils.modulus(intArray));
        System.out.println(ArraysUtils.secondLargest(intArray));

        System.out.println(Arrays.toString(ArraysUtils.reverse(intArray)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(intArray)));


    }
}
