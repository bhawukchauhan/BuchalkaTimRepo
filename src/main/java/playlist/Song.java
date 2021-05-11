package playlist;


public class Song {
private String title;
private double duration;

public Song(String title, double duration) {
	String songName = title;
	if (songName != null && songName.isBlank() != true) {
		//System.out.println("Valid song name : " + songName);
			if (duration> 0) {
				this.title = title;
				this.duration = duration;
			}
			else
				System.out.println("Invalid song duration");
	} else {
		System.out.println("Invalid song name");
	}

}

public String getTitle() {
	return title;
}

public double getDuration() {
	return duration;
}

}
