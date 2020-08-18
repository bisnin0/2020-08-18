import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public FileInputStreamTest() {
		//������ ������ byte������ �б�
		try{   //����ó�� �̸� �س���
			
			File file = new File("D:/javaDev/javaAPI/CalendarTest.java");
			
			FileInputStream fis = new FileInputStream(file);
			
			while(true) {
				int inData = fis.read();
				if(inData==-1) {System.out.println(inData);break;} //�о��µ� �����Ͱ� ������ -1�� ������ ������ ������ �ɾ� ���� �� �ִ�. //End Of File : EOF
				System.out.print((char)inData); //������ ������ byte������ ����Ѵ�.
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileInputStreamTest();
	}

}
