package section3_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleTryCatch {
	public static void main(String[] args) {
		// ファイル読み込みの機能を持ったクラス
		FileReader fReader = null;

		System.out.println(1);

		try{
			// ファイルの指定
			File file = new File("src/section3_4/sample.txt");
			// ファイルの読込
			fReader = new FileReader(file);

			System.out.println(2);
		}catch(FileNotFoundException ex){
			System.out.println(3);
		}finally{
			if(fReader != null){
				try {
					fReader.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			System.out.println(4);
		}
	}
}
