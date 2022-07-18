package camera;

import java.util.stream.Collectors;

public class CameraStreaming {

	public static void main(String[] args) {
		new CameraStreaming().run();
	}

	private void run() {
		String names = Camera
				.getCameras()
				.stream()
				.map(c -> c.toString())
				.sorted()
				.collect(Collectors.joining(", "));
		System.out.println(names);
	}

}
