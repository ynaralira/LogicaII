package model;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;

	public Horario() {
	}

	public Horario(int hora) {
		this.hora = hora;
	}

	public Horario(int h, int m) {
		this.hora = h;
		this.minuto = m;
	}

	public Horario(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	
	public int getSegundo() {
		return this.segundo;
	}
	
	public void setHora(int h) {
		this.hora = h;
	}
	
	public void setMinuto(int m) {
		this.minuto = m;
	}
	
	public void setSegundo(int s) {
		this.segundo = s;
	}
	public String toString() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
}
