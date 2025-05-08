package EscapeGame;

public class EscapeGame {
    public static void main(String[] args) {
        Player player = new Player();
        
        player.name = "홍길동";
        
        Item 책상 = new Item();
        
        책상.name ="책상";
        책상.hasKey = false;
        책상.check(player);

        Item 상자 = new Item();

        상자.name ="책상";
        상자.hasKey = true;
        상자.check(player);

        Room room = new Room();
        player.tryToOpenDoor(room);
    }
}
