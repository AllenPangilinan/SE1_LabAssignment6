import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsAgency implements NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }
}