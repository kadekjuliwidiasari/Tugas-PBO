public class Main {
    public static void main(String[] args) {
       
        Student student1 = new Student(99099, "agus");
        
      
        System.out.println(student1.name);
        student1.printStudentDetails();

       
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");
       
        System.out.println(student1.name + "'s courses: " + student1.getCourses());

        student1.removeCourse("English");

        System.out.println(student1.name + "'s courses: " + student1.getCourses());
    }
}


