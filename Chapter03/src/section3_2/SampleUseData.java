package section3_2;

public class SampleUseData {
	public static void main(String[] args) {
		// Data 型の変数宣言とインスタンス化
		Data obj1 = new Data(12, "Hello");
		Data obj2 = new Data(-34, "World");

		// オブジェクトの持つメソッドを呼び出し
		obj1.printData();
		obj2.printData();
	}
}
