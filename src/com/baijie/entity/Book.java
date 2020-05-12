package com.baijie.entity;

import java.math.BigDecimal;

public class Book {
private Integer id;
private String name;
private String author;
private BigDecimal price;
private Integer sales;
private Integer stock;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}
public Integer getSales() {
	return sales;
}
public void setSales(Integer sales) {
	this.sales = sales;
}
public Integer getStock() {
	return stock;
}
public void setStock(Integer stock) {
	this.stock = stock;
}
public Book(Integer id, String name, String author, BigDecimal price, Integer sales, Integer stock) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
	this.sales = sales;
	this.stock = stock;
}
public Book(String name, String author, BigDecimal price, Integer sales, Integer stock) {
	super();
	this.name = name;
	this.author = author;
	this.price = price;
	this.sales = sales;
	this.stock = stock;
}
public Book() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", sales=" + sales
			+ ", stock=" + stock + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((price == null) ? 0 : price.hashCode());
	result = prime * result + ((sales == null) ? 0 : sales.hashCode());
	result = prime * result + ((stock == null) ? 0 : stock.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (price == null) {
		if (other.price != null)
			return false;
	} else if (!price.equals(other.price))
		return false;
	if (sales == null) {
		if (other.sales != null)
			return false;
	} else if (!sales.equals(other.sales))
		return false;
	if (stock == null) {
		if (other.stock != null)
			return false;
	} else if (!stock.equals(other.stock))
		return false;
	return true;
}

}

