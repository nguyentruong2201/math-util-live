/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author NguyenDucTruong
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result); //ky thuat kiem thu phan mem
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6)); //ky thuat kiem thu phan mem
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0)); //ky thuat kiem thu phan mem
        
    }
    
}
