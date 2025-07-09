import org.example.Main;

import java.util.HashMap;

public class RomantoInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer > map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for(int i = 0; i<s.length(); i++ ){
            int current = map.get(s.charAt(i));

            if(i+1 < s.length()){
                int next = map.get(s.charAt(i + 1));
                if(current<next){
                    sum = sum - current;
                }
                else {
                    sum = sum + current;

                }
            }else {
                sum = sum + current;
            }
        }
        return sum;


    }

    public static void main(String[] args) {
        RomantoInteger obj = new RomantoInteger();
        int result = obj.romanToInt("VII");
        System.out.println("Roman to Integer:"+result);
    }


}
