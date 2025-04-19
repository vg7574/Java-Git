package Experiment_4;

public class Vanshika_4B {
    public static void main(String[] args) {
        Student stud1 = new Student() ;
        System.out.println("non-static variable 'Name' accessed in static main() method : "+stud1.name);
        System.out.println("static variable TotalStudents in static main() method : "+Student.totalStudents);
        System.out.println("non-static variable accessed in non-static method getRollNo() : "+stud1.getRollNo());
        System.out.println("static variable accessed in non-static method getTotalStudents : "+stud1.getTotalStudents());
    }
}
