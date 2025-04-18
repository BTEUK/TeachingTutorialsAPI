package net.bteuk.teachingtutorials.services;

import java.util.UUID;

/**
 * Handles promotion of a player after completion of the compulsory tutorial
 */
public interface PromotionService {

    /**
     * Calls the promotion logic for the promotion of the given player upon completion of the compulsory tutorial
     * @param playerUuid uuid of the player to promote
     * @param playerName name of the player to promote
     */
    void promote(UUID playerUuid, String playerName);

    /**
     *
     * @return A description of the promotion service
     */
    String getDescription();

}
