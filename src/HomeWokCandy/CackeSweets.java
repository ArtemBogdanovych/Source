package HomeWokCandy;

public class CackeSweets extends Sweets{
	private String typeCacke;
 public CackeSweets(double Price, double Shugar, double Kkal, double Veight,String Name, String typeCacke) {
	 super(Price,  Shugar,  Kkal, Veight, Name);
	 this.typeCacke=typeCacke;
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
public void settypeCacke(String typeCacke) {
	this.typeCacke=typeCacke;
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
public String gettypeCacke() {
	return typeCacke;
}
}
