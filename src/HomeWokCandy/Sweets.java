package HomeWokCandy;

public abstract class Sweets {
	protected double Price;
	protected double Shugar;
	protected double Kkal;
	protected double Veight;
	protected String Name;
	
public Sweets(double Price, double Shugar, double Kkal, double Veight, String Name) {
	this.Price=Price;
	this.Shugar=Shugar;
	this.Kkal=Kkal;
	this.Veight=Veight;
	this.Name=Name;
}
public void setVeight(double Veight) {
	this.Veight=Veight;
}
public double getVeight() {
	return Veight;
 }
public void setShugar(double Shugar) {
	this.Shugar=Shugar;
}
public double getShugar() {
	return Shugar;
	}
}
