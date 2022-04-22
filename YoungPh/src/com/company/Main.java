package com.company;


public class Main {
    public Object YoungPhysicist(int n, int[] x, int[] y, int[] z) {
        int xsum = 0;
        int ysum = 0;
        int zsum = 0;
        int result;
        for (int i = 0; i < n; i++) {
            xsum = x[i] + xsum;
            ysum = y[i] + ysum;
            zsum = z[i] + zsum;
        }

        result = xsum + ysum + zsum;

        if ((result == 0) && (xsum == 0 || ysum == 0 || zsum == 0) )
            return "YES";
        else
            return "NO";

    }}

