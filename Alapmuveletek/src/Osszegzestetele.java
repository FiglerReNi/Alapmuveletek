/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Osszegzestetele {
    public static void main(String[]args){
        int[] a=new int[15];
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*7001)+8000;
            System.out.print(a[i]+" ");
        }
        int ossz=0;
        for(int i=0; i<a.length; i++){
            ossz=ossz+a[i];
             }
        System.out.println();
        System.out.println("Az összes befizetés: "+ossz);
    }
}
