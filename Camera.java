package camera;

import java.util.LinkedList;
import java.util.List;

public class Camera {

	private String name;
	

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " Camera";
	}
	
	public Camera(String name) {
		this.name = name;
	}
	
	public int compare(Camera cam) {
		return this.name.compareTo(cam.name);
	}
	
	private static List<Camera> cameras = List.of(
			new Camera("Canon"),
			new Camera("Nikon"),
			new Camera("Sony"),
			new Camera("FujiFilm"),
			new Camera("Panasonic"),
			new Camera("Leica"),
			new Camera("Olympus"),
			new Camera("Pentax"),
			new Camera("Kodak"));
	
	public static List<Camera> getCameras() {
		return new LinkedList<>(cameras);
	}
}
