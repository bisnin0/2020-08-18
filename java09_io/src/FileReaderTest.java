import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		try {
			File f = new File("D:/javaDev/javaAPI", "CalendarTest.java");
			
			//�۲ô��� ������ ���� �о����
			FileReader fr = new FileReader(f);
			
			while(true) { //�ѹ��ھ� �о ����� �ؾ��ϴϱ� �ݺ����� ������.
				int inData = fr.read(); //�������� ���� �ϼ��ϸ� int������ Strig���� ���´�.
				if(inData==-1) {
					break;
				}
				System.out.print((char)inData);
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		new FileReaderTest();
		
	}

}
