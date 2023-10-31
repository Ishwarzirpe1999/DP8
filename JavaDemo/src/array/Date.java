package array;

public class Date {
	int dd;
	int mm;
	int yy;
	Date()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date obj=new Date(21,3,2023);
		System.out.println(obj.getDd());
	}

}
