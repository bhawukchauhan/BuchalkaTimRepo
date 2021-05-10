package com.BuchalkaTim;

import org.testng.annotations.Test;

import playlist.Song;

public class SongTest {
	
  @Test
  public void f() {
	  Song song = new Song("first song", 2.23);  
	  System.out.println("song title : " + song.getTitle());
	  System.out.println("song duration : " + song.getDuration());
	  
  }
  

}
