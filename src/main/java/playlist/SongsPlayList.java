package playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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
			songIndexInAlbum = a.checkSongAlreadyExists(songName);
			if (songIndexInAlbum >= 0) {
				song = a.getSongList().get(songIndexInAlbum);
				this.playList.add(song);
				break;
			}
		}
		
		/*
		if (songIndexInAlbum >= 0) {
			System.out.println("Song " + songName + " exists at index : " + songIndexInAlbum);
			System.out.println(song.toString());
		    //this.playList.add(song);
		}
		else
			System.out.println("Song " + songName + " not found in albums owned");
			*/
		if (songIndexInAlbum < 0)
			System.out.println("Song " + songName + " not found in albums owned");
	}

	public void showPlayList() {
		System.out.println("$$$$$$$$$$$$$$$ playlist $$$$$$$$$$$$$$$$$$$$$$");
		for (Song s : playList) {
			System.out.println((playList.indexOf(s)+1) + ". " +  s.toString());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	@SuppressWarnings("resource")
	public void menuPlayList() {
		Scanner scanner = new Scanner(System.in);
		int option;
		boolean quit = false;
		
		ListIterator<Song> listIterator = playList.listIterator();
		//listIterator.next();
		//listIterator.previous();
		
		
		displayMenuOptions();
		while (!quit) {
			option = scanner.nextInt();
			System.out.println("Option selected : " + option);
			switch (option) {
			case 0:
				System.out.println("Quitting playlist\n");
				quit = true;
				break;
			case 1:
				System.out.println("Display menu options\n");
				displayMenuOptions();
				break;
			case 2:
				System.out.println("Skip forward to the next song\n");
				break;
			case 3:
				System.out.println("Skip backwards to the previous song\n");
				break;
			case 4:
				System.out.println("Replay the current song\n");
				break;
			default:
				System.out.println("Invalid option, try again");
				displayMenuOptions();
			}
		}
	}
	
	private void displayMenuOptions() {
		System.out.println("Choose from the list of menu options for play list of songs\n" + 
						   "0 - Quit\n" +
				           "1 - Display menu options\n" +
		                   "2 - Skip forward to the next song\n"+
		                   "3 - Skip backwards to the previous song\n"+
		                   "4 - Replay the current song\n");
	}
}
