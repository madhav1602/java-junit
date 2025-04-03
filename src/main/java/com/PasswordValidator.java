package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean validate(String text) {
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(text);

        if(mat.matches()){
            return true;
        }
        else{
            return false;
        }
    }
}
