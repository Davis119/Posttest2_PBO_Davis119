/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_posttest2_pbo_davis;

class list {

    private String judul;//atribut ini berfungsi sebagai variabel untuk menyimpan input judul 
    private String genre;//atribut ini berfungsi sebagai variabel untuk menyimpan input genre  
    private String status;//atribut ini berfungsi sebagai variabel untuk menyimpan input status
    private String author;//atribut ini berfungsi sebagai variabel untuk menyimpan input author
    private float rating;//atribut ini berfungsi sebagai variabel untuk menyimpan input rating
    
    public list(String judul, String genre, String status, String author, float rating){
        //nilai dari variabel judul, genre, status, author, dan rating 
        //akan diinisialisasi dengan nilai yang diterima sebagai parameter
        //this digunakan untuk merujuk pada variabel instance (variabel milik objek) 
        //yang sedang diproses, sehingga nilai-nilai yang diterima sebagai parameter dapat disimpan ke variabel instance
        this.judul = judul; 
        this.genre = genre;
        this.status = status;
        this.author = author;
        this.rating = rating;
    }
    
    
     public void setJudul(String judul) { //berfungsi sebagai input nilai atribut judul
        this.judul = judul;
    }
     
    public String getJudul() { //untuk mengambil isi nilai dari atribut judul
        return judul;
    }
     
    public void setGenre(String genre) { //berfungsi sebagai input nilai atribut genre
        this.genre = genre;
    }
     
    public String getGenre() { //untuk mengambil isi nilai dari atribut genre
        return genre;
    }
     
    public void setStatus(String status) { //berfungsi sebagai input nilai atribut status
        this.status = status;
    }
     
    public String getStatus() { //untuk mengambil isi nilai dari atribut status
        return status;
    }
     
    public void setAuthor(String author) { //berfungsi sebagai input nilai atribut author
        this.author = author;
    }
     
    public String getAuthor() { //untuk mengambil isi nilai dari atribut author
        return author;
    }
    
    public void setRating(float rating) { //berfungsi sebagai input nilai atribut rating
        this.rating = rating;
    }
            
    public float getRating() { //untuk mengambil isi nilai dari atribut rating
        return rating;
    }
    
  @Override
     public String toString() {
        return judul + " (Genre: " + genre + ", Status: " + status + ", Author: " + author + ", Rating: " + rating +  ")";
    }
    
}

