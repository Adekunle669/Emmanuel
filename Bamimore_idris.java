/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;
import java.util.Scanner;
import static javacalculator.calculator.Input;
import javax.swing.JOptionPane;
/**
 *
 * @author Muizz
 */
public class JavaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        
        calculator cal = new calculator();
        
        double answer = 0;
        
        
        System.out.println("Choose From the option below to do you calculation");
        
        System.out.println("1.  Addition"+ "\t\t"+ "2.  Subtration");
        
        System.out.println("3.  Multiplication"+ "\t"+ "4.    Division");
        
        int valueOf = input.nextInt();
        
        String numReal = JOptionPane.showInputDialog("How many Number are you going to be calculate");
       
        
        switch (valueOf) {
            
            case 1:
                
                answer = cal.Addition(Input( Integer.parseInt(numReal)));
                
                break;
                
            case 2:
                
                answer = cal.Subtraction(Input( Integer.parseInt(numReal)) );
                
                break;
                
            case 3:
                
                answer = cal.Multiplication(Input( Integer.parseInt(numReal)));
                
                break;
                
            case 4:
                
                answer = cal.Division(Input( Integer.parseInt(numReal)));
                
                break;
                
            default:
                
                JOptionPane.showMessageDialog(null, "What you entered is not correct");
                
                break;
                
        }
        
        JOptionPane.showMessageDialog(null, "Your Answer is = " + answer);
        
    }
    
}
