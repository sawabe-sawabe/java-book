package pracrice;

public class makearray {
	public static int[] makeArray(int size) {
		int[] newArray = new int [size];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i]=i;

		}
		return newArray;

	}
	public static void main(String[] args) {
		int[] array = makeArray(6);
		for(int i :array) {
			System.out.println(i);
		}
	}


}
