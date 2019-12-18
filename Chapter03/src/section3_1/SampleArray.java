package section3_1;

public class SampleArray {
	public static void main(String[] args) {
		int[] data1 = new int[2];			// 要素数 2の整数型配列
		double[] data2 = new double[3];	// 要素数 3の実数型配列

		// 添字を指定して値を代入
		data1[0] = 12;
		data1[1] = 34;

		data2[0] = 1.2;
		data2[1] = 3.4;
		data2[2] = 5.6;

		// 繰り返し文を用いて、配列のすべての要素にアクセス
		for(int i = 0; i < data1.length; i++){
			System.out.println(data1[i]);
		}

		// 拡張 for 文を用いて、配列のすべての要素にアクセス
		for(double d : data2){
			System.out.println(d);
		}
	}
}
