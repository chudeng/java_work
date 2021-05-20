package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	void run() throws IOException, FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void run() throws IOException, FileNotFoundException {
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		try {
			c.run();
		} catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("out.txt 파일은 설정 파일입니다. 이 파일이 프로젝트 루트 디렉터리에 존재해야 합니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
