import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataVO implements Serializable{ //���Ϸ� ���� ������ Ŭ������ �Ȱ�.
	private int num=1234;
	private String name="ȫ�浿";
	private CalendarSwingEX calendarSwing = new CalendarSwingEX();
	//��ü�� ����� �ڹٰ���ӽ��� ó���� ȣ���ϴ� �޼ҵ�� ���θ޼ҵ��. ���θ޼ҵ带 ���� new�� �����ϴ� �ڱ��ڽ��� ��ü�� ����� �޼ҵ尡 ���ִ�.
	//�׷����ϸ� 2�� ��������� ������ ��� �޼ҵ��� ���θ޼ҵ�� ���ֹ������Ѵ�. //CalendarSwingEX ���θ޼ҵ� �ּ�ó��
	//CalendarSwingEX�� ȣ���ϸ� �����ڸ޼ҵ尡 ����Ǵµ� �ű⿡ â�� �߰� �ϴ� �޼ҵ尡 �ֱ⶧���� â�� start�޼ҵ带 �����ؾ� �߰Բ� �����ߴ�.
	private Calendar calendar = Calendar.getInstance();
	
	
	public DataVO() {

	}
	/////////////////////////////////////////////
	public void calendarOutput() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = f.format(calendar.getTime());
		System.out.println(date);
	}
/////////////////////////////////////////////
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CalendarSwingEX getCalendarSwing() {
		return calendarSwing;
	}
	public void setCalendarSwing(CalendarSwingEX calendarSwing) {
		this.calendarSwing = calendarSwing;
	}


	public Calendar getCalendar() {
		return calendar;
	}


	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}
