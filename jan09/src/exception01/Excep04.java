package exception01;
//p 422
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excep04 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/anhyojeong/Documents/temp.txt");
			
			while(true){
				int data = fr.read();
			}
		} catch (FileNotFoundException e) { //파일이 없을때.
			System.out.println("파일을 찾을 수 없습니다.");
			
		} catch (IOException e) { //파일을 못 읽을 때.
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
