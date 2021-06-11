/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remainder;
import java.util.Scanner;
/**
 *
 * @author konda babu
 */
public class Remainder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         int t=input.nextInt();
         while(t-->0)
         {
            int A=input.nextInt();
            int B=input.nextInt();
            System.out.println(A%B); 
         }
         t--;


    }
    
}
