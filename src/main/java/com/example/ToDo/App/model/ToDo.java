package com.example.ToDo.App.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="todo")
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Nonnull
	private Long id;

	@Column
	@Nonnull
	private String title;

	@Column
	@Nonnull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public ToDo() {
	}

	public ToDo(@Nonnull Long id, @Nonnull String title, @Nonnull Date date, @Nonnull String status) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
	}

	@Column
	@Nonnull
	private String status;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
