package com.utec.registration.data;
import java.util.List;

import com.utec.registration.model.*;

public class Data {
	
	private static List<Persona> personasDb;
	
	public static List<Persona> getData() {
		return Data.personasDb;
	}
	
	public static void AddPersona(Persona p) {
		Data.personasDb.add(p);
	}
	
}
