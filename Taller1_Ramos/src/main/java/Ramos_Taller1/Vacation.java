package Ramos_Taller1;

public class Vacation {
	String destination;
	int n_travel;
	int days;
	public Vacation() {		
		
	}
	public String getdestination() {
		return destination;
	}
	public void setDestination(String destination) {
		destination = destination;
	}
	public int getN_travel() {
		return n_travel;
	}
	public void setN_travel(int n_travel) {
		this.n_travel = n_travel;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	public int costo_dest(int dest) {
		if(dest==1) {
			return 1600;
		}
		else if(dest==2) {
			return 1500;
		}
		else {
			return 1000;
		}
	}
	
	public double costo_travelers(int travels, int dest) {
		if(travels>4 && travels<10) {
			double descuento= costo_dest(dest)-(costo_dest(dest)*0.10);
			return descuento ;
		}
		else if(travels>=10) {
			double descuento= costo_dest(dest)-(costo_dest(dest)*0.20);
			return descuento ;
		}
		
		else{
			return costo_dest(dest);
		}
	}
	
	public double costo_days(double costo_travelers, int days, int travels) {
		if(days<7) {
			double cost_day= costo_travelers +200;
			return cost_day ;
		}
		else if(days>=30 || travels>=2) {
			double cost_day= costo_travelers -200;
			return cost_day;
		}
		else {
			return costo_travelers;
		}
	}
	
	
	
	

}
