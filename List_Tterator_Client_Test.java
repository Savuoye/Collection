package com.infotech.fisglobal;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class List_Tterator_Client_Test {

	public static void main(String[] args) {
		List<Customer> custList = new ArrayList<>();

		custList.add(new Customer(1, "Leslie", "Bass", "F", 27, "B", "37307", "endslost@everyma1l.org", "Gibson",
				"Dellwood", "Y"));
		custList.add(new Customer(2, "Judy", "Burks", "M", 53, "S", "84759", "rfleming@hotma1l.co.uk", "Suwanee",
				"Trabue", "Y"));
		custList.add(new Customer(3, "Marsha", "Doyle", "F", 48, "B", "80932", "arethe53@ma1lbox.net", "Perry",
				"Moxadarla", "Y"));
		custList.add(new Customer(4, "Alexis", "Battle", "M", 27, "S", "71701", "ofcame@ma1lbox.org", "Morven",
				"Dennis", "Y"));
		custList.add(new Customer(5, "Martha", "Combs", "F", 49, "B", "83947", "camedied@everyma1l.us", "Ocilla",
				"Greenwood", "Y"));
		custList.add(new Customer(6, "Marilyn", "Nguyen", "M", 57, "S", "72274", "discoveredlist82@gma1l.org", "Byron",
				"Wetsell", "Y"));
		custList.add(new Customer(7, "Billy", "Middleton", "F", 26, "B", "30544", "rkirk@yah00.co.uk", "Kite", "Aspen",
				"Y"));
		custList.add(new Customer(8, "Justin", "Watson", "M", 53, "S", "47814", "lbrennan@ma1lbox.us", "Baxley",
				"Sibley", "Y"));
		custList.add(new Customer(9, "Christian", "Marquez", "F", 39, "B", "83616", "isno@yah00.org", "Sandy Springs",
				"Brill", "Y"));
		custList.add(new Customer(10, "Howard", "Duran", "M", 52, "S", "52254", "mroman@somema1l.org", "Colquitt",
				"Cochran", "Y"));
		custList.add(new Customer(11, "William", "Copeland", "F", 18, "B", "78131", "ecollins@ma1lbox.net", "Offerman",
				"Harmony", "Y"));
		custList.add(
				new Customer(12, "Frank", "Tran", "M", 24, "S", "58656", "textopen@yah00.org", "Ambrose", "Yost", "Y"));
		custList.add(new Customer(13, "Shawn", "Ashley", "M", 26, "S", "65031", "pellison@ma1lbox.com", "Ambrose",
				"Jefferson", "Y"));
		custList.add(new Customer(14, "Roger", "Melendez", "M", 55, "S", "31074", "openlist@yah00.org", "Offerman",
				"Mcclain", "Y"));
		custList.add(new Customer(15, "Jacob", "Thornton", "F", 54, "B", "74233", "ggallagher@hotma1l.us", "Howell",
				"Rhonda", "Y"));
		custList.add(new Customer(16, "Chelsea", "Beach", "M", 33, "S", "46507", "toconnor@hotma1l.org", "Remerton",
				"Heckel", "Y"));
		custList.add(new Customer(18, "Tammy", "Harvey", "M", 20, "S", "39864", "arichmond47@hotma1l.net", "Moultrie",
				"Basin", "Y"));

		custList.add(new Customer(25, "Kevin", "Owen", "F", 38, "B", "48304", "cgarrett@everyma1l.us", "Glory",
				"Stormont", "N"));
		custList.add(new Customer(26, "Katrina", "Love", "M", 30, "S", "81137", "pkelly@b1zmail.biz", "Needmore",
				"Hopewell", "Y"));
		custList.add(new Customer(27, "Mary", "Schultz", "F", 34, "B", "81154", "djordan@somema1l.net", "Mcrae",
				"Shady", "Y"));
		custList.add(new Customer(28, "Ronald", "Church", "M", 18, "S", "64953", "sjohnson@everyma1l.co.uk", "Ocilla",
				"Applegate", "Y"));
		custList.add(new Customer(29, "Edward", "Underwood", "F", 42, "B", "83985", "outare29@somema1l.us", "Withers",
				"Brookover", "Y"));
		custList.add(new Customer(30, "Nathan", "Clark", "M", 54, "S", "23053", "diedthey@hotma1l.us", "Pulaski",
				"Myrtle", "Y"));

		if (custList.size() > 2) {
			Customer secondHighestelement = custList.get(1);
			System.out.println(secondHighestelement);
		} else {
			System.out.println("Not enough data to find the second highest element");
		}

		System.out.println("==========Printing the data using first name============");

		List<String> getFirstName = custList.stream().map(customer -> customer.getFirstName())
				.collect(Collectors.toList());
		System.out.println(getFirstName);

		filteringListUsingListIterator(custList);
		replaceElementsInListUsingListIterator(custList);
		addElementsInListUsingListIterator(custList);
		deleteElementsUsingListIterator(custList);
		findBySpecificName(custList, null);

		CustomerDB custDB = new CustomerDB();
		Customer cust1 = new Customer(1, "Leslie", "Bass", "F", 27, "B", "37307", "endslost@everyma1l.org", "Gibson",
				"Dellwood", "Y");
		Customer cust2 = new Customer(2, "Judy", "Burks", "M", 53, "S", "84759", "rfleming@hotma1l.co.uk", "Suwanee",
				"Trabue", "Y");
		Customer cust3 = new Customer(3, "Marsha", "Doyle", "F", 48, "B", "80932", "arethe53@ma1lbox.net", "Perry",
				"Moxadarla", "Y");
		Customer cust4 = new Customer(4, "Alexis", "Battle", "M", 27, "S", "71701", "ofcame@ma1lbox.org", "Morven",
				"Dennis", "Y");
		Customer cust5 = new Customer(5, "Martha", "Combs", "F", 49, "B", "83947", "camedied@everyma1l.us", "Ocilla",
				"Greenwood", "Y");
		Customer cust6 = new Customer(6, "Marilyn", "Nguyen", "M", 57, "S", "72274", "discoveredlist82@gma1l.org",
				"Byron", "Wetsell", "Y");
		Customer cust7 = new Customer(7, "Billy", "Middleton", "F", 26, "B", "30544", "rkirk@yah00.co.uk", "Kite",
				"Aspen", "Y");
		Customer cust8 = new Customer(8, "Justin", "Watson", "M", 53, "S", "47814", "lbrennan@ma1lbox.us", "Baxley",
				"Sibley", "Y");
		Customer cust9 = new Customer(9, "Christian", "Marquez", "F", 39, "B", "83616", "isno@yah00.org",
				"Sandy Springs", "Brill", "Y");
		Customer cust10 = new Customer(10, "Howard", "Duran", "M", 52, "S", "52254", "mroman@somema1l.org", "Colquitt",
				"Cochran", "Y");

		custDB.addCustomer(cust1);
		custDB.addCustomer(cust2);
		custDB.addCustomer(cust3);
		custDB.addCustomer(cust4);
		custDB.addCustomer(cust5);
		custDB.addCustomer(cust6);
		custDB.addCustomer(cust7);
		custDB.addCustomer(cust8);
		custDB.addCustomer(cust9);
		custDB.addCustomer(cust10);

		for (Customer cust : custDB.listAll()) {
			System.out.println(cust);
		}
		custDB.deleteCust(10);

		for (Customer cust : custDB.listAll())
			System.out.println(cust);
	}

	private static void findBySpecificName(List<Customer> custList, String name) {
		List<String> data_filter = custList.stream().map(customer -> customer.getFirstName())
				.collect(Collectors.toList());

		System.out.println(data_filter);

		List<Customer> getAllData = new ArrayList<>();
		for (Customer customer : custList) {
			if (customer.getFirstName().equals("Alexis")) {
				getAllData.add(customer);
				System.out.println(customer);
			}
		}
	}

	private static void filteringListUsingListIterator(List<Customer> custList) {
		ListIterator<Customer> listIterator = custList.listIterator();
		System.out.println("========Filtering data in forward direction=========");
		while (listIterator.hasNext()) {
			Customer customer = listIterator.next();
			System.out.println(customer);
		}
		System.out.println("========Filtering data in Backward direction============");
		while (listIterator.hasPrevious()) {
			Customer customer = (Customer) listIterator.previous();
			System.out.println(customer);
		}

	}

	private static void addElementsInListUsingListIterator(List<Customer> custList) {
		System.out.println("========Adding the elements==========");
		for (ListIterator<Customer> listIterator = custList.listIterator(); listIterator.hasNext();) {
			Customer customer = listIterator.next();
			if (!customer.getFirstName().equalsIgnoreCase("Vernon") && !customer.getLastName().equalsIgnoreCase("Quinn")
					&& !customer.getGender().equalsIgnoreCase("F") && !customer.getState().equalsIgnoreCase("Rustle")) {
				listIterator.add(customer);
				break;
			}
			for (Customer cust : custList) {
				System.out.println(cust);
			}
		}
	}

	private static void replaceElementsInListUsingListIterator(List<Customer> custList) {
		System.out.println("============Replacing the element=========");
		for (ListIterator<Customer> listIterator = custList.listIterator(); listIterator.hasNext();) {
			Customer customer = listIterator.next();
			if (customer.getFirstName().equalsIgnoreCase("Billy")
					&& customer.getLastName().equalsIgnoreCase("Middleton")
					&& customer.getGender().equalsIgnoreCase("F")
					&& customer.getContactNo().equalsIgnoreCase("23053")) {

				listIterator.set(customer);
			}
		}
		for (Customer customer : custList) {
			System.out.println(customer);
		}
	}

	private static void deleteElementsUsingListIterator(List<Customer> custList) {
		System.out.println("============Deleting the element=========");
		for (ListIterator<Customer> listIterator = custList.listIterator(); listIterator.hasNext();) {
			Customer customer = listIterator.next();
			if (customer.getFirstName().equalsIgnoreCase("Justin")) {
				customer.setFirstName("Joya");
				listIterator.set(customer);
			}
		}
		for (Customer cust : custList) {
			System.out.println(cust);
		}
	}
}
