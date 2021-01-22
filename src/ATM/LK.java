package ATM;

import java.util.Scanner;

public class LK {
//    public static void main(String[] args) {
//        pilihBahasa();
//    }

    public void pilihBahasa(){
        Scanner Input = new Scanner(System.in);

        var noAccess = "No Acces\nSelect [1/2]";
        String language = "";

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
        Input.close();
    }
}
