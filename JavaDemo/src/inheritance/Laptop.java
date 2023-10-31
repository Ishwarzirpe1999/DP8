package inheritance;

public class Laptop {
	int noOfUSBPort;
	int processorSpeed;
	public Laptop() {
		noOfUSBPort=0;
		processorSpeed=0;
	}
	public Laptop(int usbport,int speed)
	{
		this.noOfUSBPort=usbport;
		this.processorSpeed=speed;
	}
	public void setNoOfUSBPort(int usb)
	{
		this.noOfUSBPort=usb;
	}
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	public void setProcessorSpeed(int speed)
	{
		this.processorSpeed=speed;
	}
	public int getProcessorSpeed()
	{
		return processorSpeed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj=new Laptop();
		obj.setNoOfUSBPort(2);
		obj.setProcessorSpeed(6);
		
		System.out.println(obj.getNoOfUSBPort());
		System.out.println(obj.getProcessorSpeed());
	}

}
