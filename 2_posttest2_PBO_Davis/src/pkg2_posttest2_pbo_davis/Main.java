package pkg2_posttest2_pbo_davis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<list> komikList = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Tambah List Komik");
            System.out.println("2. Tampilkan List Komik");
            System.out.println("3. Ubah List Komik");
            System.out.println("4. Hapus List Komik");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan: ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan){
                case 1:
                    tambah();
                    break;
                case 2:
                    tampil();
                    break;
                case 3:
                    ubah();
                    break;
                case 4:
                    hapus();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("PILIHAN SALAH!");
                    break;
            }
        }
    }

    static void tambah() throws IOException{
        System.out.println("Masukkan Judul       : ");
        String judul = br.readLine();

        System.out.println("Masukkan Genre       : ");
        String genre = br.readLine();

        System.out.println("Masukkan Status      : ");
        String status = br.readLine();

        System.out.println("Masukkan Nama Author : ");
        String author = br.readLine();

        System.out.println("Masukkan Rating      : ");
        float rating = Float.parseFloat(br.readLine());

        list komik = new list(judul, genre, status, author, rating);
        komikList.add(komik);
        System.out.println("Komik sudah ditambahkan.");
    }

    static void tampil(){
        if (komikList.isEmpty()){
            System.out.println("List Komik masih kosong.");
        }else{
            System.out.println("\n");
            for(int i = 0; i< komikList.size(); i++){
                System.out.print(i+1+"\t");
                System.out.println(komikList.get(i).toString());
            }
        }
    }

    static void ubah() throws IOException{
        tampil();
        System.out.println("Masukkan nomor untuk ubah komik : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        if (pilihan < 0 || pilihan >= komikList.size()) {
        System.out.println("Pilihan Tidak Valid.");
    }else{
            list komik = komikList.get(pilihan);

    System.out.println("Mau Ubah Menjadi : ");
    System.out.println("Judul Baru: ");
    komik.setJudul(br.readLine());

    System.out.println("Genre Baru: ");
    komik.setGenre(br.readLine());

    System.out.println("Status Baru: ");
    komik.setStatus(br.readLine());

    System.out.println("Author Baru: ");
    komik.setAuthor(br.readLine());

    System.out.println("Rating Baru: ");
    komik.setRating(Float.parseFloat(br.readLine()));

    System.out.println("Komik Berhasil Diubah...");
        }}
           
static void hapus() throws IOException{
        tampil();
        System.out.println("Masukkan nomor untuk menghapus Komik: ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        if (pilihan < 0 || pilihan >= komikList.size()) {
            System.out.println("Pilihan Tidak Valid.");
        } else {
            komikList.remove(pilihan);
            System.out.println("Komik berhasil dihapus");
        }
    }

}

