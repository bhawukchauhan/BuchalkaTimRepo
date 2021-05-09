package playlist;

import java.util.ArrayList;

public class Album {
private ArrayList<Song> songList = null;

public Album(Song song) {
	this.songList = new ArrayList<Song>();
	checkAndAddSong(song);
}

public void checkAndAddSong(Song song) {
	String songName = song.getTitle();
	if (songName != null && songName.isBlank() != true) {
		System.out.println("Valid song name : " + songName);
		if (checkSongAlreadyExists(songName)) {
			if (song.getDuration() > 0)
				this.songList.add(song);
			else
				System.out.println("Invalid song duration");
		} else
			System.out.println(songName + " already exists in Album");
	} else {
		System.out.println("Invalid song name");
	}
}

private boolean checkSongAlreadyExists(String songName) {	
	return songList.contains(songName);	
}

}
