package section3_3;

public class SampleUseUser {
	public static void main(String[] args) {
		// 自作クラス User 型の変数宣言とインスタンス化
		User user1 = new User("yamada", "pass1", "山田　太郎");
		User user2 = new User();

		// setter を呼び出し値を代入
		user2.setLoginId("suzuki");
		user2.setPassword("pass2");
		user2.setUserName("鈴木　花子");

		// ユーザ名表示メソッドの呼び出し
		user1.authentication("yamada", "pass1");
		user2.authentication("suzuki", "pass1");
	}
}
