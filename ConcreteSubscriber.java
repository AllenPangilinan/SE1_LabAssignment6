public class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}