package smart_system;

public class Main {
  public static void main(String[] args) {
    SmartDevice[] devices = {
            // WashingMachine 객체 생성
            new WashingMachine(),
            // AirConditioner 객체 생성
            new AirConditioner()
    };

    for (SmartDevice d : devices) {
      // 전원 ON
      d.turnOn();
      // 기기 동작
      d.operate();
      // 기기 업데이트
      // 다운 캐스팅을 해서 한다.
      if(d instanceof WashingMachine){
        ((WashingMachine) d).updateSoftware();
      }
      else if(d instanceof AirConditioner)
      {
        ((AirConditioner)d).updateSoftware();
      }
      ((Updatable)d).updateSoftware();

      // 전원 OFF
      d.turnOff();
    }
  }
}
