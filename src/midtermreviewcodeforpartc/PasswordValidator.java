/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author okami
 */
import java.util.*;
public class PasswordValidator {
    public static final int MIN_PASS_LENGTH = 8;
    public static final int MIN_SPEC_CHAR = 1;
    public static String validatePassword(){
       Scanner sc = new Scanner(System.in);
       String password ="";
       boolean validPassword = false;
       while(!validPassword)
        {
            System.out.println("Passwords must have at least " 
                    + MIN_PASS_LENGTH +" characters");
            System.out.println("Passwords must have at least "
                    + MIN_SPEC_CHAR + " special character");
            System.out.println("Please enter your desired password:"); 
            
            password = sc.nextLine();
            int specialCharCount = 0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>=MIN_SPEC_CHAR &&password.length()>=MIN_PASS_LENGTH)
            {
                validPassword = true;
            }
        }
       return password;
    }
}
