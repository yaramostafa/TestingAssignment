package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void equal() { //test case 81 that failed
        String ans = "YES";
        String ans2= "NO";
        int n=3;
        int[] a= new int[]{4, -2 , 1};
        int[] b= new int[]{1, 4, -5};
        int[] c= new int[]{7, -1, -3};
        var equal = new Main();

       assertEquals(ans2,equal.YoungPhysicist(n,a,b,c));
    }
    @Test
    void equal1() {
        String ans = "YES";
        String ans2= "NO";
        int i=3;
        int x[]={3, -5, 2};
        int y[]={-1,2,-1};
        int z[]={7,-4,-3};
        var equal1 = new Main();

       assertEquals(ans,equal1.YoungPhysicist(i,x,y,z));
    }
    @Test
    void equal2() { //test case 81
        String ans = "YES";
        String ans2= "NO";
        int n=3;
        int a[]={0, 1, -3};
        int b[]={2, -1, 0};
        int c[]={-2, 3 , 0};
        var equal1 = new Main();

      assertEquals(ans2,equal1.YoungPhysicist(n,a,b,c));
    }
    @Test
    void equal3() {
        String ans = "YES";
        String ans2= "NO";
        int n=23;
        int a[]={-70 , 42, 28 ,-49 ,-67 ,-53,65,-66 ,81 ,10 ,-89 ,-64 ,-81 ,80 ,-60 ,49,-58 ,-24 ,98 ,-28 ,100 ,100 ,56};
        int b[]={37, 84 ,-94 ,76 ,18 ,78 ,-63 ,-64 ,-93 ,52 ,-61 ,-47 ,-35 ,82 ,-81 ,-10 ,70 ,-15 ,-93 ,-75 ,100,100,34};
        int c[]={78 ,6 ,-24 ,95 ,84 ,-5 ,-64 ,-69 ,95 ,-79 ,-64 ,43 ,55 ,73 ,-18 ,-19 ,12 ,-93 ,-54 ,11 ,-63 ,0 ,0};
        var equal1 = new Main();

        assertEquals(ans,equal1.YoungPhysicist(n,a,b,c));
    }
}
