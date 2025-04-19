package Experiment_4;

public class Vanshika_4A {
    public static void main(String[] args) {
        A.showA(); // calling static function via reference of class.
        A obj = new A() ; // object created using default constructor.
        obj.showB(); // object created to access the non-static function.
    }
}
