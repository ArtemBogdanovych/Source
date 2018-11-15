package HomeWokCandy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Start {
static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
static double[] ShugarRange = new double[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	ArrayList<Sweets> newyeargift1= new ArrayList<Sweets>(new NewYearGift().Gift());
	System.out.println("New year gift:\n");
	NewYearGift.printGift(newyeargift1);
	System.out.println("Weight gift"+ new NewYearGift().weightGift(newyeargift1));
	NewYearGift.printGift(new NewYearGift().sortforShugar(newyeargift1, ShugarRange));
	System.out.println("Please, enter the range content of sugar for filter children's gift:\n From:");
	ShugarRange[0] = Integer.parseInt(reader.readLine());
	System.out.println(" To:");
	ShugarRange[1] = Integer.parseInt(reader.readLine());
	NewYearGift.printGift(new NewYearGift().sortforShugar(newyeargift1, ShugarRange));
	}

}
