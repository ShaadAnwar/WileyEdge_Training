package Day_6.Assignment;
//Day_6: Problem-6
public class ReverseString {
    public String reverse(String str){
        String ans = "";
        int i = str.length()-1;
        while(i>=0){
            ans+=str.charAt(i);
            i--;
        }
        return ans;
    }


    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        System.out.println(rev.reverse("MANDAR"));
    }
}
