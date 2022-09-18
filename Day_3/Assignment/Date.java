package Day_3.Assignment;

public class Date {
    private int dd,mm,yyyy;
    Date(String date){
      String[] str = date.split("/");
      this.dd = Integer.parseInt(str[0]);
      this.mm = Integer.parseInt(str[1]);
      this.yyyy = Integer.parseInt(str[2]);
    }
    public String checkDate(){
        if(mm == 2 && yyyy>0){
            if(yyyy%4==0){
                if(yyyy%100==0 && yyyy%400==0 && dd>0 && dd<=29)
                    return "Valid Date";
                else{
                    if(yyyy%100!=0 && dd>0 && dd<=29)
                        return "Valid Date";
                }

            }
            else{
                if(dd>0 && dd<=28)
                    return "Valid Date";
            }
        }
        if((mm%2 != 0 && mm <= 12 && mm>0) || (mm == 8)){
            if(dd>0 && dd<=31 && yyyy>0)
                return "Valid Date";
        }
        if(mm%2 == 0 && mm !=2 && mm <=12 && mm>0){
            if(dd>0 && dd<=30 && yyyy>0)
                return "Valid Date";
        }
        return "Invalid Date";
    }

    public void displayDate(){
        if(this.checkDate() == "Valid Date"){
            switch(this.mm){
                case 1:
                    System.out.println(dd+" January "+yyyy);
                    break;
            }
        }
        else
            System.out.println("Invalid Date");

    }
}
