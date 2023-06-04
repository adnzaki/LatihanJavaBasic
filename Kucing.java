public class Kucing {
    String nama;

    int umur;

    String warna;
    
    public Kucing(String nama) {
        this.nama = nama;
    }

    public int setUmur(int umur) {
        this.umur = umur;

        return umur;
    }

    public String setWarna(String warna) {
        this.warna = warna;

        return warna;
    }

    public static void main(String[] args) {
        Kucing kucing = new Kucing("Bobby");
        kucing.setUmur(5);
        kucing.setWarna("orange");
        System.out.println("Nama kucing: " + kucing.nama);
        System.out.println("Umur: " + kucing.umur + " tahun");
        System.out.println("Warna: " + kucing.warna);
    }
}