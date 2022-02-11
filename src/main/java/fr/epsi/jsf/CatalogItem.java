package fr.epsi.jsf;

import java.time.LocalDate;

public class CatalogItem {
	
	private Long itemId;
	private String name;
	private String manufacturer;
	private String description;
	private LocalDate availableDdate;
	
	public CatalogItem() {
	}
	
	public CatalogItem(Long itemId, String name, String manufacturer, String description, LocalDate availableDdate) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.availableDdate = availableDdate;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getAvailableDdate() {
		return availableDdate;
	}

	public void setAvailableDdate(LocalDate availableDdate) {
		this.availableDdate = availableDdate;
	}

	@Override
	public String toString() {
		return "CatalogItem [itemId=" + itemId + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", availableDdate=" + availableDdate + "]";
	}
	
	

}
