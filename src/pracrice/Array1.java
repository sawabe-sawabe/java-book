package pracrice;

public class Array1 {
	public static void main(String[] args) {
		int[] scores = {20,30,40,50,80};
		int sum = 0;
		int count =0;
		for(int i = 0 ;i < scores.length; i++) {
			if(scores[i] >= 50) {
				count++;
			}
			sum += scores[i];
		}
		System.out .println("50点以上の科目の数は"+count);
		int avg = sum/ scores.length;
		System.out .println("合計点"+sum);
		System.out .println("平均点"+avg);
	}

}
