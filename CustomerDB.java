package com.infotech.fisglobal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CustomerDB {

	List<Customer> custDB = new ArrayList<>();

	public boolean addCustomer(Customer cust) {
		return custDB.add(cust);
	}

	public boolean deleteCust(int custNo) {
		boolean isRemoved = false;
		for (ListIterator<Customer> listItertator = custDB.listIterator(); listItertator.hasNext();) {
			Customer cust = listItertator.next();
			if (cust.getCustNo() == custNo) {
				isRemoved = true;
				listItertator.remove();
			}
		}

		return isRemoved;
	}

	public Customer[] listAll() {
		Customer custArray[] = new Customer[custDB.size()];
		for (int i = 0; i < custDB.size(); i++) {
			custArray[i] = custDB.get(i);
		}
		return custArray;
	}

	public String showPaySlip(int custNo) {
		String paySlip = "Invalid Customer ID";
		for (Customer cust : custDB) {
			if (cust.getCustNo() == custNo) {
				paySlip = "Pay slip for employee id " + custNo + " is " + cust.getEmailId();
			}
		}
		return paySlip;
	}

}
