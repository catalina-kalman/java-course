package com.example.dto.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "booklibrary")
public class Book {
	
	@Id
	private int bookId;
	@Column(length = 50)
	private String title;
	@Column(length = 50)
	private String author;
	@Column(length = 25)
	private String genre;
	private int ratingOutOf10;
	
}
