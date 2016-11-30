package Module6.Task123;

/**
 * Created by Вадим on 29.11.2016.
 */
public final  class ArraysUtils {

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }


    public static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }



    public static String maxPositive(int array[]) {
        int maxPositive;
        if (max(array) > 0)  {
            maxPositive= max(array);
            return String.valueOf(maxPositive);
        }
        return "All negative";


    }

    public static long multiplication(int array[])
    {
        long multiplication=1;
        for (int i = 0; i < array.length; i++) {
            multiplication*= array[i];
        }
        return multiplication;
    }

    public static int modulus(int array[])
    {
        int modulus=array[0]%array[array.length-1];

        return modulus;
    }

    public static int secondLargest(int array[])
    {
        int firstLargest=array[0];
        int secondLargest=array[1];

        for(int i=2; i<array.length; i++)
        {
            if (array[i] > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
            else
            if ((array[i] < firstLargest)&&(array[i]> secondLargest)) secondLargest=array[i];

        }
        return secondLargest;

    }

    public static int [] reverse(int [] array){
        int[] arrayReverse = new int[array.length];
        for (int i = 0, j=arrayReverse.length-1; i < array.length;j--, i++){
             arrayReverse[j] = array[i];
        }

        return arrayReverse;
    }

    public static int [] findEvenElements (int [] array){

        int count = 0;
        for (int i:array){
            if (i%2==0) count++;
        }
        int [] arrayEven = new int[count];
        for (int i = 0,j =0; i < array.length; i++){
            if (array[i]%2==0){arrayEven[j] = array[i];
            j++;}
        }
        return arrayEven;
    }

}
