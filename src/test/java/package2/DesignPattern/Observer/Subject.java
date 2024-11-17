package package2.DesignPattern.Observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unsubscribe();

	void notifySubscriber();

	void uploadVideo(String videoTitle);

}