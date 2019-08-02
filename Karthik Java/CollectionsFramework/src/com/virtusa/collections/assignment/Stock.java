package com.virtusa.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class SortByCode implements Comparator<Stock> {

	public int compare(Stock s1, Stock s2) {

		
		return (s1.getCode().compareTo(s2.getCode())); 		
	}		
}

public class Stock {
	private String name;
	private String code;
	private double price;
	public Stock(String name, String code, double price) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", code=" + code + ", price=" + price + "]";
	}
	public static void main(String args[]){
		
		ArrayList<Stock> stock = new ArrayList<Stock>( );
		stock.add(new Stock("Tata consultancy services limited","TCS",3854.05));
		stock.add(new Stock("Infosys Private Limited","Infy",2854.05));
		stock.add(new Stock("Virtusa Polaris","Virtusa",1854.05));
		stock.add(new Stock("Qualcomm","Qual",5854.05));
		stock.add(new Stock("Open Text","OT",8854.05));
		stock.add(new Stock("Host Analytics","HA",7854.05));
		
		Collections.sort(stock,new SortByCode());
		
		System.out.println(stock);
		
		
		
	}

}
