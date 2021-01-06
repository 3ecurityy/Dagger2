package ir.mohammadrezaarabi.dagger2.MethodInjection.Mobile;

import android.util.Log;

import javax.inject.Inject;

public class Guard {
    private static final String TAG = "Mobile";

    @Inject
    Guard() {
    }

    void setGuardForMobile(Mobile mobile) {
        Log.d(TAG, "setGuard: Protected");
    }
}
