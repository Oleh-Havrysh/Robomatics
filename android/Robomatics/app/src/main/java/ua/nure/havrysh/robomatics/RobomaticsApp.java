package ua.nure.havrysh.robomatics;

import android.app.Application;

import ua.nure.havrysh.robomatics.di.component.AppComponent;
import ua.nure.havrysh.robomatics.di.component.DaggerAppComponent;
import ua.nure.havrysh.robomatics.di.module.AppModule;

public class RobomaticsApp extends Application {
    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
    }
}
