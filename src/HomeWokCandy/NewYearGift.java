package HomeWokCandy;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NewYearGift {
	ArrayList<Sweets> newyearGift = new ArrayList<Sweets>();
 public ArrayList<Sweets> Gift(){
	 newyearGift.add(new ChocolateSweets(5.3,2.2,53.0,30.1,"Сникерс",23.1));
	 newyearGift.add(new ChocolateSweets(2.3,4.2,23.5,32.6,"Баунти",12.5));
	 newyearGift.add(new CackeSweets(10.0,1.6,58.6,50.0,"Орео","Печенье"));
	 newyearGift.add(new JellySweets(23.0,17.0,14.5,42.5,"Jelly Bears","Candys"));
	return newyearGift;
	 
 }
public double weightGift(ArrayList<Sweets> sweets ) {
	double weightGif = 0 ;
	 for (Sweets sweet : sweets) {
		 weightGif += sweet.getVeight();
	 }
return weightGif;
}
public ArrayList<Sweets> sortforShugar(ArrayList<Sweets> sweets, double[] shugarRange){
	return (ArrayList<Sweets>) sweets.stream()
			.sorted((sweet1 , sweet2) -> Double.compare(sweet1.getShugar(),sweet2.getShugar()))
			.collect(Collectors.toList());                     
   }
public static void printGift(ArrayList<Sweets> sweets) {
	for(Sweets sweet : sweets) {
		System.out.println("Shugar On sweet :" + sweet.getShugar()+"weight"+sweet.getVeight());
	}
}
}

