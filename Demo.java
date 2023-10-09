import java.util.Arrays;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the strings to check it is anagram or not");
        System.out.println("Enter the first string : ");
        String fir = sc.nextLine();
        System.out.println("Enter the second string : ");
        String sec = sc.nextLine();
        
        if(fir.length() == sec.length())
        {
            
        fir.toLowerCase();
        sec.toLowerCase();
        
        char[] chArr1 = fir.toCharArray();
        char[] chArr2 = sec.toCharArray();
        
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        
        boolean result = Arrays.equals(chArr1, chArr2);
        
        if(result)
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are different");
        }
        }
        
       else
       {
           System.out.println("Two strings are different");
       }
    }
}
