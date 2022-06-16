import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row, colmn;
		System.out.println("mayýn tarlasýna hoþ geldiniz");
		System.out.println("lütfen  oynamal istediðiniz boyutlarýný giriniz");
		System.out.print("satýr sayýsý");
		row = scan.nextInt();
		System.out.print("sütün sayýsý");
		colmn = scan.nextInt();

		MayinTarlasi mayin = new MayinTarlasi(row, colmn);
		mayin.run();

	}

}
