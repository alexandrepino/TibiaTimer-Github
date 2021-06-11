/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tibiatimer.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public abstract class Item {
    
	
	
    private String nome;
    private String descrição;
    private Date duracao;

    
    
    public Item(String nome, String descrição, Date duracao) {
        this.nome = nome;
        this.descrição = descrição;
       
			this.duracao = duracao;
		
    }

    public Item() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duração) {
        this.duracao = duração;
    }
    
    
    
}
