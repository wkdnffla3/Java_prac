package smart_system;

public class WashingMachine extends SmartDevice
        implements Updatable{

    @Override
    public void operate() {
        System.out.println("세탁 시작");
    }

    @Override
    public void updateSoftware() {
        System.out.println("세탁기 업데이트");
    }
}
