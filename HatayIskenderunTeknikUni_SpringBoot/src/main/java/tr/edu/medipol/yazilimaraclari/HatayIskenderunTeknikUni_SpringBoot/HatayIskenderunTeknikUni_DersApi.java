package tr.edu.medipol.yazilimaraclari.HatayIskenderunTeknikUni_SpringBoot;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ders")
public class HatayIskenderunTeknikUni_DersApi {
	
	@GetMapping("/listele")
	public List<HatayIskenderunTeknikUni_Ders> listele(){
		return HatayIskenderunTeknikUni_DersVeriServisi.dersleriGetir();
	}
	
	@PostMapping("/ekle")
	public HatayIskenderunTeknikUni_Ders ekle(@RequestBody HatayIskenderunTeknikUni_Ders ders){
		HatayIskenderunTeknikUni_DersVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@DeleteMapping("/sil")
	public HatayIskenderunTeknikUni_Ders sil(@RequestBody HatayIskenderunTeknikUni_Ders ders) {		
		HatayIskenderunTeknikUni_DersVeriServisi.dersSil(ders);
		return ders;
		
	}	
}
