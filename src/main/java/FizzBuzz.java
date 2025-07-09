import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        LinkedList<String> list = new LinkedList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            } else if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
    // Implementing new logic without using % 

    public void newFizzBuzz(int n){
        
    }


    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        System.out.println(obj.fizzBuzz(23));
    }
}
