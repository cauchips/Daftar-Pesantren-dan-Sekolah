package com.azhar.daftarpesantren.sekolah;

public class ModelSekolah {
    private String sekolah_id_enkrip;
    private String kecamatan;
    private String kabupaten;
    private String propinsi;
    private String kode_kecamatan;
    private String kode_kab;
    private String kode_prop;
    private String nama_sekolah;
    private String npsn;
    private String alamat_jalan;
    private String status;

    // Konstruktor
    public ModelSekolah(String sekolah_id_enkrip, String kecamatan, String kabupaten, String propinsi,
                  String kode_kecamatan, String kode_kab, String kode_prop,
                  String nama_sekolah, String npsn, String alamat_jalan, String status) {
        this.sekolah_id_enkrip = sekolah_id_enkrip;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.propinsi = propinsi;
        this.kode_kecamatan = kode_kecamatan;
        this.kode_kab = kode_kab;
        this.kode_prop = kode_prop;
        this.nama_sekolah = nama_sekolah;
        this.npsn = npsn;
        this.alamat_jalan = alamat_jalan;
        this.status = status;
    }

    // Getter dan Setter untuk setiap field
    public String getSekolah_id_enkrip() {
        return sekolah_id_enkrip;
    }

    public void setSekolah_id_enkrip(String sekolah_id_enkrip) {
        this.sekolah_id_enkrip = sekolah_id_enkrip;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public String getKode_kecamatan() {
        return kode_kecamatan;
    }

    public void setKode_kecamatan(String kode_kecamatan) {
        this.kode_kecamatan = kode_kecamatan;
    }

    public String getKode_kab() {
        return kode_kab;
    }

    public void setKode_kab(String kode_kab) {
        this.kode_kab = kode_kab;
    }

    public String getKode_prop() {
        return kode_prop;
    }

    public void setKode_prop(String kode_prop) {
        this.kode_prop = kode_prop;
    }

    public String getNama_sekolah() {
        return nama_sekolah;
    }

    public void setNama_sekolah(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
    }

    public String getNpsn() {
        return npsn;
    }

    public void setNpsn(String npsn) {
        this.npsn = npsn;
    }

    public String getAlamat_jalan() {
        return alamat_jalan;
    }

    public void setAlamat_jalan(String alamat_jalan) {
        this.alamat_jalan = alamat_jalan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

