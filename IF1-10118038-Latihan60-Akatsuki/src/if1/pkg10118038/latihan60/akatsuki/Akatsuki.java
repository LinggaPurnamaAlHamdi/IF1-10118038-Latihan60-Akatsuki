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
public class Akatsuki extends Profile{

    @Override
    public int pilihAnggota() {
        return super.pilihAnggota();
    }
    
    

    @Override
    public void tampilProfile() {
        System.out.println("\n=============Profile Karakter============");
        System.out.println("Nama \t\t: " + getNamaLengkap());
        System.out.println("Asal \t\t: " + getAsal());
        System.out.println("Cincin \t\t: " + getCincin());
        System.out.println("Posisi Cincin \t: " + getPosisiCincin());
        System.out.println("Partner \t: " + getPartner());
    }
    
}
