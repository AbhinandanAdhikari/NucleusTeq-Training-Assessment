package interfaceTasks;

public class Phone {
	public void call()
	{
		System.out.println("Phone calling");
	}
	public void sms()
	{
		System.out.println("Phone sms");
	}
}

interface Camera{
	public void click();
	public void record();
}

interface MusicPlayer{
	public void play();
	public void stop();
}
