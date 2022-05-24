import java.util.Random;
import java.util.Scanner;

public class sayýtahmýnoyunuuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Sayi tahmin oyununa hoþ geldiniz!");
		System.out.println("Lütfen 1-100 arasinda bir sayi giriniz: ");
		//Kullanýcýdan sayý alýyoruz.
		
		int tahmin = input.nextInt();
		// Bilgisayardan rastgele sayý alýyoruz.
		int sayi = rnd.nextInt(101);
		while (tahmin != sayi) {
			if (tahmin < 0 || tahmin > 100) {
				System.out.println("1 ile 100 arasinda bir deðer giriniz: ");
				tahmin = input.nextInt();
			} else if (tahmin < sayi) {
				System.out.println("Daha büyük bir sayi giriniz: ");
				tahmin = input.nextInt();
			} else {
				System.out.println("Daha küçük bir sayi giriniz: ");
				tahmin = input.nextInt();
			}
		}
		// Eðer sayýmýz ve tahmin edilen sayý  birbirine eþit ise while döngüsüne girmez
		// ve print komutunu yazdýrýrýz.
		System.out.println("Tebrikler! kazandýnýz :)");
	}

}
