package sample;

public class Hello {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hello");
		System.out.println("world");
		
		transWord(new Object() {
			@Override
			public String toString() {
				String french = "Bonjour le monde!";
				return french;
			}
		});
	}
	
	public static void transWord(Object obj) {
		System.out.println(obj.toString());
	}

}
