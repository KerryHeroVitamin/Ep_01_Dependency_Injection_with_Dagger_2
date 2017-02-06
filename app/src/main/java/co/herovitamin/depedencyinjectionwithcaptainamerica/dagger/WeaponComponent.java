package co.herovitamin.depedencyinjectionwithcaptainamerica.dagger;

import javax.inject.Singleton;

import co.herovitamin.depedencyinjectionwithcaptainamerica.MainActivity;
import dagger.Component;

/**
 * Created by kerry for HeroVitamin on 3/02/17.
 */

@Singleton
@Component(modules = WeaponModule.class)
public interface WeaponComponent {

    void inject(MainActivity activity);

}
