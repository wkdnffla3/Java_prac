package EscapeGame;

public class Item {
    
    String name;
    
    boolean hasKey;
    
    void check(Player player){
        
        if(hasKey){
            System.out.println(name + "열쇠 발견");
            player.pickUpKey();
        }
    }
}
