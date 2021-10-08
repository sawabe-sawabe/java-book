package pracrice;

public class method {
	public static void methodA() {
	System.out.println("今日の天気は");
	methodB();
}
public static void methodB() {
	System.out.println("雪！");

}

public static void main(String[] args) {
	methodA();
}

}
