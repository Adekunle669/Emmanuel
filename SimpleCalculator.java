/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import javax.swing.*;

/**
 *
 * @author enock
 */
public class SimpleCalculator {
    
    public double answer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCalculator sp =  new SimpleCalculator();
        
        double ans = 0;
        String temp;
        temp = JOptionPane.showInputDialog( "Enter What You Want to Do");
        String fnum = JOptionPane.showInputDialog("Enter the first Number");
        int first_num = Integer.parseInt(fnum);
        String snum = JOptionPane.showInputDialog("Enter the second Number");
        int second_num = Integer.parseInt(snum);
        if (null == temp) {
            JOptionPane.showMessageDialog(null, "The Input Value is Not Correct");
        }
        else 
            switch (temp) {
            case "Addition":
                ans = sp.Addition(first_num, second_num);
                break;
            case "Subtraction":
                ans = sp.Subtraction(first_num, second_num);
                break;
            case "Multiplication":
                ans = sp.Multiplication(first_num, second_num);
                break;
            case "Division":
                ans = sp.Division(first_num, second_num);
                break;
            default:
                JOptionPane.showMessageDialog(null, "The Input Value is Not Correct");
                break;
        }
        JOptionPane.showMessageDialog(null, "The calculation Answer is " + ans);
    }
    
    public double Addition( int a, int b ){
        answer = a + b;
        return answer;
        
    }
    public double Subtraction( int a, int b ){
        answer = a - b;
        return answer;
        
    }
     public double Multiplication( int a, int b ){
        answer = a * b;
        return answer;
        
    }
    
    public double Division(double a, double b ){
        answer = a / b;
        return answer;
        
    }
    
}
