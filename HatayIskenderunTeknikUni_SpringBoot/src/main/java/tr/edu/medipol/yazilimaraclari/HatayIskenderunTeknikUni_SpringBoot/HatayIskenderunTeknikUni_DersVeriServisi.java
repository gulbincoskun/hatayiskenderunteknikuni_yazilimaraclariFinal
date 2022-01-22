package tr.edu.medipol.yazilimaraclari.HatayIskenderunTeknikUni_SpringBoot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HatayIskenderunTeknikUni_DersVeriServisi {
	private static final List<HatayIskenderunTeknikUni_Ders> DERSLER=new ArrayList<>();
	static {
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Yazılım Geliştirme Ortam ve Araçları","Özkan SARI"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Yazılım Testi ve Otomasyonu"," Handan YARICI"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Uygulamaların Süreç Analizi","Gülistan GÜZVELİ"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("İos Programlama","Seyfeddin BAŞSARAÇ"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Python Programlama","Beyza KOYULMUŞ"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Bilişim Teknolojileri","Mustafa ÇORUH"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("İleri Java Uygulamaları","Serkan İŞLEYEN"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Siber Güvenlik"," Ömer Olcay KARATAŞ"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Veri Tabanı Uygulamaları","Tuncay TANİN"));
		DERSLER.add(new HatayIskenderunTeknikUni_Ders("Mobil Yazılımlar","Muhammed ÇAĞATAY"));	
	}
	public static List<HatayIskenderunTeknikUni_Ders> dersleriGetir(){
		return DERSLER;
	}
	public static List<HatayIskenderunTeknikUni_Ders> dersEkle(HatayIskenderunTeknikUni_Ders ders) {
		DERSLER.add(ders);
		return DERSLER;
	}
	public static void dersSil(HatayIskenderunTeknikUni_Ders ders) {
		for (Iterator<HatayIskenderunTeknikUni_Ders> iterator = DERSLER.listIterator(); iterator.hasNext();){
			HatayIskenderunTeknikUni_Ders d =iterator.next();
		    if (d.getDersAd().equals(ders.getDersAd())) {
		       iterator.remove();
		       return;
		    }
		}	
	}
}
