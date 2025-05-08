package smart_system;

public class AirConditioner extends SmartDevice implements Updatable{

    @Override
    public void operate() {
        System.out.println("냉방 시작");
    }

    @Override
    public void updateSoftware() {
        System.out.println("에어컨 업데이트");
    }
}
