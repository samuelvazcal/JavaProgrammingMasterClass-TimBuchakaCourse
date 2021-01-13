package com.samuelvazquez;

import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Client client1 = new Client("Guillermo del Toro", "0001",2000);
		Client client2 = new Client("Rodolfo Neri Vela","0002",1800);
		Client client3 = new Client("Paola Espinoza","0003",1900);
		Client client4 = new Client("Emilia Calvario","0004", 2100);
		Client client5 = new Client("Guillermo del Toro", "0001",2000);

		//Set is an unordered collection of objects in which duplicate values cannot be stored.
		//But we have to overwrite the equals and hashCode methods first. If not, we will collect
		//duplicate values even when we shouldn't
		//Have a look in line 13
		Set<Client> clientsSet = new HashSet<Client>();
		clientsSet.add(client1);
		clientsSet.add(client2);
		clientsSet.add(client3);
		clientsSet.add(client4);
		//Once we ad the client5 to the ClientsSet without overriding equals method, we can save a duplicate in our collection
		clientsSet.add(client5);

		for(Client client: clientsSet) {
			System.out.println("Name: " + client.getName() + "| id: " + client.getId() + "| credit: " + client.getCredit());
		}
	}
}
