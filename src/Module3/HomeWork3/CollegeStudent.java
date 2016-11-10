package Module3.HomeWork3;

/**
 * Created by Вадим on 09.11.2016.
 */
public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }


    public CollegeStudent(String collegeName, int rating, long id) {

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
}
