package Module3.HomeWork3;

import java.util.Date;

/**
 * Created by Вадим on 09.11.2016.
 * ЗАДАНИЕ 3

 You need to create following structure of the classes.
 Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
 Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.

 Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age.
 With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

 CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
 Create three constructors: two the same as in Student and one with all the fields of the class.

 Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
 Create three constructors: two the same as in CollegeStudend and one with secretKey field.
 Create getters and setters for all fields and make fields private as OOP principle follows.
 Create 5 objects Course class. Create objects of others classes using every constructor.
 You must have 13 objects in Solution class.
 */
public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
