package ir.mohammadrezaarabi.dagger2;

public class mScreen {
    Lcd lcd;
    Touch touch;

    mScreen(Lcd lcd, Touch touch) {
        this.lcd = lcd;
        this.touch = touch;
    }
}
