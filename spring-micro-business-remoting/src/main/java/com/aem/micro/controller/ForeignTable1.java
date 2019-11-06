package com.aem.micro.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="foreign_table_one")
public class ForeignTable1 {
	@Id
	private Long id;

	@Column(name = "name")
	private String name;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "exchange_id")
	private ExchangeValue exchangeValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExchangeValue getExchangeValue() {
		return exchangeValue;
	}

	public void setExchangeValue(ExchangeValue exchangeValue) {
		this.exchangeValue = exchangeValue;
	}

}
