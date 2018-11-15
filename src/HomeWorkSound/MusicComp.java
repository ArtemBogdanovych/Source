package HomeWorkSound;

import java.util.Comparator;

public class MusicComp implements Comparator<Music> {
	@Override
	public int compare(Music arg0,Music arg1) {
		return arg0.getstyle().compareTo(arg1.getstyle());
	}

}
