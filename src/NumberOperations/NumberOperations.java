package NumberOperations;

public class NumberOperations {
    public static void main(String[] args) {
        int a = 15;
        a+= 5;
        a-= 4;

        int b = a;
        b+= 1;

        // Check if b is an odd number

        if(b % 2 == 0){
            System.out.println("the number is even.");
        } else{
            System.out.println("the number is odd.");
        }

        // check if the result of (b multiplied for b + 1) is a multiple of 3

        if(b * (b + 1) % 3 == 0){
            System.out.println("the number is a multiple of 3.");
        } else{
            System.out.println("the number is not a multiple of 3.");
        }
    }
}
