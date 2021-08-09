import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private ArrayList<String> enrolledCourses;
    private int balance;
    private static int ID = 1;
    private static int courseCost = 600;

    public Student(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.studentID = generateID();
        this.enrolledCourses = new ArrayList<>();
        this.balance = 0;
    }

    public Student(String firstName, String lastName, int year, String studentID, ArrayList<String> enrolledCourses, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.studentID = studentID;
        this.enrolledCourses = enrolledCourses;
        this.balance = balance;
    }

    private String generateID() {
        StringBuilder newID = new StringBuilder();

        newID.append(year);
        newID.append(String.format("%04d", ID++));

        return newID.toString();
    }

    public void enrollCourse(String course) {
        this.enrolledCourses.add(course);
        this.balance += courseCost;
    }

    public void payTuition(int amount){
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Paid: " + amount);
        } else {
            int remainder = amount - this.balance;
            this.balance = 0;
            System.out.println("You paid more than necessary. You get back: " + remainder);
        }
        System.out.println("Your balance is now: " + this.balance);
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public String getStudentID() {
        return studentID;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public int getBalance() {
        return balance;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Name: " + getName());
        info.append("\nYear: " + this.year);
        info.append("\nID: " + this.studentID);
        info.append("\nEnrolled courses: ");

        for (int i = 0; i < enrolledCourses.size(); i++) {
            String course = enrolledCourses.get(i);
            info.append(course);
            if (i != (enrolledCourses.size() - 1)) {
                info.append(", ");
            }
        }

        info.append("\nBalance: " + this.balance);

        return info.toString();
    }
}
