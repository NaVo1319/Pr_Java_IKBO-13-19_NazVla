package ru.mirea.naz.pr28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static boolean num(String str) {
        Pattern pattern = Pattern.compile("\\(([^(]*)\\)");
        Matcher matcher = pattern.matcher(str);
        do {
            str = matcher.replaceAll("");
            matcher = pattern.matcher(str);
        } while (matcher.find());
        pattern = Pattern.compile("[(|)]");
        return !pattern.matcher(str).find();
    }

    private static boolean ip(String ip){
        Pattern pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}" +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        return pattern.matcher(ip).find();
    }

    public static void main(String[] args) {
        String[] ip={"127.0.0.1","255.255.255.0","1300.6.7.8","abc.def.gha.bcd"};
        String[] num={"(3*+*5)*–*9*×*4","((3*+*5)*–*9*×*4"};
        for(String i: ip){
            System.out.println(i+"->"+ ip(i));
        }
        for(String i: num){
            System.out.println(i+"->"+ num(i));
        }
    }
}
