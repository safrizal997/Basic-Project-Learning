package ATM;

import java.util.Scanner;

public class SysATM {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);


        String language = "";
        int saldo = 2000000;


        int PIN;


        System.out.println("Welcome");

        var noAccess = "No Acces\n Select [1/2]";
        while (true) {
            System.out.print("\nSelect Language\n" +
                    "1.Indonesia\n" + "2.Inggris\n" + "Select [1/2] : ");
            language = Input.nextLine();
            if (language.equalsIgnoreCase("1")) {
                System.out.print("Masukkan PIN :");
                break;
            } else if (language.equalsIgnoreCase("2")) {
                System.out.print("Insert your PIN :");
                break;
            } else {
                System.out.println(noAccess);
            }
        }



        // PIN = Input.nextInt();

        String transaksiBaru = "Insert PIN";
        while (true) {


            PIN = Input.nextInt();
            if (PIN == 111) {
                System.out.println("Menu\n" + "1.Info Saldo\n" + "2.Tarik Tunai");
                System.out.print("Pilih menu: ");
                String menu = Input.next();
                int saldoSekarang = saldo;
                if (menu.equalsIgnoreCase("1")) {
                    System.out.println("saldo anda Rp." + saldoSekarang);
                } else if (menu.equalsIgnoreCase("2")) {
                    System.out.print("Masukkan Nominal Penarikan: ");
                    int penarikan = Input.nextInt();

                    if (saldo - penarikan < 100000) {
                        System.out.println("Failed");

                    } else if (penarikan < 100000) {
                        System.out.println("Transaksi min Rp 100000");
                    } else {
                        saldo -= penarikan;
                        System.out.println("saldo awal anda Rp." + saldoSekarang + "\n" +
                                "Jumlah penarikan Rp." + penarikan + "\n" + "Sisa saldo Rp. " + saldo);
                    }
                }

                System.out.print("Transaksi Lain [Y/N]");
                String pilihan = Input.next();
                if (pilihan.equalsIgnoreCase("y")) {
                    System.out.println(transaksiBaru);
                } else {
                    break;
                }

            } else {
                System.out.print("Wrong PIN, insert PIN :");
            }


            //Step

        }


    }


}
