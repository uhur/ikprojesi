import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row, colmn;
		System.out.println("may�n tarlas�na ho� geldiniz");
		System.out.println("l�tfen  oynamal istedi�iniz boyutlar�n� giriniz");
		System.out.print("sat�r say�s�");
		row = scan.nextInt();
		System.out.print("s�t�n say�s�");
		colmn = scan.nextInt();

		MayinTarlasi mayin = new MayinTarlasi(row, colmn);
		mayin.run();

	}

}
