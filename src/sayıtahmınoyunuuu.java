import java.util.Random;
import java.util.Scanner;

public class say�tahm�noyunuuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Sayi tahmin oyununa ho� geldiniz!");
		System.out.println("L�tfen 1-100 arasinda bir sayi giriniz: ");
		//Kullan�c�dan say� al�yoruz.
		
		int tahmin = input.nextInt();
		// Bilgisayardan rastgele say� al�yoruz.
		int sayi = rnd.nextInt(101);
		while (tahmin != sayi) {
			if (tahmin < 0 || tahmin > 100) {
				System.out.println("1 ile 100 arasinda bir de�er giriniz: ");
				tahmin = input.nextInt();
			} else if (tahmin < sayi) {
				System.out.println("Daha b�y�k bir sayi giriniz: ");
				tahmin = input.nextInt();
			} else {
				System.out.println("Daha k���k bir sayi giriniz: ");
				tahmin = input.nextInt();
			}
		}
		// E�er say�m�z ve tahmin edilen say�  birbirine e�it ise while d�ng�s�ne girmez
		// ve print komutunu yazd�r�r�z.
		System.out.println("Tebrikler! kazand�n�z :)");
	}

}
