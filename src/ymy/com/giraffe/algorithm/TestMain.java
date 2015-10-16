package ymy.com.giraffe.algorithm;

public class TestMain {

	public static void main(String[] args) {
		int [] nums = {1,2,2,2,2,2,2,2,2,3,3,3,3,4,5};
		int length = Plateau.bestGetPlateau(nums);
		System.out.println(length);

	}

}
