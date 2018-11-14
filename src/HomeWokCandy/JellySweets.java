package HomeWokCandy;

public class JellySweets extends Sweets {
	private String typeJelly;
 public JellySweets(double Price,double Shugar,double  Kkal,double Veight,String Name,String typeJelly) {
	 super(Price,  Shugar,  Kkal, Veight, Name);
	 this.typeJelly=typeJelly;
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
public void settypeJelly(String typeJelly) {
		this.typeJelly=typeJelly;
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
public String gettypeJelly() {
	return typeJelly;
  }
}
