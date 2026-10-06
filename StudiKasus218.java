import java.util.Scanner;

public class StudiKasus218 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama, jenis, hasil;
        int dokumen, juara, statusPKM;

        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Masukkan jenis kegiatan: ");
        jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {

            System.out.print("Masukkan peringkat juara: ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {

                System.out.print("Masukkan jumlah dokumen: ");
                dokumen = sc.nextInt();

                if (dokumen == 4) {
                    hasil = "Berhak memperoleh dana penghargaan.";
                } else {
                    hasil = "Dokumen tidak lengkap (kurang "
                            + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }

            } else {
                hasil = "Tidak memperoleh dana penghargaan "
                        + "(hanya untuk Juara 1/2/3).";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Masukkan status pendanaan PKM (1/0): ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {

                System.out.print("Masukkan jumlah dokumen: ");
                dokumen = sc.nextInt();

                if (dokumen == 4) {
                    hasil = "Berhak memperoleh dana penghargaan "
                            + "(PKM lolos pendanaan).";
                } else {
                    hasil = "Dokumen tidak lengkap (kurang "
                            + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }

            } else {
                hasil = "Tidak memperoleh dana penghargaan "
                        + "(PKM tidak lolos pendanaan).";
            }

        } else if (jenis.equalsIgnoreCase("Lainnya")) {

            hasil = "Tidak memperoleh dana penghargaan "
                    + "(jenis kegiatan tidak termasuk ketentuan).";

        } else {

            hasil = "Jenis kegiatan tidak valid.";
        }

        System.out.println("Nama: " + nama);
        System.out.println("Jenis kegiatan: " + jenis);
        System.out.println(hasil);

        sc.close();
    }
}
