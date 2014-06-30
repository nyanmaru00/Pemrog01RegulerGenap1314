//perintah inheritance
package Latihan9b.bin;
public class TesKucing
{
	private static int Jumlah;
	public static void main(String[] yanu)
	{
		Jumlah = 1;
		
		//KucingMakan
		KucingMakan KM = new KucingMakan();
		System.out.println("masukan nama kucing kesayangan anda ["+Jumlah+"] : ");
		KM.setNama(KucingMakan.inputDataString());
		System.out.println("masukan umur kucing kesayangan anda ["+Jumlah+"] : ");
		KM.setUmur(KucingMakan.inputDataInteger());
		System.out.println("masukan makanan kucing kesayangan anda ["+Jumlah+"] : ");
		KM.setMakanan(KucingMakan.inputDataString());
		Jumlah++;
		
		//JML anak Kucing
		JmlAnakKucing JAK = new JmlAnakKucing();
		System.out.println("Masukan Nama Kucing Kesayangan Anda ["+Jumlah+"] : ");
		JAK.setNama(KucingMakan.inputDataString());
		System.out.println("Masukan Umur Kucing Kesayangan Anda ["+Jumlah+"] : ");
		JAK.setUmur(KucingMakan.inputDataInteger());
		System.out.println("Masukan Berat Kucing Kesayangan Anda ["+Jumlah+"] : ");
		JAK.setBerat(KucingMakan.inputDataInteger());
		System.out.println("Masukan Makanan Kucing Kesayangan Anda ["+Jumlah+"] : ");
		JAK.setMakanan(KucingMakan.inputDataString());
		System.out.println("Masukan Jumlah Anak Kucing Anda ["+Jumlah+"] : ");
		JAK.setJumlahAnak(JmlAnakKucing.inputDataInteger());
		
		//Menampilka dataKucingh
		System.out.println("\n\n DATA KUCING");
		KM.Tulis();
		System.out.println("Makanan Kucing anda : " +KM.getMakanan());
		JAK.Tulis();
		System.out.println("Makanan Kucing anda : " +JAK.getMakanan());
		System.out.println("Jumlah Anak Kucing : " +JAK.JumlahAnak());
	}
}