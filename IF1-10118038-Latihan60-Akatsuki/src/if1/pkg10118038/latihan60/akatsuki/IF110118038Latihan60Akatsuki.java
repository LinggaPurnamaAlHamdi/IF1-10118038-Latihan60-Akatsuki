/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan60.akatsuki;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Akatsuki
 */
public class IF110118038Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bertarung akatsuki = new Bertarung();
        akatsuki.tampilProfile();
        int pilihSenjata = akatsuki.tampilSenjata();
        int pilihJurus = akatsuki.tampilJurus();
        akatsuki.keluarakanSenjata(pilihSenjata);
        akatsuki.keluarkanJurus(pilihJurus);
    }
    
}
