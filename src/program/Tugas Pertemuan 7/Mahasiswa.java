package pbo;

import java.util.*;

public class Mahasiswa {
    private String nim;
    private String nama, ipk;
    public static List<Mahasiswa> mahasiswas = new ArrayList<Mahasiswa>();
    

    public Mahasiswa() {
    }
        
    public Mahasiswa(String nim, String nama, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
      
    public void sortNama() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa a, Mahasiswa ab) {
                return a.getNama().compareTo(ab.getNama());
            }
            
        });
        
        mahasiswas.forEach((mahasiswa) -> {
            System.out.println("-------------------------");
            System.out.println("NIM = " + mahasiswa.getNim());
            System.out.println("Nama= " + mahasiswa.getNama());
            System.out.println("IPK = " + mahasiswa.getIpk());
        });
    }
    
    public void sortNim() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa a, Mahasiswa ab) {
                return a.getNim().compareTo(ab.getNim());
            }
            
        });
        
        mahasiswas.forEach((mahasiswa) -> {
            System.out.println("-------------------------");
            System.out.println("NIM = " + mahasiswa.getNim());
            System.out.println("Nama= " + mahasiswa.getNama());
            System.out.println("IPK = " + mahasiswa.getIpk());
        });
    }
    
      public void sortIpk() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa a, Mahasiswa ab) {
                return a.getIpk().compareTo(ab.getIpk());
            }
            
        });
        
        mahasiswas.forEach((mahasiswa) -> {
            System.out.println("-------------------------");
            System.out.println("NIM = " + mahasiswa.getNim());
            System.out.println("Nama= " + mahasiswa.getNama());
            System.out.println("IPK = " + mahasiswa.getIpk());
        });
    }
           
   public void isiData(String nim, String nama, String ipk) {
        mahasiswas.add(new Mahasiswa(nim, nama, ipk));
     
    }
    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + '}';
    }
    
  
}
