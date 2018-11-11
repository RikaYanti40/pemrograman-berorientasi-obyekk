
package pbo;
import java.util.Scanner;
import static pbo.Mahasiswa.mahasiswas;

public class Tugas {
    
    
    public static void InputData() {
        pbo.Mahasiswa mahasiswa = new pbo.Mahasiswa();
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nim   : ");
        String nim = s.nextLine();
        System.out.print("Masukan nama  : ");
        String nama = s.nextLine();
        System.out.print("Masukan ipk   : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nim, nama, ipk);
    }
    
    public static void tampilData() {
    if (mahasiswas.isEmpty()) {
        System.out.println("Data masih kosong");
    } else {
        System.out.println("-------------------------");
        int counter = 1;
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println("Data ke-" + counter);
            System.out.println("NIM : " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("IPK : " + mahasiswa.getIpk());
            counter++;
        }
    }
}
    public static void SortingData(){
    pbo.Mahasiswa ms =  new pbo.Mahasiswa();
    if (mahasiswas.isEmpty()) {
        System.out.println("Data masih kosong");
    } else {  
      int pil;
        do {
        System.out.println("1. Sorting by nama");
        System.out.println("2. Sorting by nim");
        System.out.println("3. Sorting by ipk");
        System.out.println("4. Keluar");
        System.out.print("Pilih: ");
        Scanner s = new Scanner(System.in);
        pil = s.nextInt();
        switch (pil) {
            case 1:
                 ms.sortNama();
                break;
            case 2:
                ms.sortNim();
                break;
            case 3:
                ms.sortIpk();

                break;
        }
    } while (pil != 4);         
   }
  }
    
    public static void main(String[] args) {
        int pil;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("");
            System.out.println("Tugas Pemrograman Berorientasi Obyek");
            System.out.println("------------------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    SortingData();
                    break;
            }        
           
        } while (pil != 4);
        
        
    }
    
}
