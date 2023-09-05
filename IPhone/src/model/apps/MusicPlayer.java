package model.apps;

import java.util.HashMap;
import java.util.Map;

import model.App;
import model.entities.Music;

public class MusicPlayer implements App<Music> {

	private Music music;
	private Map<Integer, Music> musics = new HashMap<>();
	private Integer position = 1;

	public MusicPlayer() {
		start();
	}

	public void addMusic(String name) {
		music = new Music(name);
		musics.put(position, music);
		this.position++;
	}

	public void showAllMusics() {
		if (!musics.isEmpty()) {
			for (Integer key : musics.keySet()) {
				System.out.println(musics.get(key));
			}
		} else {
			System.out.println("Empty list.");
		}
	}

	public void selectMusicByPosition(Integer position) {
		if (!musics.isEmpty()) {
			if (isMapped(musics.get(position))) {
				System.out.println("\n" + musics.get(position) + " Selected.\n");
				simulateTimeCharge();
				playMusic(position);
			} else {
				System.out.println("There is no music in position " + position);
				simulateTimeCharge();
			}
		} else {
			System.out.println("Empty list.");
			simulateTimeCharge();
		}
	}

	public void playMusic(Integer position) {
		if (!musics.isEmpty()) {
			if (isMapped(musics.get(position))) {
				System.out.println("Playing: " + musics.get(position) + "\n");
				simulateTimeCharge();
			} else {
				System.out.println("There is no music in position " + position);
				simulateTimeCharge();
			}
		} else {
			System.out.println("Empty list.");
			simulateTimeCharge();
		}
	}

	public void pauseMusic(Integer position) {
		if (!musics.isEmpty()) {
			if (isMapped(musics.get(position))) {
				System.out.println("Pausing: " + musics.get(position) + "\n");
				simulateTimeCharge();
			} else {
				System.out.println("There is no music in position " + position);
				simulateTimeCharge();
			}
		} else {
			System.out.println("Empty list.");
			simulateTimeCharge();
		}
	}

	public void removeMusicByPosition(Integer position) {

		if (!musics.isEmpty()) {
			if (isMapped(musics.get(position))) {
				System.out.println("Removing music on position: " + position);
				System.out.println(musics.get(position) + " removed.\n");

				musics.remove(position);

				simulateTimeCharge();
			} else {
				System.out.println("There is no music in position " + position);
				simulateTimeCharge();
			}
		} else {
			System.out.println("Empty list.");
			simulateTimeCharge();
		}

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

	@Override
	public boolean isMapped(Music obj) {
		return musics.containsValue(obj);
	}

}