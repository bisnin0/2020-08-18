import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public RandomAccessFileTest() {
		//file의 정보를 입출력할수 있으며, index를 이용해 이동할수 있다.
		try {
			String txt = "java input output stream test....하이";
			File f = new File("D://javaFolder/access.txt");
			
			RandomAccessFile raf = new RandomAccessFile(f, "rw");  //, String mode.. w를 하면 쓰기전용
			raf.writeBytes(txt);//쓰기 바이트단위. 알파벳은 그대로 읽히고 한글은 깨짐
			
			
			//위치이동
			raf.seek(5); //input있는곳이 5위치
			raf.writeBytes("ABCD"); //덮어써짐
			
			raf.seek(10); //10으로 이동. 
			raf.writeInt(1234); //인트니까 4바이트 확보해서 집어넣음 . //파일에선 이상하게 출력된다. 
			
			//읽기
			raf.seek(10);
			int intData = raf.readInt(); //파일의 10번위치 int데이터를 읽어서 객체에 저장
			System.out.println("int="+intData); //객체 출력. 1234나옴
			
			
			raf.close(); 
		}catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args) {
		new RandomAccessFileTest();
	}

}
