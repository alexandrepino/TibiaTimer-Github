package br.com.tibiatimer.model.dao;

import java.util.ArrayList;

import br.com.tibiatimer.model.Magic;

public class MagicDAO {
	
	public void insert(Magic magic) {
		
		Banco.magic.add(magic);
		
		
	}
	
	public ArrayList<Magic>selectAll(){
		
		return Banco.magic;
	}

}
