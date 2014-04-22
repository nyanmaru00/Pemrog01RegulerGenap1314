//Perintah ke lima - contoh 05

package Latihan5j.sesi1.bin;
import java.util.Random;

public class DemoJump2{
	public static void main(String[] yanu){
		Integer faktor = 7;
		Integer jumlahFaktorDiinginkan = 4;
		Integer batasAtas = 10000000;
		System.out.println("Mencari kelipatan " +faktor+ "dengan break dan continue ");
		Integer jumlahFaktorDitemukan = 0;
		while(true) {
			Integer random = new Random().nextInt();
			System.out.println("Bilangan Random : " +random);
			if(random > batasAtas) {
				System.out.println("Melewati batas atas,langsung selesai");
				return; }
			if(random % faktor == 0){
				System.out.println("Kelipatan " +faktor +" ditemukan, yaitu : "+random);
				jumlahFaktorDitemukan++;
				if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan){
					System.out.println("Baru Menemukan "+jumlahFaktorDitemukan+" faktor");
					System.out.println("dari " +jumlahFaktorDiinginkan+" yang diminta, lanjut lagi!");
					continue;}
				else { 
					System.out.println("Sudah ditemukan "+jumlahFaktorDiinginkan +" Yang di minta, lanjut lagi !");
					break;
				}
			}
		}
	System.out.println("Selamat Mencari Kelipatan");
	}
}