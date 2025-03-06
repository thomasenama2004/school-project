import java.util.Random; 
public class MyRandom {
	public static int randInt(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}

	public static long randLong(long min, long max) {
		return new Random().nextLong() % (max - min + 1) + min;
	}

	public static double randDouble(double min, double max) {
		return new Random().nextDouble() * (max - min) + min;
	}
}