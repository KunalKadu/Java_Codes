import java.util.HashMap;
import java.util.Map;

public class occurence_of_anagram_FSW{
    public static void main(String[] args) {
        String str = "aabaaaba";
        String ptr = "aaba";
        int count = count_anagram(str, ptr);
        System.out.println(count);
    }

    static int count_anagram(String str, String ptr){
        if(str == null || ptr == null || str.length() < ptr.length()){
            return 0;
        }
        Map<Character , Integer> patternMap= new HashMap<>();
        Map<Character , Integer> windowMap= new HashMap<>();
        int patternLength = ptr.length();
        int count = 0;
        for(char c: ptr.toCharArray()){
            patternMap.put(c, patternMap.getOrDefault(c,0 )+1);
        }
        for(int i=0;i<patternLength ;i++){
            char c = str.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c,0)+1);
        }

        if(windowMap.equals(patternMap)){
            count++;
        }

        for(int i = patternLength ; i<str.length();i++){
            char newChar = str.charAt(i-patternLength);
            windowMap.put(newChar , windowMap.getOrDefault(newChar,0)+1);

            char oldChar = str.charAt(i-patternLength);
            if(windowMap.get(oldChar) == 1){
                windowMap.remove(oldChar);
            }else{
                windowMap.put(oldChar , windowMap.get(oldChar)-1);
            }

            if(windowMap.equals(patternMap)){
                count++;
            }
        }
        return count;
    }
}