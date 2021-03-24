package com.duong.math;


import com.duong.math.main.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUONGAS
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("aaaaa");
        long expected = 120;//hy vong tra ve la may
        int n = 5;//5!
        long actual = MathUtility.getFactorial(n); //thuc te ham chay la may
        System.out.println("5! expected: "+expected+"; actual: "+actual);
        
    }
}
//viet code thi phai test - nguyen tac phai theo
//test ngay ting ham , ting class truoc kh rap chung voi cac class khac
//test ngay khi xong ham, xong class
//duoc goi la test muc do 1, muc Unit Test(test muc don vi code)
//lam sao de test, co nhieu cach
//1. Cach 1: sout(goi ham()) de in ra ket qua xu li cua ham
//2. Cach 2:JOptionPane de popup le ket qua xu li cua ham (J Desktop)
//3. Cach 3: Ghi ra LOG file, ra 1 trang WEB(jw)
//4. Cach 4: Dung may de so sanh vi mays co cac phep toan so sanh, con nguoi ko can nhin tung dong ket
//de luan dung sai
//neu tat ca tinh huong chay ham deu dung ->ham dung -> mau xanh
//hau het tinh huong chay dung, co 1 cai sai-> ham sai-> mau do
//muon lam dc dieu nay ta can thu vien phu tro cho java xanh do 
//java: jUnit , TestNG
//C#: Nunit, xUnit, MSTest
//PHP: PHPUnit

//dung: tuc la ham chay ra 1 gia tri - ACTUAL VALUE va ta thay ACTUAL VALUE khop , bang voi cai gia
//tri ma ta mong doi , Ta tinh truoc = tay, goi la EXPECTED VALUE

//Vd: 5!, ta hy vong expected ham tra ve dung 120- ham tra ve dung 120 - actual=120
//Thymeleaf