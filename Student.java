import java.util.ArrayList;

public class Student {
    String nim;
    String name;
    ArrayList courses;

    public Student(int id, String name) {
        this.nim = nim; 
        this.name = name;
        this.courses = new ArrayList();
    }

    public void printStudentDetails() {
        System.out.println("id: " + nim);
        System.out.println("name: " + name);
    }

    public ArrayList getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}
