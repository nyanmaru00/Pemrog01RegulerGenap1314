package praktikum06b.bin;

public class DemoOverloading
{
	public static void main(String[] yanu)
	{
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "yanu";
		d.email="yanu.darmawan00@gmail.com";
		d.info();
	}
}