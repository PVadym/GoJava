package Module2;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Вадим on 01.11.2016.
 ЗАДАНИЕ 1
 Input: array with size = 10 can be of one of two data types: int and double. Calculate:

 sum
 min/max
 max positive
 multiplication
 modulus of first and last element
 second largest element

 As a result you should have methods with following names :

 sum(int array[]), sum(double[])
 min(int array[]), min(double[])
 max(int array[]), max(double[])
 maxPositive(int array[]), maxPositive(double array[]),
 multiplication  (int array[]), multiplication (double[])
 modulus(int array[]), modulus(double[])
 secondLargest(int array[]), secondLargest(double[])
 */
public class HomeWork1 {
    public static void main(String[] args) {

        int[]arrayint=new int[10];
        double []arraydouble = new double[10];

        for(int i=0; i<10; i++) {
            arrayint[i] = (int) Math.round((Math.random() * 2 - 1) * 100);
            System.out.print(arrayint[i]+"\t"+"\t");

            arraydouble[i] = Math.random() * 10;
            System.out.println(arraydouble[i]);
        }



        System.out.println("sum(int array[])= "+sum(arrayint));
        System.out.println("sum(double array []) "+sum(arraydouble));
        System.out.println("min(int array[])= "+ min(arrayint));
        System.out.println("min(double array[])= "+ min(arraydouble));
        System.out.println("max(int array[])= "+ max(arrayint));
        System.out.println("max(double array[])= "+ max(arraydouble));
        System.out.println("maxPositive(int array[])= "+ maxPositive(arrayint));
        System.out.println("maxPositive(double array[])= "+ maxPositive(arraydouble));
        System.out.println("multiplication (int array[])= "+ multiplication(arrayint));
        System.out.println("multiplication (double array[])= "+ multiplication(arraydouble));
        System.out.println("modulus (int array[])= "+ modulus(arrayint));
        System.out.println("modulus (double array[])= "+ modulus(arraydouble));
        System.out.println("secondLargest (int array[])= "+ secondLargest(arrayint));
        System.out.println("secondLargest (double array[])= "+ secondLargest(arraydouble));
    }

    static int sum(int array [])
    {
        int sum=0;
        for(int i=0;i<array.length; i++)
        {
            sum+=array[i];
        }
        return sum;
    }
    static double sum(double array[])
    {
        double sum=0;
        for(int i=0;i<array.length; i++)
        {
            sum+=array[i];
        }
        return sum;
    }
    static int min(int array[])
    {
        int min=array[0];
        for(int i=1;i<array.length; i++)
        {
            if (array[i]<min) min=array[i];
        }
        return min;
    }
    static double min(double array[])
    {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    static int max(int array[])
    {
        int max=array[0];
        for(int i=1;i<array.length; i++)
        {
            if (array[i]>max) max=array[i];
        }
        return max;
    }
    static double max(double array[])
    {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    static int maxPositive(int array[])
    {
        int maxPositive=array[0];
        for(int i=1;i<array.length; i++)
        {
            if (array[i]>maxPositive) maxPositive=array[i];
        }

        if (maxPositive>0) return maxPositive;
        else
            return 0;

    }
    static double maxPositive(double array[])
    {
        double maxPositive=array[0];
        for(int i=1;i<array.length; i++)
        {
            if (array[i]>maxPositive) maxPositive=array[i];
        }

        if (maxPositive>0) return maxPositive;
        else
            return 0;

    }
    static long multiplication(int array[])
    {
        long multiplication=1;
        for (int i = 0; i < array.length; i++) {
            multiplication*= array[i];
        }
        return multiplication;
    }
    static double multiplication(double array[])
    {
        double multiplication=1;
        for (int i = 0; i < array.length; i++) {
            multiplication*= array[i];
        }
        return multiplication;
    }
    static int modulus(int array[])
    {
        int modulus=array[0]%array[array.length-1];

        return modulus;
    }
    static double modulus(double array[])
    {
        double modulus=array[0]%array[array.length-1];

        return modulus;
    }
    static int secondLargest(int array[])
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
    static double secondLargest(double array[])
    {
        double firstLargest=array[0];
        double secondLargest=array[1];

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


}

