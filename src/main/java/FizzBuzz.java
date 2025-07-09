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
    public List<String> newFizzBuzz(int a) {
        int fizzCounter = 0;
        int buzzCounter = 0;
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 1; i <= a; i++) {
            fizzCounter++;
            buzzCounter++;

            boolean fizz = (fizzCounter == 3);
            boolean buzz = (buzzCounter == 5);

            if (fizz && buzz) {
                list.add("FizzBuzz");
                fizzCounter = 0;
                buzzCounter = 0;
            } else if (fizz) {
                list.add("Fizz");
                fizzCounter = 0;
            } else if (buzz) {
                list.add("Buzz");
                buzzCounter = 0;
            } else {
                list.add(String.valueOf(i));
                }
            }
            return list;
        }


    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        System.out.println(obj.fizzBuzz(23));
        System.out.println(obj.newFizzBuzz(23));
    }
}
