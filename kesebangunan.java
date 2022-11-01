
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class kesebangunan {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai A (Kecil 1) ");
        System.out.println(" *************************************************************");

        double a = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai B (Kecil 2)");
        System.out.println(" ************************************************************* ");

        double b = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai c (Besar 1)");
        System.out.println(" ************************************************************* ");

        double c = sc.nextInt();

        double hasild = b * c / a;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Hasilnya : C/A = D/B = " + hasild);
        System.out.println(" ********************************************************** ");
    }

}
