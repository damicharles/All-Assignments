import java.util.Scanner;

    public class LargestAndSmallestIntegers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            int firstInt = input.nextInt();

            System.out.print("Enter the second integer: ");
            int secondInt = input.nextInt();

            System.out.print("Enter the third integer: ");
            int thirdInt = input.nextInt();

            System.out.print("Enter the fourth integer: ");
            int fourthInt = input.nextInt();

            System.out.print("Enter the fifth integer: ");
            int fifthInt = input.nextInt();

            int largest = firstInt;
            int smallest = firstInt;



            if (secondInt > largest)
                largest = secondInt;
            if (thirdInt > largest)
                largest = thirdInt;
            if (fourthInt > largest)
                largest = fourthInt;
            if (fifthInt > largest)
                largest = fifthInt;


            if (secondInt < smallest)
                smallest = secondInt;
            if (thirdInt < smallest)
                smallest = thirdInt;
            if (fourthInt < smallest)
                smallest = fourthInt;
            if (fifthInt < smallest)
                smallest = fifthInt;

            System.out.printf("The largest of the five integers is %d, and smallest is %d%n", largest, smallest);


        }



}
