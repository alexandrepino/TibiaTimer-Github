package br.com.tibiatimer.model.dao;

import java.util.ArrayList;

import br.com.tibiatimer.model.Amulet;

public class AmuletDAO {
	
	public void insert (Amulet amulet) {
		
		Banco.amulet.add(amulet);
		
		
	}
	
	public ArrayList<Amulet> selectALL(){
		return Banco.amulet;
		
		
		
	}

}
