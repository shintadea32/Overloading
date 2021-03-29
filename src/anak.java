/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I d e a P a d
 */
public class anak {

    //membuat method luas dengan parameter string 1
    public void luas(String l){
        System.out.println("Macam Macam Luas Bangun Datar");
    }
    //membuat method luaspersegi dengan parameter int s1 dan int s2
    public void luaspersegi(int s1, int s2){
        System.out.println("Luas Persegi : "+(s1+s2));
        //didalam south ditambahkan rumus luas persegi
    }
    //membuat method luaspersegipanjang dengan parameter int p dan int l
    public void luaspersegipanjang (int p, int l){
        System.out.println("Luas Persegi Panjang : "+(p*l));
        //didalam south ditambahkan dengan rumus luaspersegi panjang 
    }
    //membuat method luassegitiga dengan parameter int a dan int b
    public void luassegitiga (int a,int b){
        System.out.println("Luas Segitiga :"+(a*b/2));
        //didalam south ditambahkan rumus luas segitiga 
    }
    //membuat method luaslingkaran dengan parameter double phi dan int r
    public void luaslingkaran (double phi, int r){
        System.out.println("Luas Lingkaran : "+(phi*r*r));
        //didalam south ditambahkan rumus luas lingkaran
    }
}
