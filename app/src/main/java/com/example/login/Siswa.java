package com.example.login;

public class Siswa {
    private String name;
    private String absen;
    private String kelas;

    private String deskripsi;
    private int imageResId;

    // Constructor
//    public Siswa(String name, String absen, String kelas) {
//        this.name = name;
//        this.absen = absen;
//        this.kelas = kelas;
//    }
    public Siswa(String name, String absen, String kelas, String deskripsi, int imageResId) {
        this.name = name;
        this.absen = absen;
        this.kelas = kelas;
        this.deskripsi = deskripsi;
        this.imageResId = imageResId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAbsen() {
        return absen;
    }

    public String getKelas() {
        return kelas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getImageResId(){
        return imageResId;
    }
}
