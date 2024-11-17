package package2.DesignPattern.Observer;

public class Subscriber implements Observer {

	private String name;
	private Channel channelName = new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey "+name+" new video Uploaded name : "+channelName.title);
	}

	@Override
	public void subscriberChannel(Channel ch) {
		channelName = ch;
	}
}
