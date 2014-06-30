package Latihan9f.bin;

class Mahasiswa extends Orang 
{
	//atribut untuk mahasiswa
	private String NIM = "";
	private float IPK;
	
	//metode constructor
	public Mahasiswa(String NM, int UMR, String ALMT, String STS, String NT, String NI, float IP)
	{
		super(NM, UMR, ALMT, STS, NT);
		NIM = NI;
		IPK = IP;
	}
	
	//modifier
	public void setNIM(String NI)
	{
		this.NIM = NI;
	}
	public void setIPK(float IP)
	{
		this.IPK = IP;
	}
	
	//accesor
	public String getNIM()
	{
		return NIM;
	}
	public float getIPK()
	{
		return IPK;
	}
	public String Display()
	{
		return super.Display() +"NIM " +NIM+ "-IPK" +IPK;
	}
}