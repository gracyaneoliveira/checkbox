package com.projeto.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import com.projeto.model.City;

@ManagedBean
@ViewScoped
public class CheckboxViewBean {

	private List<City> selectedCities;
	private List<City> cities;
	private String name;

	@PostConstruct
	public void init() {
		cities = new ArrayList<City>();
		selectedCities = new ArrayList<City>();
		
		cities.add(new City("Miami", 1L));
		cities.add(new City("London", 2L));
		cities.add(new City("Paris", 3L));
		cities.add(new City("Istanbul", 4L));
		cities.add(new City("Berlin", 5L));
		cities.add(new City("Barcelona", 6L));
		cities.add(new City("Rome rome", 7L));
//		cities.add(new City("Brasilia", 8L));
//		cities.add(new City("Amsterdam", 9L));
		
		selectedCities.add(cities.get(0));
		selectedCities.add(cities.get(1));
		selectedCities.add(cities.get(2));
		selectedCities.add(cities.get(3));
		selectedCities.add(cities.get(4));
		selectedCities.add(cities.get(5));
		selectedCities.add(cities.get(6));
//		selectedCities.add(cities.get(7));
//		selectedCities.add(cities.get(8));
	}
	
	public void teste(){
		System.out.println("meu teste");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void save() {
		System.out.println("# Salvo : " + name);

		if (selectedCities != null && selectedCities.size() > 0) {
			System.out.println("# Cities : " + selectedCities.size() + " - Nome: " + selectedCities.get(0).getNome());
		}

		newEntity();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO: ", "Salvo com sucesso!"));

		RequestContext.getCurrentInstance().update("frm");
	}

	public void newEntity() {
		name = "";
		selectedCities.clear();
	}

	public List<City> getSelectedCities() {
		return selectedCities;
	}

	public void setSelectedCities(List<City> selectedCities) {
		this.selectedCities = selectedCities;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
