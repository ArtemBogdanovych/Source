package HomeWorkSound;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;







public class Runing {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Music> cd1= new ArrayList<Music>(new CD().musicDisk());
	System.out.println("Music Disc:\n");
	System.out.println("Lenght Song"+ new CD().lenghtSongs(cd1));
	System.out.println(new CD().sortforStyle(cd1));
CD comapdisc=new CD();
comapdisc.findSongforLenght(cd1);


	}

}
