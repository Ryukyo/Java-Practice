package com.flo;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
	Album album = new Album("Motion", "Calvin Harris");
	album.addSong("Under Control", 4.23);
        album.addSong("Blame", 2.57);
        album.addSong("It was you", 3.35);
        album.addSong("Summer", 2.49);
        album.addSong("Ecstasy", 4.03);
        album.addSong("Together", 3.12);
        albums.add(album);

        album = new Album("World Order", "World Order");
        album.addSong("First Song", 1.57);
        album.addSong("Second Song", 2.28);
        album.addSong("Third Song", 3.19);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Blame", playlist);
        albums.get(0).addToPlaylist("Summer", playlist);
        albums.get(0).addToPlaylist("Test not existent song", playlist); // test song which does not exist
        albums.get(0).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(55, playlist); // test track which does not exist

        play(playlist);
    }

    private static void play (LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        } forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        } forward = false;
                    } if (listIterator.hasPrevious()) {
                    System.out.println("Now playing " + listIterator.previous().toString());
                } else {
                    System.out.println("Reached beginning of playlist");
                    forward = true;
                }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached start of playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached end of playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
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
        System.out.println("Available options: \npress");
        System.out.println("0 - quit\n" +
                "1 - play next song\n" +
                "2 - play previous song\n" +
                "3 - replay current song\n" +
                "4 - list songs in playlist\n" +
                "5 - print available options\n" +
                "6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================");
    }
}


