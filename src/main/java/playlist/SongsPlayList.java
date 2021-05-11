package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class SongsPlayList {

	private ArrayList<Album> albumsOwned;
	private LinkedList<Song> playList;

	public SongsPlayList() {
		this.albumsOwned = new ArrayList<Album>();
		this.playList = new LinkedList<Song>();
	}

	public ArrayList<Album> getAlbumsOwned() {
		return albumsOwned;
	}

	public void setAlbumsOwned(Album album) {
		this.albumsOwned.add(album);
	}

	public LinkedList<Song> getPlayList() {
		return playList;
	}

	public void addToPlayList(String songName) {
		Song song = null;
		int songIndexInAlbum = -1;
		
		for (Album a : albumsOwned) {
			//System.out.println(a.toString());
			songIndexInAlbum = a.checkSongAlreadyExists(songName);
			if (songIndexInAlbum >= 0)
				break;
		}
		
		if (songIndexInAlbum >= 0) {
			System.out.println("Song " + songName + " exists at index : " + songIndexInAlbum);
		    //this.playList.add(song);
		}
		else
			System.out.println("Song " + songName + " not found in albums owned");
		
	}

}
