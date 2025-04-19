package udemy.Exercise35;

import udemy.Exercise35.Circle;

public class Cylinder extends Circle {
    private double height ;
    public Cylinder(double radius, double height){
        super(radius) ; // Learnt : super should be first statement in constructor if you are using class attribute of parent class.
        this.height = height ;
        if(height < 0){
            this.height = height ;
        }
    }
    public double getHeight(){
        return height ;
    }
    public double getVolume(){
        return (this.getArea())*(this.getHeight()) ;
    }
}
