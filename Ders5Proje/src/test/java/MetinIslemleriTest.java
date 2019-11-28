
import org.junit.*;
import org.junit.jupiter.api.Test;


class MetinIslemleriTest {
	@Test
	void testBuyukHarf() {
		String sonuc = MetinIslemleri.buyukHarf("okul");
		Assert.assertEquals("OKUL", sonuc);
	}

}
