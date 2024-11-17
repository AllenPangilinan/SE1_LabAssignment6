public class Main {
    public static void main(String[] args) {
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();

        Subscriber allen = new ConcreteSubscriber("Allen");
        Subscriber edward = new ConcreteSubscriber("Edward");

        newsAgency.registerSubscriber(allen);
        newsAgency.registerSubscriber(edward);

        newsAgency.publishNews("Breaking News: 'Pepito' weakens into typhoon; Signal No. 5 lifted");

        newsAgency.removeSubscriber(allen);

        newsAgency.publishNews("Another Update: Xi tells Biden ready for 'smooth transition' to Trump");
    }
}