
import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		int bakiye = 1000, input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Merhabalar Bankan�za Ho�geldiniz");
		System.out.println("G�ncel Bakiyeniz :" + bakiye + "tl");

		while (bakiye > 0) {
			System.out.println();
			System.out.println("1-) Para Yat�r");
			System.out.println("2-) Para �ek");
			System.out.println("3-) Bakiye Sorgula");
			System.out.println("4-) ��k�s Yap");
			System.out.println("yapmak istedi�iniz i�lem se�iniz :");
			input = scan.nextInt();
			int miktar;

			if (input == 1) {
				System.out.println("Yat�rmak �stedi�iniz miktar");
				miktar = scan.nextInt();
				bakiye += miktar;
			} else if (input == 2) {
				System.out.println("�ekmek istedi�iniz miktar");
				miktar = scan.nextInt();
				if (miktar > bakiye) {
					System.out.println("Yetersiz Bakiye !!");
				} else {
					bakiye -= miktar;
				}
			} else if (input == 3) {
				System.out.println("g�ncel bakiyeniz :" + bakiye + " TL ");
			} else if (input == 4) {
				System.out.println("��k�� yap�l�yor !!!");
				break;
			} else {
				System.out.println("Ge�ersiz i�lem girdiniz");
			}
		}

		System.out.println("Tekrar bekleriz !");
	}

}
