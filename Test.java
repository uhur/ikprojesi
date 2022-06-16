import java.util.Scanner;

public class Test {

	private static final Object barisIBAN = null;

	public static void main(String[] args) {
		// ugur yaman : iban TR1234 345 677 345 789 5678 56 65
		// ugurun kullan�c� ad� ve �ifresi : ugur58 ---1453

		// bar�s yaman : iban tr4332 224 432 456 765 8765 98 89
		// bar�� �n kullan�c ad� ve sifresi : bar�s34 --- 1071

		/*
		 * bakiye g�r�nt�leme i�in -->1 upurun he para �ekmek i�in -->2 farkl� hesaba
		 * para yat�rmak i�in --->3 uygulamadan c�kmak i�in --->q ' tu�una bas�n
		 */

		String islemSecenekleri = "bakiye g�r�nt�leme -->1" + "para cekmek -->2" + "farkl� hesaba para yat�rmak -->3"
				+ "c�k�s icin q'tu�una bas�n�z";
		Scanner scanner = new Scanner(System.in);

		double ugurBakiye = 2450;
		String ugurBakiye1 = "TR1234 345 677 345 789 5678 56 65";
		String ugurKullanici = "ugur58";
		String ugurSifre = "1453";

		double barisBakiye = 1200;
		String barisBakiye1 = "TR4332 224 432 456 765 8765 98 89";
		String barisKullanici = "baris34";
		String barisSifre = "1071";

		System.out.println("atm ye ho�geldiniz.");
		System.out.println("l�tfen bilgilerinizi giriniz");

		System.out.println("kullan�c� ad� :");
		String kullaniciAdi = scanner.nextLine();

		System.out.println("�ifre :");
		String sifre = scanner.nextLine();

		if (kullaniciAdi.equals("ugur58") && sifre.equals("1453")) {
			System.out.println("ugur yaman hesab�na giri� yap�ld�");
			System.out.println(islemSecenekleri);

			System.out.print("l�tfen �ecim yap�n�z :");
			String secim = scanner.nextLine();

			switch (secim) {
			case "1":
				System.out.println("bakiyeniz :" + ugurBakiye);
				break;

			case "2":
				System.out.println("cekmek istedi�iniz tutar� giriniz");
				int cekilekTutar = scanner.nextInt();
				if (ugurBakiye > cekilekTutar) {
					ugurBakiye -= cekilekTutar;
					System.out.println("kalan tutar :" + ugurBakiye);

				} else {
					System.out.println("bakiyenizden fazla para cekemezsiniz..");

				}
				break;

			case "3":
				System.out.println("ne kadar yat�rmak istiyorsunuz");
				int yatiralacakTutar = scanner.nextInt();
				if (yatiralacakTutar <= ugurBakiye) {
					System.out.println("iban giriniz :");
					scanner.hasNextLine();
					String yatirilacakIBAN = scanner.nextLine();

					if (yatirilacakIBAN.equals(barisIBAN)) {
						System.out.println("para bar�s yaman adl� ki�iye yat�r�l�yor");
						ugurBakiye -= yatiralacakTutar;
						barisBakiye += yatiralacakTutar;
					}
				}
				break;
			}

		} else if (kullaniciAdi.equals("baris34") && sifre.equals("1071")) {
			System.out.println("bar�� yaman hesab�na giri� yap�ld�.. ");

			System.out.println(islemSecenekleri);
		} else {
			System.out.println("kullan�c� ad�n�z veya �ifreniz yanl��!!");
		}
	}
}