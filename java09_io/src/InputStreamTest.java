import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		try {
		//input, output : byte ������ �۾��� �ϴ� Ŭ����
		//reader, writer : char.. ���ڴ����� �۾��� �ϴ� Ŭ����
		
		//byte������ �ֿܼ��� ������ �Է¹޴� Ŭ����
		InputStream in = System.in;  //�ý��� Ŭ�������ִ� in�̶�� ��ü�� �̹� ������ �ֱ⶧����
		
		System.out.print("�Է�=");

//		int data = in.read();  ////////����ó�� �ݵ�� �־���Ѵ�.
//		System.out.println(data);

		//////////�������� ABCD�� ������ 65�����´�. �̰� A�� �ƽ�Ű�ڵ尪. �������ڸ� �ᵵ ���� �տ��� �о�Ŵ�.
		//////////�׷��� �ݺ��� �������.
//���ڸ� �Է��ϸ� ������ �ƽ�Ű�ڵ�� ����ڰ� �ԷµǾ����� ����ؼ� �����ִ°�. �������ڶ� ����		
		while(true) { //����Ʈ�� �ɰ��°Ŷ� �ѱ� �Է��ϸ� ������ �ɰ����� ���� ������.
			int data = in.read();  ////////����ó�� �ݵ�� �־���Ѵ�.
			if(data==13)break; //13�� ������ ���͸� �ƴٴ� ���̴ϱ� ���� �Ⱥ��̰� �Ϸ��� �̷���
			System.out.println("data="+data);
			System.out.println("data="+(char)data); //�̷����ϸ� ���� �ƴ϶� ���ڷ� ����
			
			
		} //ABCDE�� ġ�� ������ �ƽ�Ű���尪�� ������ 13, 10�� ��µǴµ� �̰� ���ͷ����� ���°�
 		
		//byte �迭�� �̿��� ������ �Է�
		
/*		byte data[] = new byte[10];
		int cnt = in.read(data);
		System.out.println(cnt+"-->"+ new String(data)+"===");//����Ʈ�����ڷ� �ٲٱ� 
		//��°���� asdfe ġ�� 7(�ٹٲ�)-->asdfe ��� ���´�. 7�� ������ ���Ͱ� 13�� 10�� ���־.
		System.out.println(cnt+"-->"+ new String(data,0,cnt-2)+"==="); //����(�ٹٲ�)���� ����Ϸ��� ���Ͱ��� ����
*/		//asdfe 7-->asdfe

/*		
		//�Է¹������� ����Ʈ ���� ���ϰ� ���° �ε����� �������� ���ϱ�.
		byte data[] = new byte[10];
		int cnt = in.read(data,3,5); //�Է��� ���ڸ�ŭ �о 3��° �ε����� ����ִ´�. 5����Ʈ�� �о��.
		System.out.println(cnt+"==>"+ new String(data)+"---");
*/		
		
		
		System.out.println("end...");
		
		
		}catch(IOException io) {
			io.printStackTrace(); //������ ����� ���� �޽����� ������°� io�Ӹ� �ƴ϶� �ٸ� ����ó���� �� �ִ�.
		}
	}

	public static void main(String[] args) {
		new InputStreamTest();
	}

}
