import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
//		File f= new File("D:\javaDev\javaAPI\ArraysTest.java"); //�� ��ο� �ִ� ���Ϸ� �۾��� �ҰŴ�... �ε� ������ �߻� \�齽���ô� ����ڸ� �ǹ��ϱ⶧���� �ڹٿ����� /������. 
		File f1 = new File("D:/javaDev/javaAPI/ArraysTest.java"); //�����ּ��������
		File f2 = new File("D:/javaDev/javaAPI","CalendarTest.java");
		File f3 = new File("\"D:/javaDev/javaAPI"); //���� ��θ� �ִ°�. ������ ������ ��ü ������ �����ϴ�.
		File f4 = new File(f3, "RandomTest.java"); //f3���� �̹� ��ΰ� ��ü�� ������� ������ ��ü�� �̿��ؼ� ������ ����
		
		File f5 = new File("D:/javaFolder/a/b/c"); //���� ������ ����¹��.. �Ʒ� �޼ҵ带 �̿��ؼ� �ִ��� ������ Ȯ�θ��� �Ѵ�.
		//exists() : ���� Ȥ�� ������ �����ϴ��� Ȯ�����ִ� �޼ҵ�(������ true, ������ false�� ���ƿ´�)
		if(!f5.exists()) { //������ false�ϱ� false�϶� ����Ǿ���Ѵ�.�׷��ϱ� �տ� !������ ���ش�.
			if(f5.mkdirs()) {//��������
				System.out.println("������ �����Ǿ����ϴ�.");//������ �����Ǿ����� ���Ⱑ ����
			}else {
				System.out.println("�������� �����Ͽ����ϴ�.");//����ٰ� ������ �߻��ϸ� ���Ⱑ ����
			}
		}
		
		try {
		
		//���ϻ����ϱ�
		File f6 = new File("D:/javaFolder/test.txt");
		if(!f6.exists()) {
			if(f6.createNewFile()) { //����... ����ó�� �ʿ�. 
				System.out.println("������ �����Ǿ����ϴ�.");
			}else {
				System.out.println("���ϻ��� �����Ͽ����ϴ�.");
			}
		}
		//������ ������ ���ϱ�
		long lastDate = f2.lastModified(); //�� long�̳ĸ� �и���(ms 1/1000��)�� ���ͼ� ���� �ʹ� ũ�� ������
		System.out.println("lastDate="+lastDate); //�и��ʷ� �����ȳ�¥�� ���Ѵ�. 
		
		Calendar date = Calendar.getInstance();
		System.out.println("���� �и��� = " + date.getTimeInMillis());
		
		//������� ���� �и��ʸ� ��ȯ
		date.setTimeInMillis(lastDate);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String dateStr = format2.format(date.getTime());
		System.out.println("������ ������ = " + dateStr);
		
		
		
		System.out.println("exe = "+ f2.canExecute()); //�������������� �ƴ��� Ȯ�����ִ°�?
		System.out.println("read="+ f2.canRead()); //�б� �������� Ȯ��
		System.out.println("write="+ f2.canWrite()); // ���� �������� Ȯ��
		
		//Ư�� �������� ��� ���ϰ� ��� ���� ������ ������
		File f7 = new File("D://");
		File f8[] = f7.listFiles();
		for(File f : f8) {
			//getName():���ϸ�, getParent():������ , getPath():����+���ϸ�
			if(f.isDirectory()) {
				System.out.println(f.getPath()+"[����]");
			}else if(f.isFile()) {
				System.out.println(f.getPath()+"[����]");
			}
		}
		System.out.println("f2.length()="+f2.length()+"byte"); //���ε�� Ư������ �����ؼ� �ø��� Ȯ���ϴ� ����.. ������ byteũ��
		
		//������ǻ���� ����̺� ��� ���ϱ�
		File root[] = File.listRoots();
		for(File f:root) {
			System.out.println("����̺�->"+f.getPath());
		}
		
		//���� ����
		File f9 = new File("D:/demo 2.sql");
		if(f9.delete()) {
			System.out.println("������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("���� ������ �����߽��ϴ�.");
		}
		
		
		}catch(IOException e) {
			System.out.println(e.getMessage()); //��ΰ� Ʋ�Ȱų� �ϸ� '������ ��θ� ã�� �� �����ϴ�' ���� �޽����� ����ش�.
		}
	}

	public static void main(String[] args) {
		new FileTest();
	}

}
