package EscapeGame;

public class Player {
    String name;

    boolean hasKey;

    void pickUpKey(){
        System.out.println("열쇠 주음");
        hasKey = true;
    }

    void tryToOpenDoor(Room room){
        if(hasKey){
            room.openDoor();
        }
    }
}
