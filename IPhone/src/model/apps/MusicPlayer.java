package model.apps;

import java.util.HashMap;
import java.util.Map;

import model.App;
import model.entities.Music;

public class MusicPlayer implements App {

    private Music music;
    private Map<Integer, Music> musics = new HashMap<>();

    public MusicPlayer() {        
        start();
    }

    public void addMusic(String name){
        int position = 1;
        
        for (int key : musics.keySet()) {
        	if (key == position) {
        		position++;
        	}
        }        
        
        music = new Music(name);
        musics.put(position, music);       
    }
    
    public void showAllMusics() {
    	for (Integer key : musics.keySet()) {
    		System.out.println(musics.get(key));
    	}
    }
    
    public void selectMusicByPosition(Integer position) {
        System.out.println("\n" +musics.get(position) + " Selected.\n");
        simulateTimeCharge();
        playMusic(position);
    }
    
    public void playMusic(Integer position) {
        System.out.println("Playing: " + musics.get(position) + "\n");
        simulateTimeCharge();
    }

    public void pauseMusic(Integer position) {
        System.out.println("Pausing: " + musics.get(position) + "\n");
        simulateTimeCharge();
    }
    
    public void removeMusicByPosition(Integer position) {
    	
    	System.out.println("Removing: " + musics.get(position));
    	
    	musics.remove(position);
    			
    	simulateTimeCharge();
    	System.out.println("Done.");
    }

    @Override
    public void start() {
        System.out.println("Starting Music Player.");
        simulateTimeCharge();
    }

    @Override
    public void close() {
        System.out.println("Closing Music Player\n");
        simulateTimeCharge();
    }
    
  
}