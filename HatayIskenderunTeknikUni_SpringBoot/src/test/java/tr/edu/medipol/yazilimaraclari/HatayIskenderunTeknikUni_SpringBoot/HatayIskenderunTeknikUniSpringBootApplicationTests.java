package tr.edu.medipol.yazilimaraclari.HatayIskenderunTeknikUni_SpringBoot;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HatayIskenderunTeknikUniSpringBootApplicationTests {

	@Test
	public final void testListele() {
		HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir().size();
		assertEquals(HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir().size(),10);
	}
	@Test
	public final void testEkle() {
		int ilkDurum = HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir().size();
		HatayIskenderunTeknikUni_Ders denemeDers= new HatayIskenderunTeknikUni_Ders("Deneme","Deneme 1 Ogretmen");
		HatayIskenderunTeknikUni_DersVeriServisi.dersEkle(denemeDers);
		int sonDurum = HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir().size();
		int sonuc = (sonDurum - ilkDurum);
		assertEquals(1,sonuc);
	}
	@Test
	public final void testSil() {
		int ilkDurum = HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir().size();
		HatayIskenderunTeknikUni_Ders VeriTabaniUygulamalari= new HatayIskenderunTeknikUni_Ders("Veri Tabanı Uygulamaları","Tuncay TANİN");
		HatayIskenderunTeknikUni_DersVeriServisi.dersSil(VeriTabaniUygulamalari);
		int sonDurum =  HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir().size();
		int sonuc = (ilkDurum - sonDurum);
		assertEquals(1,(sonuc));
	}
}
