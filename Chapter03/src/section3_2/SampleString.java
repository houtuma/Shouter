package section3_2;

public class SampleString {
	public static void main(String[] args) {
		// 文字列型変数の宣言
		String data1;
		String data2;
		// 要素数 3の文字列型配列の宣言
		String[] data3 = new String[3];

		// String オブジェクトの生成
		data1 = new String("Hello ");
		data2 = "World";

		data3[0] = new String("株式会社");
		data3[1] = new String("技術");
		data3[2] = "評論社";

		System.out.println(data1 + data2);

		// 配列のすべての要素にアクセス
		for(String d : data3){
			System.out.println(d);
		}
	}
}
