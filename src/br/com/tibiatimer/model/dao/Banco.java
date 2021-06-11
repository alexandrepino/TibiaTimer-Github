package br.com.tibiatimer.model.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.com.tibiatimer.model.Amulet;
import br.com.tibiatimer.model.Magic;
import br.com.tibiatimer.model.Ring;

public class Banco {
	
	public static ArrayList <Amulet> amulet;
	public static ArrayList <Ring> ring;
	public static ArrayList <Magic> magic;
	
	
	public static void inicia() throws ParseException {
		   
		SimpleDateFormat data = new SimpleDateFormat("HH:mm:ss");
		
		amulet = new ArrayList<Amulet>();
		ring = new ArrayList<Ring>();
		magic = new ArrayList<Magic>();
	
	
	Magic magia1 = new Magic ("Magic Shield", "Todo dano sofrido durante o efeito desta magia será reduzido de sua Mana ao invés de seu HP até ser quebrado "
			+ "com uma certa quantidade de dano recebido.", data.parse("00:03:20"));
	
	
	
	
		Ring ring1 = new Ring ("Energy Ring", "Este item pode ser comercializado pelo Mercado. Provém Magic Shield por 10 minutos. Dessa forma, todo dano recebido durante o efeito deste anel será reduzido de sua mana ao "
				+ "invés de seu HP. Faz parte do Blue Set. Desde o update 12.55, apenas knights e paladins podem utilizá-lo.", data.parse("00:10:00"));
	
	
	
	
	Amulet amulet1 = new Amulet("Bronze Amulet", "Adiciona magic level +3", data.parse("00:03:00"));
	
	magic.add(magia1);
	ring.add(ring1);
	amulet.add(amulet1);
	
	}

	
	
	
	
	
}
