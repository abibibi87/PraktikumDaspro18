import java.util.Scanner;

public class StudiKasus118  {
  public static void main(String[] args)  {

    Scanner sc = new Scanner(System.in);

    int hargaPerCup = 18000;
    int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

    System.out.print("Masukkan jumlah cup: ");
    jumlahCup = sc.nextInt();

    System.out.print("Masukkan uang bayar: ");
    uangBayar = sc.nextInt();

    totalHarga = hargaPerCup * jumlahCup;
    diskon = 0;

    if (totalHarga > 100000) {
      diskon = (int)(0.1 * totalHarga);
    }







    sc.close();
  }
}