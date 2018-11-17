package HomeWorkSound;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CD {
	ArrayList<Music> compactdisk =new ArrayList<Music>();
 public ArrayList<Music> musicDisk(){
	 compactdisk.add(new RockMusic(2.5,"Lonely Day","Rock"));
	 compactdisk.add(new RockMusic(3.6,"Gone","Rock"));
	 compactdisk.add(new RockMusic(4.2,"Bring me to life","Rock"));
	 compactdisk.add(new PopMusic(3.7,"Way down we go","Pop"));
	 compactdisk.add(new PopMusic(3.1,"Not to Day","Pop"));
	 compactdisk.add(new PopMusic(3.3,"Russian Roulette","Pop"));
	 compactdisk.add(new JazzMusic(4.2,"Take Five","Jazz"));
	 return compactdisk;
 }
 public double lenghtSongs(ArrayList<Music> music) {
	double lenghtCompositions=0;
	for(Music songs : music) {
		lenghtCompositions+=songs.getlenght();
	}
	return lenghtCompositions;
  }

 
public ArrayList<Music> sortforStyle(ArrayList<Music> music){
				 	return (ArrayList<Music>) music.stream()
				 			.sorted(new MusicComp())
				 			.collect(Collectors.toList());
			  }
 public  void findSongforLenght(ArrayList<Music>music){
	 System.out.print("Enter lenghtSong:");
	 Scanner scan = new Scanner(System.in);
	 double lenght = scan.nextDouble();
	 System.out.println("You enter lenghtSong"+lenght);
	 for (Music songs :music) {
		 if(lenght==songs.getlenght()) {
			 System.out.println(songs.lenghtSong+songs.nameSong);
		 }else {
			 System.out.println("Sound not found");
		 }
	 }
 }
}
