package br.com.tibiatimer.model.dao;

import java.util.ArrayList;

import br.com.tibiatimer.model.Ring;

public class RingDAO {
	
	
	public void insert(Ring ring) {
		
		Banco.ring.add(ring);
		
	}
	
	public ArrayList<Ring> selectAll(){
		
		return Banco.ring;
	}

}
