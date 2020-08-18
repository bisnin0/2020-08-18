import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public RandomAccessFileTest() {
		//file�� ������ ������Ҽ� ������, index�� �̿��� �̵��Ҽ� �ִ�.
		try {
			String txt = "java input output stream test....����";
			File f = new File("D://javaFolder/access.txt");
			
			RandomAccessFile raf = new RandomAccessFile(f, "rw");  //, String mode.. w�� �ϸ� ��������
			raf.writeBytes(txt);//���� ����Ʈ����. ���ĺ��� �״�� ������ �ѱ��� ����
			
			
			//��ġ�̵�
			raf.seek(5); //input�ִ°��� 5��ġ
			raf.writeBytes("ABCD"); //�������
			
			raf.seek(10); //10���� �̵�. 
			raf.writeInt(1234); //��Ʈ�ϱ� 4����Ʈ Ȯ���ؼ� ������� . //���Ͽ��� �̻��ϰ� ��µȴ�. 
			
			//�б�
			raf.seek(10);
			int intData = raf.readInt(); //������ 10����ġ int�����͸� �о ��ü�� ����
			System.out.println("int="+intData); //��ü ���. 1234����
			
			
			raf.close(); 
		}catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args) {
		new RandomAccessFileTest();
	}

}
