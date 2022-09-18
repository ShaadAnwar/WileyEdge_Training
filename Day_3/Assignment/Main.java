package Day_3.Assignment;

import Day_3.Assignment.Circle;
import Day_3.Assignment.Date;
import Day_3.Assignment.FibboSeries;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println("Area = "+circle.calculateArea());

        FibboSeries fbs = new FibboSeries();
        fbs.printFibboSeries(1,10);

        Date date = new Date("29/2/2024");
        System.out.println(date.checkDate());
        date.displayDate();
    }
}
