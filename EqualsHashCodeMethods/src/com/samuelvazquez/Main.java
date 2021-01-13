package com.samuelvazquez;

import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Client client1 = new Client("Guillermo del Toro", "0001",2000);
		Client client2 = new Client("Rodolfo Neri Vela","0002",1800);
		Client client3 = new Client("Paola Espinoza","0003",1900);
		Client client4 = new Client("Emilia Calvario","0004", 2100);

		Set<Client> clientsSet = new HashSet<Client>();
		clientsSet.add(client1);
		clientsSet.add(client2);
		clientsSet.add(client3);
		clientsSet.add(client4);

		for(Client client: clientsSet) {
			System.out.println("Name: " + client.getName() + "| id: " + client.getId() + "| credit: " + client.getCredit());
		}
	}
}
