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
public class NapokSzama {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ho;
        int nap;
        int ossz=0;
        int[]honapok={0,31,28,31,30,31,30,31,31,30,31,30,31};
        do{
            System.out.print("Kérem a hónapot: ");
            ho=sc.nextInt();
        }
        while((ho>12)||(ho<1));
        do{
            System.out.print("Kérem a napot: ");
            nap=sc.nextInt();
        }
        while((nap>31)||(nap<1));
        for(int i=0; i<ho; i++){
            ossz=ossz+honapok[i];
        }
        ossz=ossz+nap;
        System.out.print("Hányadik nap az évben: "+ossz);
      
        
        
    }
    
}
