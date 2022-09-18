package Practice;

import java.util.*;
import java.lang.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<(n-1-i);j++){
                if(list.get(j).compareTo(list.get(j+1))<0){
                    String temp= list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));;
        }


    }
}