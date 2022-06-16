
import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		int bakiye = 1000, input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Merhabalar Bankanýza Hoþgeldiniz");
		System.out.println("Güncel Bakiyeniz :" + bakiye + "tl");

		while (bakiye > 0) {
			System.out.println();
			System.out.println("1-) Para Yatýr");
			System.out.println("2-) Para Çek");
			System.out.println("3-) Bakiye Sorgula");
			System.out.println("4-) Çýkýs Yap");
			System.out.println("yapmak istediðiniz iþlem seçiniz :");
			input = scan.nextInt();
			int miktar;

			if (input == 1) {
				System.out.println("Yatýrmak Ýstediðiniz miktar");
				miktar = scan.nextInt();
				bakiye += miktar;
			} else if (input == 2) {
				System.out.println("Çekmek istediðiniz miktar");
				miktar = scan.nextInt();
				if (miktar > bakiye) {
					System.out.println("Yetersiz Bakiye !!");
				} else {
					bakiye -= miktar;
				}
			} else if (input == 3) {
				System.out.println("güncel bakiyeniz :" + bakiye + " TL ");
			} else if (input == 4) {
				System.out.println("Çýkýþ yapýlýyor !!!");
				break;
			} else {
				System.out.println("Geçersiz iþlem girdiniz");
			}
		}

		System.out.println("Tekrar bekleriz !");
	}

}
