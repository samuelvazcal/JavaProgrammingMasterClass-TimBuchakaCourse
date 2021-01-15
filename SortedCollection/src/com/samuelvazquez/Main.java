package com.samuelvazquez;

import java.util.Arrays;


public class Main {
	private static StockList stockList = new StockList();
	public static void main(String[] args) {
		//StockList stockList = new StockList();
		StockItem temp = new StockItem("cake0",0.86,100);
		stockList.addStock(temp);

		temp = new StockItem("cake1",1.10,9);
		stockList.addStock(temp);
		temp = new StockItem("cake2",1.21,8);
		stockList.addStock(temp);
		temp = new StockItem("cake3",1.32,7);
		stockList.addStock(temp);
		temp = new StockItem("cake4",1.44,6);
		stockList.addStock(temp);
		temp = new StockItem("cake5",1.54,5);
		stockList.addStock(temp);
		temp = new StockItem("cake6",1.64,4);
		stockList.addStock(temp);
		temp = new StockItem("cake7",1.72,3);
		stockList.addStock(temp);
		temp = new StockItem("cake8",1.81,2);
		stockList.addStock(temp);
		temp = new StockItem("cake9",1.99,1);
		stockList.addStock(temp);

		System.out.println(stockList);

	}

}
