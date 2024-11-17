package package2.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subs = new ArrayList<>();
	public String title;

	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	@Override
	public void unsubscribe() {
		subs.remove(subs);
	}

	@Override
	public void notifySubscriber() {
		for (Observer subsc : subs) {
			subsc.update();
		}
	}

	@Override
	public void uploadVideo(String videoTitle) {
		this.title = videoTitle;
		notifySubscriber();
	}
}
