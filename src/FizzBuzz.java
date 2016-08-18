public class FizzBuzz {

    public void doIt(int start, int end) {
        for (int x = 1; x <= 100; x = x + 1) {

            if ((x % 3) == 0 && (x % 5) == 0) {
                System.out.println(" FizzBuzz ");

            } else if ((x % 5) == 0) {
                System.out.print(" Buzz ");

            } else if ((x % 3) == 0) {
                System.out.print(" Fizz ");

            } else {
                System.out.print(x + " ");
            }
        }
    }
}