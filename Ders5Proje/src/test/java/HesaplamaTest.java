
import org.junit.*;
import org.junit.jupiter.api.Test;

public class HesaplamaTest {

	@Test
	public void testToplaHataliSayilar() {	
		String sayi1 = "100x";
		String sayi2 = "42";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("undefined", sonuc);
	}
	
	@Test
	public void testToplaTamSayilar() {	
		String sayi1 = "100";
		String sayi2 = "42";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142", sonuc);
	}
	
	@Test
	public void testToplaOndalikSayilar() {	
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142.80", sonuc);
	}
	
	@Test
	public void testToplaBuyukSayilar() {	
		String sayi1 = "9000000000000000";
		String sayi2 = "1000000000000042";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("10000000000000042", sonuc);
	}
	
	@Test
	public void testNullSayi1Input() {
		String sonuc = Hesaplama.topla(null, "3");
		Assert.assertEquals("undefined", sonuc);
	}
	
	@Test
	public void testNullSayi2Input() {
		String sonuc = Hesaplama.topla("5645646", null);
		Assert.assertEquals("undefined", sonuc);
	}
	
	@Test
	public void testNullSayi1Empty() {
		String sonuc = Hesaplama.topla("      ", "3");
		Assert.assertEquals("undefined", sonuc);
	}
	
	@Test
	public void testNullSayi2Empty() {
		String sonuc = Hesaplama.topla("5555", " ");
		Assert.assertEquals("undefined", sonuc);
	}

}
