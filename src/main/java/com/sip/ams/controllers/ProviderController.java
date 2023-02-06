package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
@RequestMapping("/provider")
public class ProviderController {

	@RequestMapping("/info")
	//@ResponseBody()
	public String info() {
		
		String formation = "Spring";
		int nbHeures =20 ;
		System.out.println("Hello BootCamp");
		//return "BootCamp";
		//return "Détails formation : "+formation+ "    " +nbHeures;
		return "info.html";
	}
	@RequestMapping("/data")
	public String data(Model model) {
		String trainer = "Mohamed Amine mezghich";
		String adresse = "Tunis";
		model.addAttribute("trainer", trainer);
		model.addAttribute("adresse", adresse);
		List <String> names = new ArrayList<>();
		names.add("Aymen");
		names.add("Haitham");
		names.add("Hatem");
		names.add("Dhia");
		model.addAttribute("names", names);
		List<Stagiaire> Stagiaires = new ArrayList<>();
		Stagiaire s1 = new Stagiaire("Aymen",22,"Sfax",20000000) ;
		Stagiaire s2 = new Stagiaire("Haitham",24,"Tunis",30000000) ;
		Stagiaire s3 = new Stagiaire("Hatem",22,"Jandouba",40000000) ;
		Stagiaire s4 = new Stagiaire("Dhia",24,"Ghazela",50000000) ;
		Stagiaires.add(s1);
		Stagiaires.add(s2);
		Stagiaires.add(s3);
		Stagiaires.add(s4);
		System.out.println(Stagiaires);
		model.addAttribute("Stagiaires", Stagiaires);
		return "data.html";
	}
}
