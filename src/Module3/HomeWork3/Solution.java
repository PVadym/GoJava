package Module3.HomeWork3;


import java.util.Date;

/**
 * Created by Вадим on 09.11.2016.
 */
public class Solution {

    public static void main(String[] args) {

        Date d= new Date(5000000) ;
        Date d1= new Date(1000000) ;


        Course one= new Course(d,"First");
        Course two= new Course("Second",10,"Petrov");
        Course three= new Course("Third", 15, "Ivanov");
        Course four= new Course(d1,"Forth");
        Course five= new Course("Fifth", 25, "Pupkin");

        Course [] core = {one, two,three};
        Course [] medium = {two,three};
        Course [] prof = {three, four,five};

        Student st1 = new Student("Igor","Novikov",2);
        Student st2 = new Student("Sidorov",core);

        CollegeStudent cst1 = new CollegeStudent("Tolya", "Karavaev", 5);
        CollegeStudent cst2 = new CollegeStudent("Gernenko", medium);
        CollegeStudent cst3 = new CollegeStudent ("Grisha","Mashkin",4,prof,"NTU",1254,00100214552);

        SpecialStudent sp1 = new SpecialStudent("Kolya","Dub",1);
        SpecialStudent sp2 = new SpecialStudent("Gorenko", prof);
        SpecialStudent sp4 = new SpecialStudent(123456789);



    }
}
