package ma.mpm.gov.automatiosationtool.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import ma.mpm.gov.automatiosationtool.model.Champ;
import ma.mpm.gov.automatiosationtool.service.Interface.ChampService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("champController")
@Scope("session")
public class ChampController implements Serializable{

	private static final long serialVersionUID = 1L;

	// Services Auto-Injectes
	@Autowired
	ChampService champService;
	
	
	List<Champ> listChamps = new ArrayList<Champ>();
	Integer selectedChamp;
	List<SelectItem> selectItemsChamp = new ArrayList<SelectItem>();
	
	
	public ChampController() {
		super();
	}
	
	@PostConstruct
	public void init(){
		listChamps = champService.listerChamp();
		initSelectItems();
	}
	
	public void initSelectItems() {
		for(int i=0; i < listChamps.size() ; i++){
			selectItemsChamp.add( new SelectItem(listChamps.get(i).getIdChamp(), listChamps.get(i).getValeurSelecteur()));
		}
	}
	
	public String afficher () {
		System.out.println("OK OK");
		return null;
	}
	
//	// Getter & Setter

	public List<Champ> getListChamps() {
		return listChamps;
	}

	public void setListChamps(List<Champ> listChamps) {
		this.listChamps = listChamps;
	}

	public Integer getSelectedChamp() {
		return selectedChamp;
	}

	public void setSelectedChamp(Integer selectedChamp) {
		this.selectedChamp = selectedChamp;
	}

	public List<SelectItem> getSelectItemsChamp() {
		return selectItemsChamp;
	}

	public void setSelectItemsChamp(List<SelectItem> selectItemsChamp) {
		this.selectItemsChamp = selectItemsChamp;
	}
	
	
}
