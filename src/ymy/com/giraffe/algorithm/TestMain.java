package ymy.com.giraffe.algorithm;

public class TestMain {

	public static void main(String[] args) {
		int [] f = {1,3,4,7,9};
		int [] g = {2,5,6};
		int length = Mindist.getMindist(f, g);
		System.out.println(length);

	}

}
