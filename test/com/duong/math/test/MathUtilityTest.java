/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duong.math.test;


import static com.duong.math.main.MathUtility.*;// muon cac ham, bien trong class go truc tiep luon khong can class.
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DUONGAS
 */
public class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArgumentReturnGoodResult(){
        long expected=120;// toi muon test 5! co dung la 120 hay ko
        int n=5;
        long actual= getFactorial(n);
        assertEquals(expected, actual);
        
        //minh test tiep cac truong hop khac dung dau vao, dung dau ra
        //khoi can bien trung gian, cho luon lenh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
    }
    //dieu gi xay ra neu ta dua vao tham so sai, am , >20
    //theo thiet ke cua ham dua vao ... se nem ra exception
    //va ta can test xem, ngoai le co dc nem ra ko neu ta sai-> ham dung
    //thay ngoai le khi sai -> mung vi ham dung
    //
    @Test//(expected = IllegalArgumentException.class)
    //co dung khi chay ham nay thi nem ra ngoai le cung ten-> XANH
    public void testFactorialWrongArgumentThrowException(){
        // test tinh huong ham phai nem ra ngoai le neu tham so sai
        //ngoai le ko phai la value de so sanh, ko dung assertEquals()
        //ta phai fung chieu khac. JUnit 4 khac JUnit 5 o cho bat ngoai le
        // ki 5: DI, Lamda Exception lien quan 
        //Junit 5: Dependency Injection / SOLID
        getFactorial(-5);
        getFactorial(21);
    }
}
