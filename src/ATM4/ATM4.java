package ATM4;

import java.util.Scanner;

public class ATM4 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int PIN;
        int saldo = 0;
        int setor;
        int pinBlock = 3;


        System.out.println("Welcom To Unlimitid ATM\n" +
                "Masukkan PIN :");
        while (pinBlock > 0) {
            PIN = input.nextInt();
            if (PIN == 112233) {

                while (true) {
                    System.out.print("\n--MENU--\n" +
                            "1.Setor Tunai dan Transaksi\n" +
                            "2.Keluar\n" +
                            "Pilih menu: ");
                    String menu = input.next();
                    if (menu.equalsIgnoreCase("1")) {
                        System.out.print("\n--Setor Tunai--\n" +
                                "Masukkan nominal: Rp.");

                        setor = input.nextInt();
                        saldo += setor;
                        System.out.println("Transaksi Berhasil\n" +
                                "Setor       : Rp. " + setor +
                                "\nTotal Saldo : Rp." + saldo);

                        while (true) {
                            System.out.print("\nTransaksi lain [Y/N]: ");
                            String pilih = input.next();

                            if (pilih.equalsIgnoreCase("Y")) {
                                System.out.print("\n--Menu Transaksi--\n" +
                                        "1.Info Saldo\n" +
                                        "2.Tarik Tunai\n" +
                                        "3.Transfer\n" +
                                        "Pilih menu: ");
                                String subMenu = input.next();
                                switch (subMenu) {
                                    case "1":
                                        System.out.print("\n--Info Saldo__\n" +
                                                "Saldo anda Rp. " + saldo);
                                        break;
                                    case "2":

                                        System.out.print("\n--Tarik Tunai--\n" +
                                                "Masukkan Nominal: Rp. ");

                                        int tarik = input.nextInt();
                                        if (saldo - tarik < 50000) {
                                            System.out.println("Transaksi gagal...\n" +
                                                    "Saldo tersimpan minimal Rp 50000");

                                        } else if (tarik < 50000) {
                                            System.out.println("Transaksi Gagal...\n" +
                                                    "Penarikan min Rp 50000");
                                        } else {
                                            saldo -= tarik;
                                            System.out.println("Transaksi Berhasil..\n" +
                                                    "Tarik tunai  Rp. " + tarik + "\n" +
                                                    "Sisa saldo   Rp. " + saldo);
                                        }
                                        break;
                                    case "3":
                                        System.out.print("\n--Transfer--\n" +
                                                "1.Transfer antar rekening\n" +
                                                "2.Transfer antar BANK\n" +
                                                "Pilih [1/2]: ");

                                        String transfer = input.next();


                                        if (transfer.equalsIgnoreCase("1")) {
                                            System.out.println("\n--Transfer antar rekening--\n" +
                                                    "Masukkan nomor rekening [16] digit: ");
                                            while (true) {
                                                int noRek = input.nextInt();
                                                if (noRek == 16) {
                                                    System.out.print("\nMasukkan Nominal Transfer\n" +
                                                            "Rp. ");
                                                    int nomTransfer = input.nextInt();

                                                    saldo -= nomTransfer;
                                                    System.out.println("Transaksi berhasil..\n" +
                                                            "Jumlah Transfer Rp. " + nomTransfer + "\n" +
                                                            "Sisa saldo      Rp." + saldo);
                                                    break;
                                                } else {
                                                    System.out.println("No Rekening Salah...");
                                                }
                                            }
                                        } else if (transfer.equalsIgnoreCase("2")) {
                                            System.out.print("\n--Transfer Antar Bank--\n" +
                                                    "Kode Bank: BCA 001\n" +
                                                    "           BRI 002\n" +
                                                    "           BNI 003\n" +
                                                    "\n" +
                                                    "Input kode Bank: ");

                                            while (true) {
                                                String kodeBank = input.next();
                                                if (kodeBank.equalsIgnoreCase("001")) {
                                                    System.out.print("\nInput No rekening tujuan\n" +
                                                            "BCA: 001 ");
                                                    while (true) {
                                                        String noRekTujuan = input.next();
                                                        if (noRekTujuan.equalsIgnoreCase("1234567890")) {
                                                            System.out.print("Masukkan Nominal Rp. ");
                                                            int nomTransfer = input.nextInt();
                                                            saldo -= nomTransfer;
                                                            System.out.println("\nTransaksi Terhasil..\n" +
                                                                    "Jumlah Transfer Rp. " + nomTransfer + "\n" +
                                                                    "Sisa Saldo      Rp. " + saldo);
                                                            break;
                                                        } else {
                                                            System.out.println("Nomor Rekening Tujuan Tidak Terdaftar..\n" +
                                                                    "Masukkan ulang nomor rekening\n" +
                                                                    "BCA: 001 ");
                                                        }
                                                    }
                                                    break;
                                                } else if (kodeBank.equalsIgnoreCase("002")) {
                                                    System.out.print("\nInput No rekening tujuan\n" +
                                                            "BRI: 002 ");
                                                    while (true) {
                                                        String noRekTujuan = input.next();
                                                        if (noRekTujuan.equalsIgnoreCase("1234567890")) {
                                                            System.out.print("Masukkan Nominal Rp. ");
                                                            int nomTransfer = input.nextInt();
                                                            saldo -= nomTransfer;
                                                            System.out.println("\nTransaksi Terhasil..\n" +
                                                                    "Jumlah Transfer Rp. " + nomTransfer + "\n" +
                                                                    "Sisa Saldo      Rp. " + saldo);
                                                            break;
                                                        } else {
                                                            System.out.println("Nomor Rekening Tujuan Tidak Terdaftar..\n" +
                                                                    "Masukkan ulang nomor rekening\n" +
                                                                    "BRI: 001 ");
                                                        }
                                                    }
                                                    break;
                                                } else if (kodeBank.equalsIgnoreCase("003")) {
                                                    System.out.print("\nInput No rekening tujuan\n" +
                                                            "BNI: 003 ");
                                                    while (true) {
                                                        String noRekTujuan = input.next();
                                                        if (noRekTujuan.equalsIgnoreCase("1234567890")) {
                                                            System.out.print("Masukkan Nominal Rp. ");
                                                            int nomTransfer = input.nextInt();
                                                            saldo -= nomTransfer;
                                                            System.out.println("\nTransaksi Terhasil..\n" +
                                                                    "Jumlah Transfer Rp. " + nomTransfer + "\n" +
                                                                    "Sisa Saldo      Rp. " + saldo);
                                                            break;
                                                        } else {
                                                            System.out.println("Nomor Rekening Tujuan Tidak Terdaftar..\n" +
                                                                    "Masukkan ulang nomor rekening\n" +
                                                                    "BNI: 003 ");
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    System.out.println("Kode Bank Tidak Terdaftar\n" +
                                                            "Masukkan ulang kode Bank: ");
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("Wrong");
                                }

                            } else {
                                System.out.println("Untuk mengakhiri transaksi\n" +
                                        "Tekan [2.Keluar]");
                                break;
                            }
                        }


                    } else if (menu.equalsIgnoreCase("2")) {
                        System.out.println("--Terimakasih--");
                        break;

                    } else {
                        System.out.println("Press [1/2]");
                    }
                }
                break;
            } else {
                System.out.println("PIN salah");
                pinBlock--;
                if (pinBlock == 0) {
                    System.out.println("PIN terblokir");
                }
            }
        }

    }


}
