import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderFileTest {

	public BufferedReaderFileTest() {
		try {
			File f = new File("D://javaDev/javaAPI", "CalendarTest.java");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String txt = br.readLine();  // readLine�� ���͸� �о���� �ʴ´�. ���͸� ��� ������ �ν��ϴµ� ���⶧����..
											 //�׷��� �ٹٲٱ⸦ ���� ������ ���ٿ� �� ������.
				if(txt==null) break;
				System.out.println(txt); //readLine �ٹٲٱ� ����Ʈ����
			}//���ѷ��� �������� ������ �ϳ�? �ٴ����� �����ϱ� ���� �о��µ� �����Ͱ� ����? �ڵ尡 null�� ������ �ߴ��ϸ� �ȴ�.
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The end...");
	}

	public static void main(String[] args) {
		new BufferedReaderFileTest();
	}

}
