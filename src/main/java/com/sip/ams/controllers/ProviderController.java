package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sip.ams.entities.*;
import static com.sip.ams.AmsApplication.providers;

import java.util.List;
@Controller	
@RequestMapping("/provider")
public class ProviderController {
	
	@GetMapping("/list")
	//@ResponseBody
	public String listProviders(Model model) 
	{
		System.out.println(providers);
		//return "ListProviders"
		model.addAttribute("providers",providers);
		return "providers/listProviders";
	}
	@GetMapping("/add") //get le formulaire d'ajout
	public String getAddFormProvider(Model model) 
	{	model.addAttribute("provider",new Provider());
		return "providers/addProvider";
	}
	@PostMapping("/add") //save provider in list
	//@ResponseBody
	public String saveProvider(Provider provider) 
	{	
		providers.add(provider);
		return "redirect:list";

	}

	@GetMapping("/details/{id}")
	//@ResponseBody
	public String detailsProvider(Model model,@PathVariable("id")int id) {
		for(Provider provider : providers) {
			if(provider.getId()==id) {
				model.addAttribute("provider",provider);
				break; 
			}
		}
		return "providers/detailsProvider";
	}
	@GetMapping("/delete/{id}")
	//@ResponseBody
	public String deleteProvider(Model model,@PathVariable("id")int id) {
		
		
		for(Provider provider : providers) {
			if(provider.getId()==id) {
				providers.remove(provider);
				break; 
			}
		}
		return "redirect:../list";
	}
	@GetMapping("/update/{id}")
	//@ResponseBody
	public String updateProvider(Model model,@PathVariable("id")int id) {
		
		
		for(Provider provider : providers) {
			if(provider.getId()==id) {
				model.addAttribute("provider",provider);
				break; 
			}
		}
		return "providers/editProvider";
	}
	
	@PostMapping("/update")
	public String updateAndSaveProvider(Provider provider) {
		
		for(Provider pr : providers) {
			if(pr.getId()==provider.getId()) {
				//pr=provider;
				providers.set(providers.indexOf(pr),provider);
				break; 
			}
		}
		return "redirect:list";
	}
}
