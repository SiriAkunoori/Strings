import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
           //Converting to uppercase and finding length
           System.out.println("Enter a String: ");
           String Text=sc.nextLine();
           System.out.println("UpperCase String: "+Text.toUpperCase());
           System.out.println("Length of the String: "+Text.length());
           //replacing character with another
           System.out.println("Enter the character to replace: ");
           char oldChar = sc.next().charAt(0);
           System.out.println("Enter the new character: ");
           char newChar = sc.next().charAt(0);
       System.out.println("Replaced character from "+oldChar+" to "+newChar);
           String ReplacedString = Text.replace(oldChar, newChar);
           System.out.println("Given String: "+Text);
           System.out.println("Replaced String: "+ReplacedString);
           //extracting substring
            System.out.println("Enter starting index: ");
            int Sindex=sc.nextInt();
            System.out.println("Enter ending index: ");
            int Eindex=sc.nextInt();
            String subString=Text.substring(Sindex, Eindex);
            System.out.println("Extracted String: "+subString);
            sc.close();
        }    
    }
}