package Day_9;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getDay());

        //Calendar is a Abstract class so we can't create it's object but we can create it's reference
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.getTime());

    }
}
