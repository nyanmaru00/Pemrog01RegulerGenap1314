package praktikum07a.bin;

public class Angka02
{
	public static void main(String[] Rivai)
	{
		double Penyebut = 9;
		double Pembilang = 2;
		try
		{
			System.out.println("hasil pembaginya adalah " + Penyebut/Pembilang);
		}
		catch(ArithmeticException e)
		{
			System.out.println("pembagiannya dengan angka 0...");
		}
		System.out.println("selesai");
	}
}