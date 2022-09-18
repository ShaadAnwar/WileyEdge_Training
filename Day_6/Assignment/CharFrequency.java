package Day_6.Assignment;

public class CharFrequency {
    public void countCharacterFreq(String str){
         int[] freq = new int[str.length()];
         int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1)
                freq[i] = count;
            count = 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(freq[i]!=-1)
                System.out.println(str.charAt(i)+"-->"+freq[i]);
        }
    }

    public static void main(String[] args) {
        CharFrequency freq = new CharFrequency();
        freq.countCharacterFreq("Mandar");
    }
}
