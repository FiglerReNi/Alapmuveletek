/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class Osszeadas {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ossz=0;
        int szam;
        int y=1;
        do{
            System.out.println("Kérem a számot "+y+".:");
            szam=sc.nextInt();
            ossz=ossz+szam;
            y++;                   
        }
        while(szam!=0);
        System.out.println();
        System.out.print("A számok összege: "+ossz);
    }    
}
