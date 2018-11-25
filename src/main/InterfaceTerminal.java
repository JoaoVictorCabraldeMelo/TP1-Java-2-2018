package main;

import dao.ClienteDAO;

public class InterfaceTerminal {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Eduardo", "Assis");
		Cliente cliente2 = new Cliente("Alexandre", "Souza");
		
		ClienteDAO.inCliente(cliente1);
		ClienteDAO.inCliente(cliente2);
	}
}