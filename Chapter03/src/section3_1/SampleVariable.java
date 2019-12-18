package section3_1;

public class SampleVariable {
	public static void main(String[] args) {
		int data1;		// 整数型変数の宣言
		double data2;	// 実数型変数の宣言

		// 値の代入
		data1 = 100;
		data2 = 3.1;

		// 条件分岐
		// data1 の値が 0以上なら true と判断
		if(data1 >= 0){
			System.out.println(data2);
		}else{
			System.out.println("Negative value");
		}
	}
}
