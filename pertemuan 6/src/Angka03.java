//Created By : yanu darmawan 
//date       : 23 April 2014

package Latihan7b.bin;

public class Angka03
{
	public static void main(String[] yanu)
	{
		double Penyebut = 9;
		double Pembilang = 0;
		try
		{
			System.out.println("Hasil Pembaginya adalah " +Penyebut/Pembilang);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Pembagi dengan angka 0...");
		}
		System.out.println("Selesai");
	}
}