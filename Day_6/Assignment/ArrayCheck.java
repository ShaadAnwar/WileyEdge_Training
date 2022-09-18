package Day_6.Assignment;

public class ArrayCheck<T> {
    public boolean isequal(T[] arr)throws Exception{
        if(arr.length <=5)
            throw new Exception("Array Size less than 5");
        if(arr[0] == arr[arr.length-1])
            return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayCheck<String> check = new ArrayCheck<>();
        String[] str ={"shaad","anwar","abs","qwer","Jhony Depth","shaad"};
        try {
            System.out.println(check.isequal(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
