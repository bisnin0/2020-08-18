import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream  {

	public DataInputOutputStream() {
		//�⺻������ Ÿ������ ����(�޸�) Ȯ���� ���Ϸ� ������ �����ϱ�
		int dataInt = 12345; //int�� ������
		double dataDouble = 5678.2356; //double�� ������
		boolean dataBoolean = true; //boolean�� ������
		char dataChar = '��'; //char�� ������
		//�� 4�� �����͸� ���Ϸ� ���� �ҰŴ�.
		//���ܹ߻� ����ó��
		
		try {
/*
			File f = new File("D://javaFolder/dataOutput.txt");
			FileOutputStream fos = new FileOutputStream(f); //�̰͸� ������ ���Ͽ� ����� �����ϴ�. �� byte������ ������.
			DataOutputStream dos = new DataOutputStream(fos);// DataOutputStream�� FileOutputStream�� ��ü�� �̿��� �����.
			                                                 //�������� ũ�� ��ŭ ���� Ȯ���� ����
			dos.writeInt(dataInt); //���⸦ �� ������ 5����Ʈ Ȯ���ؼ� 12345
			dos.writeDouble(dataDouble); // 8����Ʈ Ȯ���ؼ� 5678.2356
			dos.writeBoolean(dataBoolean); // 1����Ʈ Ȯ���ؼ� true
			dos.writeChar(dataChar); // 2����Ʈ Ȯ���ؼ� ��
			dos.close();
			///////////// �̷��� ����   09@?<PH?? ��� ������ ���� �ؽ�Ʈ������ �����. 1����Ʈ�� �о���°ű� ������ ���⿣ �̻��ص� ������ ���ִ�.
*/ //�ؿ��� ���� �ּ�ó��
			//DataInputStrea : ������������ ����� ���� �о����
			File f = new File("D://javaFolder/dataOutput.txt");
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			int readInt = dis. readInt();
			double readDouble = dis.readDouble();
			boolean readBoolean = dis.readBoolean();
			char readChar = dis.readChar();
			System.out.println("int="+readInt);
			System.out.println("double="+readDouble);
			System.out.println("boolean="+readBoolean);
			System.out.println("char="+readChar);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	
	}

	public static void main(String[] args) {
		new DataInputOutputStream();
	
	
	
	}

}
