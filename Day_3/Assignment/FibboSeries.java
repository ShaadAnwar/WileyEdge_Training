package Day_3.Assignment;

public class FibboSeries {
    private int a;
    private int b;
    private int sum;
    FibboSeries(){
        this.a=0;
        this.b=1;
        this.sum=0;
    }

    public void printFibboSeries(int start,int end){
        int track=1;
        if(start==1){
            System.out.print(a+" "+b+" ");
            end-=2;
        }
        while(end>=start){
            sum = a+b;
            if(track >= start)
                System.out.print(sum+" ");
            a=b;
            b=sum;
            end--;
            track++;
        }
        System.out.println();
    }
}
