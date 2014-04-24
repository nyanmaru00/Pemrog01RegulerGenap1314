//Created By : yanu darmawan 
//date       : 23 April 2014

package Latihan7a.bin;

public class Angka02
{
	public static void main(String[] yanu)
	{
		double Penyebut = 9;
		double Pembilang = 2;
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