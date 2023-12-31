package frontend.soap;
import objects.*;


import javax.jws.WebService;

import java.util.ArrayList;


@WebService(name = "SoapServices", targetNamespace = "http://soap.frontend/")
public interface SoapServices {
	
		//LISTAR SOMBRINHAS
		ArrayList<Service> listarSombrinhas(Booking booking);
		//RESERVAR SOMBRINHAS
		String reservarSombrinha(Booking booking);
		//CANCELAR SOMBRINHA
		String cancelarSombrinha(Booking booking);
		//LISTAR RESERVAS
		ArrayList<Booking> listarReservas(int userId);
		//REGISTAR_UTILIZADOR
		String registarUtilizador(User user);
		//LOGIN
		String login(User user);
}