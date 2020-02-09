package eu.tsachev.methods;

import java.util.Scanner;

import java.util.*;

public class methodsPasswordValidator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        String pass = scanner.nextLine();

        List<String> list = new ArrayList<String>();
        list.add(passLenght(pass));
        list.add(lettersDigits(pass));
        list.add(digitsNumber(pass));

        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) != "valid"){
                System.out.println(list.get(i));
                count++;
            }
        }

        if (count == 0){
            System.out.println("Password is valid");
        }

    }

    static String passLenght( String lenRule){
        if(lenRule.length() >= 6 && lenRule.length() <= 10 ){
            return "valid";
        } else {
            return "Password must be between 6 and 10 characters";
        }
    }

    static String lettersDigits(String content) {
        if (content.matches( "[a-zA-Z0-9]*" )) {
            return "valid";
        } else {
            return "Password must consist only of letters and digits";
        }
    }

    static String digitsNumber( String numbers) {
        int a = numbers.replaceAll("\\D", "").length();
        if (a >= 2) {
            return "valid";
        } else {
            return "Password must have at least 2 digits";
        }
    }

}