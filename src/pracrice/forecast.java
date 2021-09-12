package pracrice;

public class forecast {
	public static void main(String[] args) {
		System.out.println("あなたの運勢は・・・？");
		int fortune = new java.util.Random().nextInt(4) + 1;
		switch (fortune) {
		case 1:
			System.out.println("いいことあるよ！");
			break;

		case 2:
			System.out.println("美味しいものが食べられるかも");
			break;

		case 3:
			System.out.println("普通の日かな");
			break;
		case 4:
			System.out.println("小指をぶつけるかもね");
			break;
		default:
			System.out.println("不吉な予感家でじっとしておこうね");

		}
	}

}
