package HomeWorkSound;

public abstract class Music {
	protected double lenghtSong;
	protected String nameSong;
	protected String styleSong;
 public Music(double lenghtSong, String nameSong, String styleSong) {
	 this.lenghtSong=lenghtSong;
	 this.nameSong=nameSong;
	 this.styleSong=styleSong;
 }
 public void setlenght(double lenghtSong) {
	 this.lenghtSong=lenghtSong;
 }
 public void setname(String nameSong) {
	 this.nameSong=nameSong;
 }
 public void setstyle(String styleSong) {
	 this.styleSong=styleSong;
 }
 public double getlenght() {
	 return lenghtSong;
 }
 public String getname() {
	 return nameSong;
 }
 public String getstyle() {
	 return styleSong;
 }
}
