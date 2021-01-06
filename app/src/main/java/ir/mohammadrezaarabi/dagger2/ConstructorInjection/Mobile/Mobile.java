package ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile;

import android.util.Log;

import javax.inject.Inject;

import ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile.Board.Board;
import ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile.Screen.Screen;

public class Mobile {
    private static final String TAG = "Mobile";

    Screen screen;
    Board board;
    /*

     وقتی یک Annotation inject به یک فیلد یا یک Constructor یا متد اضافه میکنیم
    به دگر میگیم که اون فیلد یا کانستراکتور یا متد رو به لیست Dependency هایی که قرار
     تزریق بشن اضافه بکن و هرجا که بهشون نیاز شد تزریق کن

     */

    @Inject
    Mobile(Screen screen, Board board) {
        this.screen = screen;
        this.board = board;
    }

    public void run() {
        Log.d(TAG, "run: Mobile is Run");
    }

}
