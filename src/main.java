/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I d e a P a d
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //membuat objek untuk memanggil class anak
        anak objek = new anak();
        //menggunakan objek untuk memanggil method luas
        objek.luas ("");
        //menggunakan objek untuk memanggil method luaspersegi dan juga ditambahkan angka dari masing masing sisi
        objek.luaspersegi(10, 10);
        //menggunakan objek untuk memanggil method luaspersegipanjang dan juga ditambahkan angka dari masing masing panjang dan lebar
        objek.luaspersegipanjang(12, 15);
        //menggunakan objek untuk memanggil method luassegitiga dan juga ditambahkan angka dari masing masing sisi
        objek.luassegitiga(12,18);
        //menggunakan objek untuk memanggil method luaslingkaran dan juga ditambahkan angka dari masing masing phi dan r
        objek.luaslingkaran(3,14*5*5);
        
        
    }
    
}
