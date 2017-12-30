package backup.eh223im_assign3;

public class Radio {
    private boolean isOn = false;
    private int currentChan = 1;
    private String state = "Off";
    private int currentVol = 1;

    final int minVol = 0;
    final int maxVol = 15;

    final int minChan = 1;
    final int maxChan = 10;

    private void displayMessage (String str) {
        System.out.println(str);
    }


    private void setState() {
        isOn = state != "Off";
    }

    public void turnOn() {
        state = "On";
        setState();
    }

    public void turnOff() {
        state = "Off";
        setState();
    }

    public void volumeUp () {
        setVolume(currentVol+1);
    }

    public void volumeDown () {
        setVolume(currentVol-1);
    }

    public void channelUp () {
        setChannel(currentChan+1);
    }

    public void channelDown () {
        setChannel(currentChan-1);
    }

    public void setVolume(int volSet) {
        if (isOn) {
            if (volSet <= maxVol && volSet >= minVol) {
                currentVol = volSet;
            } else {
                displayMessage("New volume not within range!");
            }
        } else {
            displayMessage("Radio off ==> No adjustment available");
        }
    }

    public void setChannel (int chanSet) {
        if (isOn) {
            if (chanSet <= maxChan && chanSet >= minChan) {
                currentChan = chanSet;
            } else {
                displayMessage("New channel not within range!");
            }
        } else {
            displayMessage("Radio off ==> No adjustment available");
        }
    }

    public String getSettings() {
        return "Setting: On "+isOn+", Channel "+currentChan+", Volume "+currentVol;
    }
}
