import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputInputStream {
	//Object을 쓰고 읽어오는 방식
	
	public ObjectOutputInputStream() {
		//파일에 객체를 쓰기, 읽기
		//클래스가 직렬화 되어야 한다.interface Serializable를 상속받으면 된다.
		try { //예외처리
			//객체 쓰기
			File f = new File("D://javaFolder/object.txt");
			
/*			
			DataVO vo =new DataVO();
			vo.setNum(999);
			vo.setName("세종대왕");
			
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vo); // //상위클래스가 하위클래스로 들어간것. .. 상위에서 object로 들어갈때는 그냥 들어감
			oos.close(); 
*///여기까지 바이트로 쓰기
			//파일에서 객체 읽어오기
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			DataVO vo = (DataVO)obj; //형변환 안하면 안바뀜 // 상위 object를 하위로 넣으려면 형변환
			//파일 쓴 시간과 이걸로 확인한 시간을 보고 제대로 되었는지 확인
			System.out.println("num="+vo.getNum());
			System.out.println("name="+vo.getName());
			vo.calendarOutput(); //프린트가 이 메소드 안에 이미 있어서 실행하면 찍힘
			//위에서 쓴 데이터 읽어오기
			//달력창 호출
			CalendarSwingEX cs = vo.getCalendarSwing();
			cs.start(); 
			
		}catch(Exception e) {}
		
		
		
	}

	public static void main(String[] args) {
		new ObjectOutputInputStream();
	}

}
