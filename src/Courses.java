import java.util.HashMap;
import java.util.Map;

public class Courses {
    private String name;
    private int year;
    private Map<String, Course> listOfCourses;

    private final String EXISTING_COURSE_ERROR = "Course is already in database";

    public Courses(String name, int year) {
        this.name = name;
        this.year = year;
        this.listOfCourses = new HashMap<String, Course>();
    }

    public boolean addCourse(Course course) {
        if (course != null) {
            if (listOfCourses.containsKey(course.getCourseName())) {
                System.out.println(EXISTING_COURSE_ERROR);
                return false;
            } else {
                this.listOfCourses.put(course.getCourseName(), course);
                return true;
            }
        }

        return false;
    }

    public boolean addCourse(String courseName, int coursePrice) {
        if (courseName != null && !courseName.equals("")) {
            if (listOfCourses.containsKey(courseName)) {
                System.out.println(EXISTING_COURSE_ERROR);
                return false;
            } else if (coursePrice < 0){
                System.out.println("Wrong price!");
                return false;
            } else {
                Course course = new Course(courseName, coursePrice);
                listOfCourses.put(courseName, course);
                return true;
            }
        }

        return false;
    }

    public boolean removeCourse(Course course) {
        if (course != null) {
            if (listOfCourses.containsKey(course.getCourseName())) {
                if ((listOfCourses.get(course.getCourseName()).getPrice() == course.getPrice())) {
                    listOfCourses.remove(course.getCourseName());
                    return true;
                }
            }
        }

        return false;
    }

    public boolean removeCourse(String courseName) {
        if (courseName != null) {
            if (listOfCourses.containsKey(courseName)) {
                listOfCourses.remove(courseName);
                return true;
            }
        }

        return false;
    }

    public Course getCourse (String courseName) {
        if (courseName != null && !courseName.equals("")) {
            if (listOfCourses.containsKey(courseName)) {
                return listOfCourses.get(courseName);
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Map<String, Course> getListOfCourses() {
        return listOfCourses;
    }
}
