package com.channel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Show {
	@Column(length = 20)
	private String name;

	private String time;

	@Id
	@GeneratedValue(generator = "show_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "show_gen", sequenceName = "show_sequence", initialValue = 100, allocationSize = 1)
	private Integer showId;

	@ManyToOne
	@JoinColumn(name = "chaneel_id")
	Chaneel chaneel;

	public Show() {
		super();
	}

	public Show(String name, String time) {
		super();
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	@Override
	public String toString() {
		return "Show [name=" + name + ", time=" + time + ", showId=" + showId + "]";
	}

}
