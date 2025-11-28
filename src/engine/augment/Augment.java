package engine.augment;

import engine.augment.effectDB.AugmentEffect;
import entity.Player.PlayerShip;

public class Augment {
    public final String name;
    public final String description;
    public final AugmentEffect effect;

    public Augment(String name, String description, AugmentEffect effect) {
        this.name = name;
        this.description = description;
        this.effect = effect;
    }

    public void apply(PlayerShip player){
        effect.apply(player);

    }
}