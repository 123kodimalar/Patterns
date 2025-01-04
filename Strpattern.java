import java.util.Scanner;

public class Strpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        int i = 0; 
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            int count = 1;
            int j = i + 1;
            while (j < str.length() && str.charAt(j) == currentChar) {
                count++;
                j++;
            }
            System.out.print(count + "" + currentChar);

        
            i = j;
        }
        in.close();
    }
}
