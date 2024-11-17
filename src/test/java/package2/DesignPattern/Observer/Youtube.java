package package2.DesignPattern.Observer;

public class Youtube {

	public static void main(String[] args) {

		Channel ch = new Channel();
		Subscriber s1 = new Subscriber("Pankaj");
		Subscriber s2 = new Subscriber("Sumi");
		Subscriber s3 = new Subscriber("Kaushik");
		Subscriber s4 = new Subscriber("Gopi");
		Subscriber s5 = new Subscriber("Dharmu");
		
		ch.subscribe(s1);
		ch.subscribe(s2);
		ch.subscribe(s3);
		ch.subscribe(s4);
		ch.subscribe(s5);
		
		
		s1.subscriberChannel(ch);
		s2.subscriberChannel(ch);
		s3.subscriberChannel(ch);
		s4.subscriberChannel(ch);
		s5.subscriberChannel(ch);
		
		ch.uploadVideo("Design Pattern in Java");

	}

}
