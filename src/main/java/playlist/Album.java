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
	if (checkSongAlreadyExists(songName) >= 0)
		System.out.println(songName + " already exists in Album");
	else
		this.songList.add(song);
}

private int checkSongAlreadyExists(String songName) {
	int matchFoundAtIndex = -1 ;
	for (Song sg : this.songList) {
		if(sg.getTitle().equalsIgnoreCase(songName)) {
			matchFoundAtIndex = this.songList.indexOf(sg);
			break;
		}
	}
	return matchFoundAtIndex;	
}

public ArrayList<Song> getSongList() {
	return songList;
}

}
