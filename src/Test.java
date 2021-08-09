public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Smith", 2);
        Student student2 = new Student("Alice", "Cooper", 5);

//        Student[] students = new Student[20];
//        for (int i = 0; i < students.length; i++) {
//            char ch1 = (char) (65 + i);
//            char ch2 = (char) (97 + i);
//            students[i] = new Student(Character.toString(ch1),Character.toString(ch2), 10);
//        }

        student1.enrollCourse("Math");
        student1.enrollCourse("History");
        System.out.println("Balance: " + student1. getBalance());
        student1.payTuition(250);

        System.out.println(student1.getInfo());

        Course course1 = new Course("History 101", 600);
        Course course2 = new Course("English 101", 600);
        Course course3 = new Course("Math 101", 600);

        Courses juniorCourses = new Courses("Junior Courses", 3);

        if (juniorCourses.addCourse(course1)) {
            System.out.println("Course " + course1.getCourseName() + " successfully added.");
        } else {
            System.out.println("Course " + course1.getCourseName() + " has not been added.");
        }

        if (juniorCourses.addCourse(course2)) {
            System.out.println("Course " + course2.getCourseName() + " successfully added.");
        } else {
            System.out.println("Course " + course2.getCourseName() + " has not been added.");
        }

        if (juniorCourses.addCourse("Math 101", 500)) {
            System.out.println("Course Math 101 successfully added.");
        } else {
            System.out.println("Course Math 101 has not been added.");
        }

        if (juniorCourses.addCourse(null, 200)) {
            System.out.println("Course null added! Something is wrong!!");
        } else {
            System.out.println("Course null not added. Everything is fine.");
        }

        if (juniorCourses.addCourse("Biology", -250)) {
            System.out.println("Course Biology added! Something is wrong!!");
        } else {
            System.out.println("Course Biology not added. Everything is fine.");
        }

        if (juniorCourses.removeCourse(course3)) {
            System.out.println("Course " + course3.getCourseName() + " removed. Somethings wrong!");
        } else {
            System.out.println("Course " + course3.getCourseName() + " not removed. Everything is OK.");
        }

        if (juniorCourses.removeCourse("History 101")) {
            System.out.println("Course History 101 removed.");
        } else {
            System.out.println("Course History 101 not removed. Something is wrong!");
        }

        Course course4 = juniorCourses.getCourse("English 101");
        Course course5 = juniorCourses.getCourse("Technology 101");

        if (course4 != null) {
            System.out.println("Course: " + course4.getCourseName() + ": " + course4.getPrice());
        } else {
            System.out.println("Something is wrong.");
        }

        if (course5 != null) {
            System.out.println("Course5 - Something is wrong!");
        } else {
            System.out.println("course5 - OK");
        }

    }
}
