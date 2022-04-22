package com.company;


public class Main {
    public static Object watermelon(int y){ //y is the weight
        if (y==2 || y==0)
            return "NO";
        else if (y%2==0 && y!=2)
            return "YES";
        else return "NO";
    }

}
