import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedInputStreamTest {

	public BufferedInputStreamTest() {
		try {
			//�ֿܼ��� ���ڴ��� �Է��Ͽ� ���ۿ� ������ �ٴ����� �о����
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			while(true) {
				System.out.print("�Է�=");
				String inData = br.readLine();
				System.out.println(inData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new BufferedInputStreamTest();
	}
	

}
/*
BufferedInputStream�� BufferedOutputStream�� FilterStream�� ����Ͽ� ���� ���� ����� �����ϴ� Ŭ�����̴�.



[JAVA] ByteStream : FilterInputStream / FilterOutputStream





FileInputStream /FileOutputStream ���� �̾߱��� ��ó��, 1 Byte ������ ��/����� �̷������ ������� ������ �������Ƿ� ȿ���� �������� �ȴ�.

����, ����ڰ� ������ ���ۿ� ũ�⸦ �����Ͽ� ������� �ϰ� �Ǵ� �͵� �����̰� �����ϴ�.



[JAVA] ByteStream : FileInputStream / FileOutputStream





�̶� BufferedInputStream / BufferedOutputStream�� ����ϸ� ���ϰ� ȿ������ ������� �� �� �ִ�.



BufferedInputStream�� ���Ͽ� ���ϴ� �ڷḦ 1����Ʈ ������ �д� read() �޼ҵ带 �����ϸ� �ý��� ���������� ���۸� �غ��ϰ� �� ���۸� �̿��Ͽ� ������ ���Ϸκ��� ������ ũ�⸸ŭ �Ѳ����� ���� �����͸� �����´�.

�̷��� ä���� ���۷κ��� 1 ����Ʈ�� �о�鿩 ���α׷����� �����ϰ� �ȴ�.

�̶�, 1 ����Ʈ�� �о���̴� �۾��� ���Ϸκ��� �о���� ���� �ƴ� �غ�� �ý��� ���ۿ��� �о���� �ǹǷ�, ���� �Է����� ���� ���� ���ϸ� �ּ�ȭ �� �� �ִ�.



BufferedOutputStream ���� ���������� �����͸� 1 ����Ʈ�� ����ϸ� ������ �ƴ� �غ�� �ý��� ���ۿ� ����� �״´�.

���۰� ��� ä�����ų� close(), flush() ����� ������ ������ ��� ������ �ϵ� ��ũ ���Ͽ� ����Ѵ�.

����, BufferedOutputStream ���� �ϵ� ��ũ ���Ͽ� ���� ����� �ּ�ȭ �Ͽ� ȿ���� ��� ��ų �� �ִ�.



��������� ����ڰ� BufferedInputStream�� BufferedOutputStream�� �̿��Ͽ� ���α׷��� �ۼ��ϸ� 1 ����Ʈ�� �а� ���� ��� �۾��� �ϵ� ��ũ ������ �ƴ� �������� ���۸� ������� �߻��ϸ�, �ʿ信 ���� ���ۿ� �ϵ� ��ũ ���ϰ��� ������� ���������� �߻��ϹǷ� ��ü���� ����� ������ �������� ���� �� �ִ�.



��ó: https://hyeonstorage.tistory.com/238 [������ �ϰ� �;��]
*/
