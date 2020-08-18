import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataVO implements Serializable{ //파일로 쓰기 가능한 클래스가 된것.
	private int num=1234;
	private String name="홍길동";
	private CalendarSwingEX calendarSwing = new CalendarSwingEX();
	//객체를 만들면 자바가상머신이 처음에 호출하는 메소드는 메인메소드다. 메인메소드를 가면 new로 시작하는 자기자신을 객체로 만드는 메소드가 또있다.
	//그렇게하면 2번 만들어지기 때문에 대상 메소드의 메인메소드는 없애버려야한다. //CalendarSwingEX 메인메소드 주석처리
	//CalendarSwingEX를 호출하면 생성자메소드가 실행되는데 거기에 창이 뜨게 하는 메소드가 있기때문에 창이 start메소드를 실행해야 뜨게끔 수정했다.
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
