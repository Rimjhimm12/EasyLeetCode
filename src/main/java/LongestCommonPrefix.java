import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }

        String prefix = strs[0];
        for(int i =1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);

            }
        }

        return  prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(obj.longestCommonPrefix(strs));




    }
}
