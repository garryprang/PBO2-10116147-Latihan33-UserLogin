/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan33.userlogin;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program login berbasis objek.
 */

public class PBO210116147Latihan33UserLogIn {

    private final static String username = "grry";
    private final static String password = "10116147";
    private boolean statusAkun;

    private boolean CekAkun(String parUserName, String parPassword){
        return statusAkun = parUserName.equals(username) && parPassword.equals(password);
    }

    private void HasilLogin(boolean status, String parUserName){
        String hasil = status ? "\n******* Halo ".concat(parUserName)
                .concat(" *******\nSelamat datang di aplikasi ini...")
                : "Ooops, username atau password anda salah!!!";
        System.out.println(hasil);
    }

    public void PengecekanLogin(String parUserName, String parPassword){
        CekAkun(parUserName, parPassword);
        HasilLogin(statusAkun, parUserName);
    }
}

