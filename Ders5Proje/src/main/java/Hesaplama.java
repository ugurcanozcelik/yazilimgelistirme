import java.math.*;
import java.util.*;

public class Hesaplama {

	private static final String ERROR_UNDEFINED_MSG = "undefined";

	public static String topla(String sayi1, String sayi2) {
		
		if(sayi1 == null || sayi2 == null 
				|| sayi1.trim().length() == 0 
				|| sayi2.trim().length() == 0 ) {
			return ERROR_UNDEFINED_MSG;
		}
		
		
		try {
			BigDecimal bigDecimal1 = new BigDecimal(sayi1);
			BigDecimal bigDecimal2 = new BigDecimal(sayi2);
			return bigDecimal1
					.add(bigDecimal2)
					.toPlainString();
		} catch(Exception e) {
			return ERROR_UNDEFINED_MSG;
		}
	}

	public static void main(String[] args) {
		Scanner konsolOku = new Scanner(System.in);
		
		System.out.print("Sayi 1 giriniz: ");
		String sayi1 = konsolOku.nextLine();
		System.out.print("Sayi 2 giriniz: ");
		String sayi2 = konsolOku.nextLine();
		
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		
		System.out.printf("%s + %s = %s", sayi1, sayi2, sonuc);
	}

}
