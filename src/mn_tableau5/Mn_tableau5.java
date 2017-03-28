/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn_tableau5;
import java.util.Scanner;
/**
 *
 * @author MOUSTAPHA
 */
public class Mn_tableau5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]table;
        table=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<table.length;i++){
            System.out.println("Entrer_l'entirer_"+(i+1)+":_");
            table[i]=sc.nextInt();
        }
        System.out.println("voici_le_tableau:_");
        for (int i=0;i<table.length;i++){
            System.out.println("__"+table[i]);
        }
        sc.nextLine();
        
        
    }
    
}
