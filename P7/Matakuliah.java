package P7;

public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Setter $ Getter

    public void setKode(String kode) {
        this.kode = kode;
    } 

    public String getKode () {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    } 

    public String getNama () {
        return nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public Integer getSks() {
        return sks;
    } 

}
