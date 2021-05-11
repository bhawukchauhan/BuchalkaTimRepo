package com.BuchalkaTim;

import java.time.LocalTime;

import org.testng.annotations.Test;

import playlist.Album;
import playlist.Song;

public class SongTest {
	
  @Test
  public void f() {
	  Song song = new Song("first song", 2.23);  
	  System.out.println("song title : " + song.getTitle());
	  System.out.println("song duration : " + song.getDuration());
	  
	  Album album = new Album(song);
	  album.checkAndAddSong(song);

	  for(Song i : album.getSongList()) {
		  System.out.println("Song name : " + i.getTitle());
		  System.out.println("Song time : " + i.getDuration());
	  }
	  
  }
  

}
