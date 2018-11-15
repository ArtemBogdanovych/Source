package HomeWokCandy;
import java.util.ArrayList;
public class ChocolateSweets extends Sweets {
  
	private double procChocolate;
	
public ChocolateSweets(double Price, double Shugar, double Kkal, double Veight,String Name, double procChocolate) {
		// TODO Auto-generated constructor stub
	super( Price,  Shugar,  Kkal, Veight, Name);
	this.procChocolate=procChocolate;
	}
public void  setPrice(double Price) {
	this.Price= Price;
}
public void setKkal(double Kkal) {
	this.Kkal=Kkal;
}

public void setName(String Name) {
	this.Name=Name;
}
public void setprocChocolate(double procChocolate) {
	this.procChocolate=procChocolate;
}
public double getPrice() {
	return Price;
}

public double getKkal() {
	return Kkal;
}

public String getName() {
	return Name;
}
public double getprocChocolate() {
	return procChocolate;
}
}
