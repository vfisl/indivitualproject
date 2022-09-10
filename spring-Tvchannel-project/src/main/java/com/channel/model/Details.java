package com.channel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Details {
	@Column(name = "agentname")
	private String ownername;
	@Column(length = 20)
	private String type;
	private double amount;
	@Id
	@GeneratedValue(generator = "Details_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "Details_gen", sequenceName = "Details_sequence", initialValue = 1, allocationSize = 1)
	private Integer detailsId;

	public Details() {
		super();
	}

	public Details(String ownername, String type, double amount) {
		super();
		this.ownername = ownername;
		this.type = type;
		this.amount = amount;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Integer getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(Integer detailsId) {
		this.detailsId = detailsId;
	}

	@Override
	public String toString() {
		return "Details [ownername=" + ownername + ", type=" + type + ", amount=" + amount + "]";
	}

}
