package section3_2;

public class Data {
	// メンバ変数（フィールド）
	private int data1;
	private String data2;

	// コンストラクタ
	public Data(int data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	// メソッド
	public void printData(){
		if(data1 >= 0){
			System.out.println(data2);
		}else{
			System.out.println("Negative value");
		}
	}
}
