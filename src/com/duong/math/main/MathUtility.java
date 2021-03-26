package com.duong.math.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUONGAS
 */
public class MathUtility {
    public static final double PI=3.1415;
    //am giai thua ko tinh dc
    //ham chi chap nhan tu 0..20!
    //0!=1!=1
    public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("Invalid argrument. n must be between 0..20 ");
        }
        if(n==0 || n==1)
            return 1;
        
        return n*(getFactorial(n-1));
    }
}
