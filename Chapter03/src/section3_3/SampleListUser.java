package section3_3;

import java.util.ArrayList;

public class SampleListUser {
	public static void main(String[] args) {
		// コレクション（リスト）型の変数宣言とインスタンス化
		ArrayList<User> list = new ArrayList<>();

		// User クラス型の変数宣言
		User user;
		// User クラスのインスタンス化
		user = new User("yamada", "pass1", "山田　太郎");

		// リストに追加
		list.add(user);

		user = new User("suzuki", "pass2", "鈴木　花子");
		list.add(user);

		user = new User("itou", "pass3", "伊藤　恵");
		list.add(user);

		// リストのすべての要素にアクセス
		for(User u : list){
			System.out.println(u.getUserName());
		}
	}
}
