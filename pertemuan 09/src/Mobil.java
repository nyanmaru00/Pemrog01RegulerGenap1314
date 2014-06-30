package Laihan9e.bin;

class Mobil
{
	private String Jenis;  //merupaka variabel super kelas
	
	//constructor superkelas
	public Mobil(String aTipe)
	{
		Jenis = new String(aTipe);
	}
	public String JenisMobil()
	{
		return "Merupakan Jenis Mobil = "+Jenis;
	}
}