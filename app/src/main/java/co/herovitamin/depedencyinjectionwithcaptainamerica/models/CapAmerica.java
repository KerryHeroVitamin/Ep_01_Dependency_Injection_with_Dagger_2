package co.herovitamin.depedencyinjectionwithcaptainamerica.models;

import javax.inject.Inject;

/**
 * Created by kerry for HeroVitamin on 3/02/17.
 */

public class CapAmerica {

    Shield mShield;

    public CapAmerica(Shield shield) {
        mShield = shield;
    }

    public String getWeaponName(){
        return mShield.getName();
    }


}
