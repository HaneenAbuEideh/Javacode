package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        int n = r.nextInt();
        int cnt=0,i=1,k=2;
        while(k<=n&&i<n)
        {
            if(k==n)
            { i++;k=2; }
            if(k*k+i*i==n*n)
            cnt++;
            k++;
        }
        System.out.print(cnt/2);
    }
}
