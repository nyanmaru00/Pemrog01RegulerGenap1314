package Latihan9c.bin;
public class SukuInd
{
	protected String NAMA;
	protected String ALAMAT;
	protected String HOBBY;
	protected String PEKERJAAN;
	
	public SukuInd(String Nama, String Alamat, String Hobby, String Pekerjaan)
	{
		super();
		NAMA		=Nama;
		ALAMAT		=Alamat;
		HOBBY		=Hobby;
		PEKERJAAN	=Pekerjaan;
	}
	public String getNama() {
		return NAMA;
	}
	public String getAlamat()
	{
	return ALAMAT;
	}
	public String getHobby()
	{
	return HOBBY;
	}
	public String getPekerjaan()
	{
	return PEKERJAAN;
	}
}