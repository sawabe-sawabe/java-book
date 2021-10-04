package pracrice;

public class arraypractice {
	public static void main(String[] args) {
		int[] [] scores= new int[2][3];
		scores[0][0]=40;
		scores[0][1]=50;
		scores[0][2]=60;
		scores[1][0]=80;
		scores[1][1]=70;
		scores[1][2]=60;

		System.out.println(scores[1][1]);

		int scores2 [][] = {{40,50,60},{80,70,60}};
		System.out.println(scores2.length);
		System.out.println(scores2[0].length);

	}

}
