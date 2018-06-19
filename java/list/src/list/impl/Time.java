package list.impl;

public class Time {

	private long inicio;
	
	private long fim;

	private long duration;
	
	public Time (long inicio, long fim) {
		this.inicio = inicio;
		this.fim = fim;
		this.duration = fim - inicio;
	}
	
	public long getInicio() {
		return inicio;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public long getFim() {
		return fim;
	}

	public void setFim(long fim) {
		this.fim = fim;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String toString () {
		
		return getInicio() + ", " + getFim() + ", " + getDuration();
	}
}
