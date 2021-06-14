package br.com.tibiatimer.model;

import java.util.Date;

public class Ring extends Item {

	public Ring() {
		super();

	}

	public Ring(EnumItem tipo, String nome, String descrição, Date duracao) {
		super(EnumItem.RING, nome, descrição, duracao);

	}

}
	