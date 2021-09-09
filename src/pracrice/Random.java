package pracrice;

public class Random {
  public static void main(String[] args) {
	  System.out.println("あなたの名前を教えてください");
	  String name = new java.util.Scanner(System.in).nextLine();
	  System.out.println("あなたの歳を教えてください");
	  int age = new java.util.Scanner(System.in).nextInt();
	  int r = new java.util.Random().nextInt(100);

	  System.out.println(age+"歳の"+name+"さんのラッキーナンバーは"+r+"です");
  }
}
