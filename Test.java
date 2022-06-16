import java.util.Scanner;

public class Test {

	private static final Object barisIBAN = null;

	public static void main(String[] args) {
		// ugur yaman : iban TR1234 345 677 345 789 5678 56 65
		// ugurun kullanýcý adý ve þifresi : ugur58 ---1453

		// barýs yaman : iban tr4332 224 432 456 765 8765 98 89
		// barýþ ýn kullanýc adý ve sifresi : barýs34 --- 1071

		/*
		 * bakiye görüntüleme için -->1 upurun he para çekmek için -->2 farklý hesaba
		 * para yatýrmak için --->3 uygulamadan cýkmak için --->q ' tuþuna basýn
		 */

		String islemSecenekleri = "bakiye görüntüleme -->1" + "para cekmek -->2" + "farklý hesaba para yatýrmak -->3"
				+ "cýkýs icin q'tuþuna basýnýz";
		Scanner scanner = new Scanner(System.in);

		double ugurBakiye = 2450;
		String ugurBakiye1 = "TR1234 345 677 345 789 5678 56 65";
		String ugurKullanici = "ugur58";
		String ugurSifre = "1453";

		double barisBakiye = 1200;
		String barisBakiye1 = "TR4332 224 432 456 765 8765 98 89";
		String barisKullanici = "baris34";
		String barisSifre = "1071";

		System.out.println("atm ye hoþgeldiniz.");
		System.out.println("lütfen bilgilerinizi giriniz");

		System.out.println("kullanýcý adý :");
		String kullaniciAdi = scanner.nextLine();

		System.out.println("þifre :");
		String sifre = scanner.nextLine();

		if (kullaniciAdi.equals("ugur58") && sifre.equals("1453")) {
			System.out.println("ugur yaman hesabýna giriþ yapýldý");
			System.out.println(islemSecenekleri);

			System.out.print("lütfen þecim yapýnýz :");
			String secim = scanner.nextLine();

			switch (secim) {
			case "1":
				System.out.println("bakiyeniz :" + ugurBakiye);
				break;

			case "2":
				System.out.println("cekmek istediðiniz tutarý giriniz");
				int cekilekTutar = scanner.nextInt();
				if (ugurBakiye > cekilekTutar) {
					ugurBakiye -= cekilekTutar;
					System.out.println("kalan tutar :" + ugurBakiye);

				} else {
					System.out.println("bakiyenizden fazla para cekemezsiniz..");

				}
				break;

			case "3":
				System.out.println("ne kadar yatýrmak istiyorsunuz");
				int yatiralacakTutar = scanner.nextInt();
				if (yatiralacakTutar <= ugurBakiye) {
					System.out.println("iban giriniz :");
					scanner.hasNextLine();
					String yatirilacakIBAN = scanner.nextLine();

					if (yatirilacakIBAN.equals(barisIBAN)) {
						System.out.println("para barýs yaman adlý kiþiye yatýrýlýyor");
						ugurBakiye -= yatiralacakTutar;
						barisBakiye += yatiralacakTutar;
					}
				}
				break;
			}

		} else if (kullaniciAdi.equals("baris34") && sifre.equals("1071")) {
			System.out.println("barýþ yaman hesabýna giriþ yapýldý.. ");

			System.out.println(islemSecenekleri);
		} else {
			System.out.println("kullanýcý adýnýz veya þifreniz yanlýþ!!");
		}
	}
}