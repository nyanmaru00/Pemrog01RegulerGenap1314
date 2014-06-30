package Latihan9d.bin;
class PajakApply
{
	public static void main(String[] yanu)
	{
		Pajak PJK = new Pajak();  //membuat obyek
		PJK.Pendapatan = 6000000; //memberikan nilai
		PJK.Propinsi = "Jawa Timur";
		PJK.Kota = "Mojosari - Mojokerto";
		double PajakAnda = PJK.HitungPajak();  //menghitung pajak
		
		PajakProp PJK01 = new PajakProp();
		double PajakAndaProp = PJK01.HitungPjkProp(PajakAnda);
		
		//menampilkan data pajak
		System.out.println("Besar Pajak Anda Sebesar          Rp." +PajakAnda);
		System.out.println("Anda Berada di propinsi           " +PJK.Propinsi);
		System.out.println("anda d Kota                       " +PJK.Kota);
		System.out.println("Potongan Pajak Anda Sebesat       Rp." +PajakAndaProp);
	}
}