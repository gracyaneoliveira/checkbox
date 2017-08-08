package com.projeto.bean;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CalendarViewBean {
	
	private Date inicioHora;
	private Date fimHora;
	private Date inicioDate;
	private Date fimDate;
	
	private Date result;
	
	public void save () throws ParseException{
		System.out.println("Dados salvos!!!");
		System.out.println("# Inicio data : " + inicioDate.toString() );
		System.out.println("# Fim data : " + fimDate.toString() );
		System.out.println("# HORA # ");
		System.out.println("# Inicio Hora : " + inicioHora.toString() );
		System.out.println("# Fim Hora : " + fimHora.toString());
		
		result = new Date(inicioDate.getTime() + inicioHora.getTime());
		System.out.println("# Hora final : " + result.toString());
		
		Timestamp tm = new Timestamp(result.getTime());
		System.out.println("# Timestamp : " + tm.toString());
		
		System.out.println("# Volta : ");

		
		System.out.println("# SDF data : " + new SimpleDateFormat("dd/MM/yyyy").format(tm.getTime()));
		System.out.println("# SDF hora : " + new SimpleDateFormat("HH:mm").format(tm.getTime()));
		
		String data = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(tm.getTime());
		String hora = new SimpleDateFormat("HH:mm").format(tm.getTime());
		
		Date ds = new SimpleDateFormat("dd/MM/yyy HH:mm").parse(data);
		Date d = new SimpleDateFormat("HH:mm").parse(hora);
		System.out.println("# teste data : " + ds.toString());
		System.out.println("# teste hora : " + d.toString());
	}

	public Date getInicioHora() {
		return inicioHora;
	}

	public void setInicioHora(Date inicioHora) {
		this.inicioHora = inicioHora;
	}

	public Date getFimHora() {
		return fimHora;
	}

	public void setFimHora(Date fimHora) {
		this.fimHora = fimHora;
	}

	public Date getInicioDate() {
		return inicioDate;
	}

	public void setInicioDate(Date inicioDate) {
		this.inicioDate = inicioDate;
	}

	public Date getFimDate() {
		return fimDate;
	}

	public void setFimDate(Date fimDate) {
		this.fimDate = fimDate;
	}

	public Date getResult() {
		return result;
	}

	public void setResult(Date result) {
		this.result = result;
	}
}
