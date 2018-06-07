package com.example.micaelleal.condominioapplication.models;

import android.app.Application;
import android.util.Log;
import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;
import io.objectbox.android.BuildConfig;

/**
 * Created by aluno on 27/02/18.
 */

public class App extends Application {

    public static final String TAG = "ObjectBoxExample";
    public static final boolean EXTERNAL_DIR = false;

    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        boxStore = MyObjectBox.builder().androidContext(App.this).build();

        if (BuildConfig.DEBUG) {
            new AndroidObjectBrowser(boxStore).start(this);
        }

        Log.d("App", "Using ObjectBox " + BoxStore.getVersion() + " (" + BoxStore.getVersionNative() + ")");
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}