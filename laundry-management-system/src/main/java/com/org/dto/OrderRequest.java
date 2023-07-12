package com.org.dto;

public class OrderRequest {
	private String email;
	private String pick_date;
	private String topware;
	private String bottomware;
	private String woolencloth;
	private String others;
	private String selectServise;
	private String contact;
	private String description;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPick_date() {
		return pick_date;
	}

	public void setPick_date(String pick_date) {
		this.pick_date = pick_date;
	}

	public String getTopware() {
		return topware;
	}

	public void setTopware(String topware) {
		this.topware = topware;
	}

	public String getBottomware() {
		return bottomware;
	}

	public void setBottomware(String bottomware) {
		this.bottomware = bottomware;
	}

	public String getWoolencloth() {
		return woolencloth;
	}

	public void setWoolencloth(String woolencloth) {
		this.woolencloth = woolencloth;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getSelectServise() {
		return selectServise;
	}

	public void setSelectServise(String selectServise) {
		this.selectServise = selectServise;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
