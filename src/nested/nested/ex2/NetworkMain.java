package nested.nested.ex2;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello"); // NetworkMessage는 Network안에서만 사용된다

    }
}
