package com.lesson.oop.inheritance;

public class SubclassReferencing {
    public static void main(String[] args) {

        // superclass = the parent
        // subclass = the child that inherits the parent
        // class that extends subclass? also a subclass
        // subclass reference cant hold a superclass object
        // Anggora ang = new Hewan();
        // superclass reference can hold a subclass object
        // Hewan hew = new Anggora();


        // normally like this, both object have the method of the subclass
        Hewan binatang = new Hewan();

        Kucing oci = new Kucing();

        // both object doesnt have the method of the subclass
        Hewan puteh = new Kucing();

        Hewan bleki = new Anjing();

        // can't reference a subclass to another subclass
        // Kucing koneng = new Anjing();
        // Anjing plores = new Kucing();


        // casting between subclass and superclass
        Hewan contoh1 = new Kucing();
        Kucing kucingLagi = (Kucing) contoh1; // only allowed if the object is an instance of this subclass
        kucingLagi.setNama("kucing lagi");

        // error
        // Anjing anjingLagi = (Anjing) contoh1;

        // contoh usecase
        Hewan jackie = new Kucing();
        jackie.setSpesies("Kucing");
        Kucing kipo = new Kucing();
        kipo.setSpesies("Kucing");
        Anjing digo = new Anjing();
        digo.setSpesies("Anjing");


        Hewan[] kumpulanHewan = {jackie, kipo, digo};
        printSpesies(kumpulanHewan);

    }

    // contoh usecase
    public static void printSpesies(Hewan[] hewans){
        for (Hewan hewan : hewans){
            System.out.println(hewan.getSpesies());
        }
    }
}

class Hewan{
    private String spesies;
    private String jenisKelamin;

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}

class Kucing extends Hewan{
    private String nama;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

class Anjing extends Hewan{
    private String nama;
    private int umur;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Anggora extends Kucing{
    private int jumlahTurunan;

    public int getJumlahTurunan() {
        return jumlahTurunan;
    }

    public void setJumlahTurunan(int jumlahTurunan) {
        this.jumlahTurunan = jumlahTurunan;
    }
}