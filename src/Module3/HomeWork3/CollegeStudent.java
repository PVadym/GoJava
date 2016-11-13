package Module3.HomeWork3;

/**
 * Created by Вадим on 09.11.2016.
 */
public class CollegeStudent extends Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }


    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.coursesTaken = coursesTaken;
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent() {
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getGroup() {
        return group;
    }

    @Override
    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    @Override
    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
