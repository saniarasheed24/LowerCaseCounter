import java.util.Scanner;

public class Main {
    static int CountLowerCase(String myString)  //function taking in string
    {
        int lowerCase=0;                        //initializing with zero in case if no lowercase alphabet is found
        for (int i=0; i<myString.length();i++)  //iterate till the length of string
        {
            char character=myString.charAt(i);  //storing each aplhabet as character in character variable
            if(character>='a' && character<='z')//searching between small a and z
            {
                lowerCase++;                    //increasing counter by 1 if found
            }
        }
        return lowerCase;                       //returning number of lowercase alphabets found
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your string:");
        String myString=input.nextLine();
        int count=CountLowerCase(myString);
        System.out.println("Number of lowercase alphabets are "+ count);
    }
}