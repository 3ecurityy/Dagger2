package ir.mohammadrezaarabi.dagger2;

import android.util.Log;

public class Mobile {
    private static final String TAG = "Mobile";

    Board board;
    mScreen mScreen;‌

    Mobile(mScreen mscreen, Board board) {
        this.mScreen = mscreen;
        this.board = board;
    }

    void run() {
        Log.d(TAG, "run: Mobile is Run");
    }
}
