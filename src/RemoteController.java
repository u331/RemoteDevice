

public class RemoteController implements Device, Volume{

    private TVDevice tvDevice;

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void currentChannel() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }

    public void connectDevice(TVDevice tvDevice){
        //System.out.println(tvDevice.hashCode());
    }

    public void disconnectDevice(){

    }

    public void switchTheChannel(int channel){

    }

    public boolean checkDeviceConnected(){
        boolean b = true;
        try {
            tvDevice.hashCode();
        } catch (Exception e){
            return false;
        }
        return b;
    }

}
