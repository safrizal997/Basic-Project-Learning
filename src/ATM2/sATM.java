package ATM2;

import java.util.Scanner;

public class sATM {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String language;
        int PIN;
        int saldo = 2000000;
        String menu;
        int tarikTunai;
        int saldoAwal;




        System.out.println("Welcome\n");


        System.out.print("Language:\n1.English\n2.Indonesia\nSelect [1/2] : ");

        while (true){
            language = input.nextLine();
            if (language.equalsIgnoreCase("1")){
                System.out.print("\nInput PIN: ");
                break;
            }else if (language.equalsIgnoreCase("2")){
                System.out.print("\nMasukkan PIN: ");
                break;
            }else {
                System.out.print("select [1/2]: ");
            }

        }
        while (true){
            PIN = input.nextInt();
            if (PIN == 12){

                System.out.print("\nMENU\n" +
                        "1.Info Saldo\n" +
                        "2.Tarik Tunai\n" +
                        "3.Setor Tunai\n" +
                        "4.Transfer\n" +
                        "\nPilih: ");
                break;

            }else{
                System.out.print("Invalid PIN\nInput PIN: ");
            }

        }

        while (true){

            menu = input.nextLine();
            if (menu.equalsIgnoreCase("1")){

                System.out.print("Saldo anda adalah:\nRp."+ saldo+"\n" +
                        "Back to menu, press[0] : ");

            }else if (menu.equalsIgnoreCase("0")){
                System.out.print("\nMENU\n" +
                        "1.Info Saldo\n" +
                        "2.Tarik Tunai\n" +

                        "3.Setor Tunai\n" +
                        "4.Transfer\n" +
                        "\nPilih: ");
            }
            else if (menu.equalsIgnoreCase("2")){
                System.out.print("\nMasukkan jumlah nominal: Rp.");
                tarikTunai =input.nextInt();

                if (tarikTunai < 50000){
                    System.out.println("Min Transaksi Rp 50.000");
                }else if(saldo - tarikTunai < 50000){
                    System.out.println("Saldo min Rp 50.000");
                }else {
                    saldoAwal=saldo;
                    saldo -= tarikTunai;
                    System.out.println("Saldo Awal anda: Rp."+saldoAwal+"\n" +
                            "Jumlah penarikan: Rp."+tarikTunai+"\n" +
                            "Sisa saldo: Rp."+saldo);
                }


            }else if (menu.equalsIgnoreCase("3")){

            }else if (menu.equalsIgnoreCase("4")){

            }else {

            }



        }












    }
}
