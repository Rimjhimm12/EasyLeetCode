public class NumberofStepstoReduceANumberToZero {
    public int numberOfSteps(int num) {

        int count = 0;
        int i = 0;
        while(num!=0){

            i++;
            if (num % 2 == 0) {

                System.out.println("Step: "+i +" "+num + " is even; " + "divide by 2 and" + " obtain " + (num /2));
                num = (num /2);
                count++;
            }
            else{

                System.out.println("Step: "+i +" "+num + " is odd; " + "subtract by 1 and" + " obtain " + (num -1));
                num = (num -1);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberofStepstoReduceANumberToZero obj = new NumberofStepstoReduceANumberToZero();
        System.out.println("Total number of steps: "+obj.numberOfSteps(23) +2 );
    }
}
