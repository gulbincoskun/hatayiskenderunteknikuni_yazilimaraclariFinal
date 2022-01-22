package tr.edu.medipol.yazilimaraclari.HatayIskenderunTeknikUni_SpringBoot;

public class HatayIskenderunTeknikUni_Ders {
	private String dersAd;
	private String dersOgretmen;

	public HatayIskenderunTeknikUni_Ders(String dersAd, String dersOgretmen) {
		super();
		this.dersAd = dersAd;
		this.dersOgretmen = dersOgretmen;
	}

	public String getDersAd() {
		return dersAd;
	}

	public String getDersOgretmen() {
		return dersOgretmen;
	}

}
