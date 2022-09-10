package com.channel.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Chaneel {
	@Column(name = "channelname", length = 20)
	private String name;

	@Id
	@GeneratedValue(generator = "channel_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "channel_gen", sequenceName = "channel_sequence", initialValue = 100, allocationSize = 1)
	private Integer chaneelId;

	private String language;
	@Column(length = 20)
	private String type;
	private double price;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "chaneel")
//	@JoinColumn(name = "chaneel_id")
	Set<Show> show;

	@OneToOne
	Details details;

	public Chaneel() {
		super();
	}

	public Chaneel(String name, String language, String type, double price) {
		super();
		this.name = name;
		this.language = language;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getChannelId() {
		return chaneelId;
	}

	public void setChannelId(Integer channelId) {
		this.chaneelId = channelId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Show> getShow() {
		return show;
	}

	public void setShow(Set<Show> show) {
		this.show = show;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Chaneel [name=" + name + ", language=" + language + ", type=" + type + ", price=" + price + "]";
	}

}
