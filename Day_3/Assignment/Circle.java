package Day_3.Assignment;

public class Circle {
    private double radius;
    private double area;

    Circle(double radius){
        this.radius = radius;
        this.area = 0.0;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }
}
