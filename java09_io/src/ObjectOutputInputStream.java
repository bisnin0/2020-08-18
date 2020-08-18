import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputInputStream {
	//Object�� ���� �о���� ���
	
	public ObjectOutputInputStream() {
		//���Ͽ� ��ü�� ����, �б�
		//Ŭ������ ����ȭ �Ǿ�� �Ѵ�.interface Serializable�� ��ӹ����� �ȴ�.
		try { //����ó��
			//��ü ����
			File f = new File("D://javaFolder/object.txt");
			
/*			
			DataVO vo =new DataVO();
			vo.setNum(999);
			vo.setName("�������");
			
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vo); // //����Ŭ������ ����Ŭ������ ����. .. �������� object�� ������ �׳� ��
			oos.close(); 
*///������� ����Ʈ�� ����
			//���Ͽ��� ��ü �о����
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			DataVO vo = (DataVO)obj; //����ȯ ���ϸ� �ȹٲ� // ���� object�� ������ �������� ����ȯ
			//���� �� �ð��� �̰ɷ� Ȯ���� �ð��� ���� ����� �Ǿ����� Ȯ��
			System.out.println("num="+vo.getNum());
			System.out.println("name="+vo.getName());
			vo.calendarOutput(); //����Ʈ�� �� �޼ҵ� �ȿ� �̹� �־ �����ϸ� ����
			//������ �� ������ �о����
			//�޷�â ȣ��
			CalendarSwingEX cs = vo.getCalendarSwing();
			cs.start(); 
			
		}catch(Exception e) {}
		
		
		
	}

	public static void main(String[] args) {
		new ObjectOutputInputStream();
	}

}
