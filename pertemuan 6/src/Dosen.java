//Created By : yanu darmawan 
//date       : 23 April 2014

//Perintah Class & Object - Dosen
package Latihan6b.bin;

public class Dosen
{
	String nama;
	String email;
	
	//begitu kita mendefinisikan constructor,
	// java tidak akan membutuhkan default constructor
	public Dosen(String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	
	//tidak otomatis dibuat oleh java 
	//bila dibutuhkan kita harus buat sendiri 
	
	public Dosen() {}
	
	//Method
	public void info()
	{
		System.out.println("Nama Dosen : " +nama);
		System.out.println("Email Dosen : " +email);
		System.out.println();
		System.out.println();
		
	}
}