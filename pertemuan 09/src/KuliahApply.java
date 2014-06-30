package Latihan9f.bin;
public class KuliahApply
{
	public static void main(String[] args)
	{
		Dosen DOS = new Dosen("Candra Nursari", 45, "Depok", "Menikah","007","03","Lektor Kapala", 1500000);
		Mahasiswa MH = new Mahasiswa("Yanu Darmawan", 20, "Madiun", "Mahasiswa", "4512210017", "2012", 4);
		
		System.out.println(DOS.Display());
		System.out.println(MH.Display());
		
	}
}