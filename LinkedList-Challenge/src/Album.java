import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	//I want to initialize also the array list, that
	//I can actually use it without getting any errors
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	//I'm checking to see, or to make sure that we're not duplicating songs
	public boolean addSong(String title, double duration) {
		if(findSong(title)==null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	//Alternative wat to actually go through a list of entries.
	//foreach goes through and creates a variable called checkedSong for every entry
	//that's in our array list.
	//So, for every entry, as we go through this for loop, every entry that's in our array list
	//Java will automatically create this variable called checked song
	private Song findSong(String title) {
		for(Song checkedSong: this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber -1;
		if((index >= 0)&&(index <= this.songs.size())) {
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song>playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album");
		return false;
	}
}
