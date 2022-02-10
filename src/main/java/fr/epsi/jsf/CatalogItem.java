package fr.epsi.jsf;

import java.time.LocalDate;

public class CatalogItem {
	
	private Long itemid;
	private String name;
	private String manufacturer;
	private String description;
	private LocalDate availableDdate;
	
	public CatalogItem() {
	}
	
	public CatalogItem(Long itemid, String name, String manufacturer, String description, LocalDate availableDdate) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.availableDdate = availableDdate;
	}
	
	
	
	

}
