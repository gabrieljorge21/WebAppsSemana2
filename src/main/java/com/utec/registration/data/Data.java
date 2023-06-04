package com.utec.registration.data;
import java.util.*;

import com.utec.registration.model.*;

public class Data {
	
	private static List<Persona> personasDb = new ArrayList<Persona>();
	
	public static List<Persona> getData() {
		return Data.personasDb;
	}
	
	public static Persona getPersonaFromData() {
		Persona p = personasDb.get(personasDb.size());
		return p;
	}
	
	public static void AddPersona(Persona p) {
		Data.personasDb.add(p);
	}
	
}
