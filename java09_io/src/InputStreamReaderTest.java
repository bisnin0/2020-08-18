import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() {
		try {
		
		InputStreamReader isr = new InputStreamReader(System.in); //�ȿ� �߻�޼ҵ尡 �־ new InputStreamreader �Ҽ�����.

		
		//���ڴ��� �ֿܼ��� ������ �Է¹ޱ�
/*		
		System.out.println("�Է�=");
		while(true) {
			int code = isr.read(); //����ó�� �ݵ�� �ʿ�
			if(code==13)break;//���Ͱ� ������ ���α׷� ����
			System.out.println(code+"==>"+(char)code); //��Ʈ�� ���ڷ�
		}
*/		
		
		//char�迭�� �Է¹ޱ�
		System.out.println("�Է�=");
		char data[] = new char[10];
		int cnt = isr.read(data);
		System.out.println(cnt+"==>"+String.valueOf(data));
		
		
		
		
		}catch(IOException e) {
			e.printStackTrace(); //�������� ��� ���������� Ȯ���ϱ����� �����ڵ��� ��� �ڵ�. 
		}
	}

	public static void main(String[] args) {
		new InputStreamReaderTest();
	}

}
