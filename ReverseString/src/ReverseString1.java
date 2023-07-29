import java.util.Scanner;
public class ReverseString1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Stringer! Please enter Your String.");
        String Word = input.nextLine().toUpperCase();
        int i = Word.length();
        System.out.println("Length of String is "+i);
        System.out.println("Reverse of String " +Word+ " is:");
        while (i>0) {
            System.out.println(Word.charAt(i-1)+" ");
            i--;
        }
    }
}