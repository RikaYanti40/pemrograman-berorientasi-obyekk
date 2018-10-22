
package program;
import java.util.Scanner;
public class tugas {
     public static void main (String[] args){
        int i,pilih;
         Scanner s = new Scanner(System.in);
        System.out.println("Nama   : Rika Yanti");
        System.out.println("NIM    : 5170411307");
        System.out.println("=======================================");
       do
       {
        System.out.println("1. Input data");
        System.out.println("2. Tampil data");
        System.out.println("3. Keluar");
        System.out.print("Pilih : ");
        pilih = s.nextInt();
       }while(pilih!=3); 
    }
 }


