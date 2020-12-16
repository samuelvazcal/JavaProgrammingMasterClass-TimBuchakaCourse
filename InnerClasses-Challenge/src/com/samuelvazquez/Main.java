package com.samuelvazquez;

import java.util.*;


public class Main {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	public static void main(String[] args) {

		Album album = new Album("Hopes and Fears","Keane");
		album.addSong("Somewhere Only We Know",3.56);
		album.addSong("This Is The Last Time",3.28);
		album.addSong("Bend & Break", 3.4);
		album.addSong("We Might As Well Be Strangers",3.12);
		album.addSong("Everybody's Changing",3.35);
		album.addSong("Your Eyes Open",3.22);
		album.addSong("She Has No Time",5.46);
		albums.add(album);

		album = new Album("AM", "Arctic Monkeys");
		album.addSong("Do I Wanna Know",4.32);
		album.addSong("R U Mine?",3.21);
		album.addSong("Why'd You Only Call Me When You High",2.41);
		album.addSong("I Wanna Be Yours",3.04);
		albums.add(album);

		//The albums are stored in an array list
		LinkedList<Song>playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("Somewhere Only We Know",playList);
		albums.get(0).addToPlayList("We Might As Well Be Strangers",playList);
		albums.get(1).addToPlayList("Do I Wanna Know",playList);
		albums.get(0).addToPlayList(6,playList);
		albums.get(0).addToPlayList(7,playList);
		albums.get(1).addToPlayList(8,playList);//There is no tack 24

		play(playList);
	}
	private static void play(LinkedList<Song>playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song>listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch(action) {
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("We have reached the end of the playlist");
						forward = true;
					}
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now replaying " + listIterator.previous().toString());
							forward = false;
						} else {
							System.out.println("We are at the start of the list");
						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						} else {
							System.out.println("We have reached the end of the list");
						}
					}
					break;
				case 4:
					printList(playList);
					break;
				case 5:
					printMenu();
					break;
				case 6:
					if(playList.size() >0) {
						listIterator.remove();
						if(listIterator.hasNext()) {
							System.out.println("Now playing " + listIterator.next());
						} else if (listIterator.hasPrevious()) {
							System.out.println("Now playing " + listIterator.previous());
						}
					}
					break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" +
				"1 - to play next song\n" +
				"2 - to play previous song\n" +
				"3 - to replay the current song\n" +
				"4 - list songs in the playlist\n" +
				"5 - print available actions.\n" +
				"6 - delete current song from playlist");
	}

	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println("================");
	}

	/*Modify the playlist challenge so that the Album class uses an inner class.
	Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
	The inner SongList class will use an ArrayList and will provide a method to add a song.
	It will also provide findSong() methods which will be used by the containing Album class
	to add songs to the playlist.
	Neither the Song class or the Main class should be changed.
	 */

}

