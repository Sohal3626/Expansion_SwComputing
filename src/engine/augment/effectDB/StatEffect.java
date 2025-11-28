package engine.augment.effectDB;

import entity.Player.PlayerShip;
import entity.Player.PlayerShipStats;

public class StatEffect implements AugmentEffect {
    public enum StatType { ATTACK, SPEED, BULLET_SPEED, INTERVAL }

    private final StatType type;
    private final int delta;

    public StatEffect(StatType type, int delta) {
        this.type = type;
        this.delta = delta;
    }

    @Override
    public void apply(PlayerShip player) {
        PlayerShipStats stats = player.getStats();
        switch (type) {
            case ATTACK -> stats.setATK((stats.getATK() + delta));

            case SPEED -> stats.addSpeed(delta);

            case BULLET_SPEED -> stats.addBulletSpeed(-delta);

            case INTERVAL -> stats.addShootingInterval(stats.getShootingInterval() - delta);
        }
    }
}
