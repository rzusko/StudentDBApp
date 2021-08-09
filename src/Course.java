public class Course {
    private String courseName;
    private int price;

    public Course(String courseName, int price) {
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getPrice() {
        return price;
    }
}
