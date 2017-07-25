package com.ihnid.nthfungame.ihavenoidea;
import com.tune.Tune;
import com.tune.ma.application.TuneApplication;

public class InitTune extends TuneApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Tune.init(this, "196355", "4a858c288d437613259b56b1e5107649");
    }
}
