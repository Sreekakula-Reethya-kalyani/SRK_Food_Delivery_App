package com.srk.driver;
import com.srk.dao.*;
import com.srk.model.OrderTable;

public class OrderTableDriver {

	public static void main(String[] args) 
	{
		OrderTableDao otd=new OrderTableDaoImplementation();
		OrderTable o=new OrderTable(1,3,999.99,"completed","googlpay");
		int i=otd.insertOrder(o);
		System.out.println(i);
		

	}

}
