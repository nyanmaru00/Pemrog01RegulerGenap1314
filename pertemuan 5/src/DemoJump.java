//perintah control flow/struktur kontrol
//perintah kelima - contoh 05

package Latihan05i.sesi1.bin;
import java.util.Random;

public class DemoJump
{
	public static void main(String[] yanu)
	{
		Integer faktor =7;
		System.out.println("Mencari Kelipatan " +faktor+ "dengan break");
		while(true)
		{
			Integer random = new Random().nextInt();
			System.out.println("Bilangan random : " +random);
			
			if(random % faktor == 0)
			{
				System.out.println("Kelipatan " +faktor+ "ditemukan, yaitu :" +random);
				break;
			}
		}
	}
}