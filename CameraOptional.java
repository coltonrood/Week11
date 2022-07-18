package camera;

import java.util.NoSuchElementException;
import java.util.Optional;

public class CameraOptional {
	
	public static void main(String[] args) {
		new CameraOptional().run();
	}
	
	private void run() {
		Camera cameras = camerasMethod(Optional.of(new Camera("Casio")));
		System.out.println("I own a " + cameras + ".");
		
		try {
			camerasMethod(Optional.empty());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

	private Camera camerasMethod(Optional<Camera> cameraOptional) {
		return cameraOptional.orElseThrow(() -> new NoSuchElementException("The Camera does not exist"));
	}

}
