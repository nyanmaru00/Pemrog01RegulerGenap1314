package Latihan9c.bin;
public class TesSuku{
	public static void main(String[] yanu){
		SukuInd SI = new SukuInd("Tiara", "Jakarta", "Nonton", "Direktur");
			System.out.println("Nama      : " +SI.getNama());
			System.out.println("Alamat    : " +SI.getAlamat());
			System.out.println("Hobby     : " +SI.getHobby());
			System.out.println("Pekerjaan : " +SI.getPekerjaan());
			System.out.println();
			System.out.println();
		Sunda SD = new Sunda("Sekar Arum", "Bogor", "Menyayi", "Manager");
			System.out.println("Nama      : " +SD.getNama());
			System.out.println("Alamat    : " +SD.getAlamat());
			System.out.println("Hobby     : " +SD.getHobby());
			System.out.println("Pekerjaan : " +SD.getPekerjaan());
			System.out.println();
			System.out.println();	
		Batak BT = new Batak("Cintya Sinaga", "Medan", "Menari", "Marketing");
			System.out.println("Nama      : "+BT.getNama());
			System.out.println("Alamat    : "+BT.getAlamat());
			System.out.println("Hobby     : "+BT.getHobby());
			System.out.println("Pekerjaan : "+BT.getPekerjaan());
			System.out.println();
			System.out.println();	
		Sumba SB = new Sumba("Fanny", "Depok", "Baca", "Operator");
			System.out.println("Nama      : "+SB.getNama());
			System.out.println("Alamat    : "+SB.getAlamat());
			System.out.println("Hobby     : "+SB.getHobby());
			System.out.println("Pekerjaan : "+SB.getPekerjaan());
			System.out.println("Gaji      : Rp. "+SB.getGAJI());
			System.out.println();
			System.out.println();
		//Bilangan Bulat
		Jawa JWa = new Jawa("Rifai", "Ponorogo", "jatoh", "General Manager");
			System.out.println("Nama      : "+JWa.getNama());
			System.out.println("Alamat    : "+JWa.getAlamat());
			System.out.println("Hobby     : "+JWa.getHobby());
			System.out.println("Pekerjaan : "+JWa.getPekerjaan());
			System.out.println("Gaji      : Rp. "+JWa.getGAJI());
			System.out.println("Keterangan: "+JWa.THR(30000));
			System.out.println();
			System.out.println();
		//bilangan Pecahan
		Jawa JWb = new Jawa("Erlangga", "Purworejo", "Lari", "RT");
			System.out.println("Nama      : "+JWb.getNama());
			System.out.println("Alamat    : "+JWb.getAlamat());
			System.out.println("Hobby     : "+JWb.getHobby());
			System.out.println("Pekerjaan : "+JWb.getPekerjaan());
			System.out.println("Gaji      : Rp. "+JWb.getGAJI());
			System.out.println("Keterangan: "+JWb.THR(0.75));
			System.out.println();
			System.out.println();
}
}