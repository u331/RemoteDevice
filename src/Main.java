public class Main {

    public static void main(String[] args) {

        TV tv = new TV();
        RemoteController rc = new RemoteController();
        System.out.println(rc.checkDeviceConnected());
        rc.connectDevice(tv);
        System.out.println(rc.checkDeviceConnected());
    }

}
