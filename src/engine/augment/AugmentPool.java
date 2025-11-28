package engine.augment;

import engine.augment.effectDB.StatEffect;

import java.util.List;

// All available augments
public class AugmentPool {
    public static final List<Augment> pool = List.of(
            new Augment("Attack Overflow", "I shoot more now. I think it helps.",
                    new TestEffect()),

            new Augment("April Fools", "Your playing skill improves!",
                    new TestEffect()),

            new Augment("Attack UP", "Engineers said it shouldn’t fire this hard.",
                    new StatEffect(StatEffect.StatType.ATTACK, 1)),

            new Augment("Move Speed UP", "The ship feels lighter. I didn’t do anything",
                    new StatEffect(StatEffect.StatType.SPEED, 1)),

            new Augment("Repair", "Some glue and tape. Should be fine",
                    new TestEffect()),

            new Augment("Overdrive", "The ship’s burning. Looks like targets are too",
                    new TestEffect()),

            new Augment("Strange Button", "It looks very pressable",
                    new TestEffect()),

            new Augment("Bullet Speed UP", "Feels like being a sniper",
                    new StatEffect(StatEffect.StatType.BULLET_SPEED, 2)),

            new Augment("Additional shot", "The trigger seems broken", new TestEffect())
    );
}