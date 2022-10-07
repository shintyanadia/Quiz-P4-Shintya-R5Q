import java.util.Scanner;

class CarCleaning {
    String nama,alamat,telp,email,ket,pesananjasa,pesanantim;
    int pilihjasa,pilihtim,biayajasa,biayaalat,biayabahan,biayatrans,totbiaya;
        
    public void dataPemesan() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------------------------oOo--------------------------------");
        System.out.println("*Masukkan Data Pemesan*");
        
        System.out.print("Masukkan Nama    :  ");
        this.nama = input.nextLine();
        
        System.out.print("Masukkan Alamat  :  ");
        this.alamat = input.nextLine();
        
        System.out.print("Masukkan No. Tlp :  ");
        this.telp = input.nextLine();
        
        System.out.print("Masukkan Email   :  ");
        this.email = input.nextLine();
    }

    public void jenisJasa () {
        System.out.println("*Jenis Jasa*");
        System.out.println("1. Cuci Mobil");
        System.out.println("2. Salon Mobil Interior");
        System.out.println("3. Salon Mobil Eksterior");
        
        Scanner input = new Scanner(System.in);
        System.out.print(" ");
        System.out.print("Pilih Jasa : ");
        this.pilihjasa = input.nextInt();
        
        if (this.pilihjasa == 1) {
            this.pesananjasa = "Cuci mobil";
        } else if(this.pilihjasa == 2) {
            this.pesananjasa = "Salon Mobil Interior";
        } else if(this.pilihjasa == 3) {
            this.pesananjasa = "Salon Mobil Eksterior"; 
        } else {
            System.out.print("Jenis Jasa Tidak Tersedia");
        }
    }
    
    public void timPenyediaJasa () {
        System.out.println("*Team Penyedia Jasa*");
        System.out.println("1. Team Sea (2 Orang)");
        System.out.println("2. Team Mountain (4 Orang)");
        System.out.println("3. Team Forest (5 Orang)");
        
        Scanner input = new Scanner(System.in);
        System.out.print(" ");
        System.out.print("Pilih Team : ");
        this.pilihtim = input.nextInt();
        
        if (this.pilihtim == 1) {
            this.pesanantim = "Team Sea (2 Orang)";
        } else if(this.pilihtim == 2) {
            this.pesanantim = "Team Mountain (4 Orang)";
        } else if(this.pilihtim == 3) {
            this.pesanantim = "Team Forest (5 Orang)";
        } else {
            System.out.print("Layanan Jasa Team Tidak Tersedia");
        }
    }
    
    public void keteranganPemesanan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Berikan Keterangan Pemesanan : ");
        this.ket = input.nextLine();
    }
    
    public void biayaPenyediaJasa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Biaya Penyedia Jasa Rp. ");
        this.biayajasa = input.nextInt();
        
        System.out.print("Masukkan Biaya Jasa Alat     Rp. ");
        this.biayaalat = input.nextInt();
        
        System.out.print("Masukkan Biaya Penyedia Jasa Rp. ");
        this.biayabahan = input.nextInt();
        
        System.out.print("Masukkan Biaya Transportasi  Rp. ");
        this.biayatrans = input.nextInt();
        
        System.out.println("------------------------------oOo-----------------------------------");
    }
}

class SuksesJaya extends CarCleaning {
    
    public SuksesJaya() {
        super();
    }
    
    public String namaPemesan() {
        return this.nama;
    }
    
    public String tampilkanJenisJasa() {
        return this.pesananjasa;
    }
    
    public String tampilkanPenyediaJasa() {
        return this.pesanantim;
    }
    
    public String tampilkanKet() {
        return this.ket;
    }
    
    public int JumlahkanBiayaJasa() {
        this.totbiaya = this.biayajasa + this.biayabahan + this.biayaalat + this.biayatrans;
        return this.totbiaya;
    }
}

public class MainCarCleaning {
    public static void main(String[]args) {
        SuksesJaya data = new SuksesJaya();
        
        System.out.print('\u000C');
        System.out.println("-------------- Car Cleansing.. Anda Pesan Kami Datang ---------------");
        System.out.println("=====================================================================");
        System.out.println(" ");
        
        data.dataPemesan();
        System.out.print("\n");
        data.jenisJasa();
        System.out.print("\n");
        data.timPenyediaJasa();
        System.out.print("\n");
        data.keteranganPemesanan();
        System.out.print("\n");
        data.biayaPenyediaJasa();

        System.out.println(" ");
        System.out.println("=====================================================================");
        System.out.println("Jasa yang di pesan : " + data.tampilkanJenisJasa());
        System.out.println("Nama Penyedia Jasa : " + data.tampilkanPenyediaJasa());
        System.out.println("Keterangan         : " + data.tampilkanKet());
        System.out.println(" ");
        System.out.println("Total Biaya yang di Bayar Pemesan Rp. " + data.JumlahkanBiayaJasa());
        System.out.println(" ");
        System.out.println("Salam Bersih " + data.namaPemesan() + " Terima Kasih");
    }
}

 
        
        
     
     
         
         
         
