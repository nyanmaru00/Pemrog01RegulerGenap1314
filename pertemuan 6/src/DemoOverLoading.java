//Created By : yanu darmawan 
//date       : 23 April 2014

package Latihan6b.bin;

public class DemoOverLoading
{
	public static void main(String[] yanu)
	{
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "candra";
		d.email = "Ichan@gmail.com";
		d.info();
	}
}