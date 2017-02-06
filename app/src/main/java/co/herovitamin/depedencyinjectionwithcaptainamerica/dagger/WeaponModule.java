package co.herovitamin.depedencyinjectionwithcaptainamerica.dagger;

import javax.inject.Singleton;

import co.herovitamin.depedencyinjectionwithcaptainamerica.models.CapAmerica;
import co.herovitamin.depedencyinjectionwithcaptainamerica.models.Shield;
import dagger.Module;
import dagger.Provides;

/**
 * Created by kerry for HeroVitamin on 3/02/17.
 */

@Module
public class WeaponModule {

    @Provides
    @Singleton
    public Shield provideShield(){
        return new Shield();
    }

    @Provides
    @Singleton
    public CapAmerica provideHero(Shield shield){
        return new CapAmerica(shield);
    }

    public String doNothing(String string){
        return "Hola Mundo";
    }
}