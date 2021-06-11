/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tibiatimer.model;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Amulet extends Item {

	public Amulet() {
		super();
		
	}

	public Amulet(EnumItem tipo, String nome, String descrição, Date duracao) {
		super(tipo.AMULET, nome, descrição, duracao);
		
	}

   
    
    
    
}
