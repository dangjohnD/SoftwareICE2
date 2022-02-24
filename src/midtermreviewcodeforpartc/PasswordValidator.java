/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author okami
 */
public class PasswordValidator {
    public static final int MIN_PASS_LENGTH = 8;
    public static final int MIN_SPEC_CHAR = 1;
    public static boolean validatePassword(String password){
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
            return true;
        }
        return false;
    }
}
