package Day_6.Assignment;

public class Anagram {
    public boolean isAnagram(String word1, String word2){
        if(word1.length() == word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                if(word2.contains(word1.substring(i,i+1)))
                    continue;
                else
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("silence","license"));
    }
}
