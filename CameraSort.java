package camera;

import java.util.List;

public class CameraSort {

	public static void main(String[] args) {

		new CameraSort().run();
		
	}

	private void run() {
		boolean lambdaSort = true;
		List<Camera> cameras;
		String name;
		
		System.out.println("Original : " + Camera.getCameras());
		
		
			
			if(lambdaSort) {
				cameras = lambdaSort();
				name = "Lambda Sorted : ";
			} else {
				cameras = mrSort();
				name = "Methord Reference Sorted : ";
			}
			System.out.println(name + cameras);
		}
		
	
	

	private List<Camera> mrSort() {
		List<Camera> cameras = Camera.getCameras();
		cameras.sort(Camera::compare);
		return cameras;
	}

	private List<Camera> lambdaSort() {
		List<Camera> cameras = Camera.getCameras();
		cameras.sort((c1, c2) -> c1.compare(c2));
		return cameras;
	}
	


}
