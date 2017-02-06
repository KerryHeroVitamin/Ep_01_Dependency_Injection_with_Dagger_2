package co.herovitamin.depedencyinjectionwithcaptainamerica;

import android.app.Application;

import co.herovitamin.depedencyinjectionwithcaptainamerica.dagger.DaggerWeaponComponent;
import co.herovitamin.depedencyinjectionwithcaptainamerica.dagger.WeaponComponent;
import co.herovitamin.depedencyinjectionwithcaptainamerica.dagger.WeaponModule;

public class MainApp extends Application {

    WeaponComponent mWeaponComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mWeaponComponent = DaggerWeaponComponent.builder()
                .weaponModule(new WeaponModule())
                .build();
    }

    public WeaponComponent getWeaponComponent() {
        return mWeaponComponent;
    }
}