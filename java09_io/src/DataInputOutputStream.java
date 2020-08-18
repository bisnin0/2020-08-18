import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream  {

	public DataInputOutputStream() {
		//기본데이터 타입으로 공간(메모리) 확보해 파일로 데이터 저장하기
		int dataInt = 12345; //int형 데이터
		double dataDouble = 5678.2356; //double형 데이터
		boolean dataBoolean = true; //boolean형 데이터
		char dataChar = '한'; //char형 데이터
		//이 4개 데이터를 파일로 쓰기 할거다.
		//예외발생 예외처리
		
		try {
/*
			File f = new File("D://javaFolder/dataOutput.txt");
			FileOutputStream fos = new FileOutputStream(f); //이것만 가지고 파일에 쓰기는 가능하다. 단 byte단위로 써진다.
			DataOutputStream dos = new DataOutputStream(fos);// DataOutputStream은 FileOutputStream을 객체로 이용헤 만든다.
			                                                 //데이터의 크기 만큼 공간 확보후 쓰기
			dos.writeInt(dataInt); //쓰기를 할 데이터 5바이트 확보해서 12345
			dos.writeDouble(dataDouble); // 8바이트 확보해서 5678.2356
			dos.writeBoolean(dataBoolean); // 1바이트 확보해서 true
			dos.writeChar(dataChar); // 2바이트 확보해서 한
			dos.close();
			///////////// 이렇게 쓰면   09@?<PH?? 라는 내용을 가진 텍스트파일이 생긴다. 1바이트씩 읽어오는거기 때문에 보기엔 이상해도 정보는 들어가있다.
*/ //밑에를 위해 주석처리
			//DataInputStrea : 데이터형으로 저장된 내용 읽어오기
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
