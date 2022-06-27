package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    public void shouldAddGameMultiple() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Баттл Онлайн 2", "Аркады");
        Game game3 = store.publishGame("Нетология Баттл Онлайн 3", "Аркады");
        Game game4 = store.publishGame("Нетология Баттл Онлайн 4", "Аркады");
        assertTrue(store.containsGame(game2));
    }

    @Test
    void notAddedGame() {
        GameStore store1 = new GameStore();
        Game game1 = store1.publishGame("Super awesome game", "action");
        GameStore store2 = new GameStore();
        Game game2 = store2.publishGame("Not so awesome game", "tactics");
        assertFalse(store2.containsGame(game1));
    }

    @Test
    void emptyGamesList() {
        GameStore store = new GameStore();
        assertFalse(store.containsGame(null));
    }

    @Test
    public void addTimeSimpleCalculation() {
        GameStore store = new GameStore();
        String playerName = "John";
        int[] hours = {1, 10, 7, 15};
        int sum = 0;
        for (int time : hours) {
            store.addPlayTime(playerName, time);
            sum += time;
        }
        assertEquals(sum, store.getSumPlayedTime());
    }

    @Test
    void severalPlayersTimeCalculation() {
        GameStore store = new GameStore();
        int[] hours = {22, 12, 99, 1, 5};
        int sum = 0;
        for (int time : hours) {
            sum += time;
        }
        store.addPlayTime("John", hours[0]);
        store.addPlayTime("Bob", hours[1]);
        store.addPlayTime("Tim", hours[2]);
        store.addPlayTime("John", hours[3]);
        store.addPlayTime("Kevin", hours[4]);
        assertEquals(sum, store.getSumPlayedTime());
    }

    @Test
    void emptyPlaytime() {
        GameStore store = new GameStore();
        assertEquals(0, store.getSumPlayedTime());
    }

    @Test
    void mostActivePlayer() {
        GameStore store = new GameStore();
        int[] hours = {22, 12, 99, 1, 5};
        store.addPlayTime("John", hours[0]);
        store.addPlayTime("Bob", hours[1]);
        store.addPlayTime("Tim", hours[2]);
        store.addPlayTime("John", hours[3]);
        store.addPlayTime("Kevin", hours[4]);
        assertEquals("Tim", store.getMostPlayer());
    }

    @Test
    void emptyMostActive() {
        GameStore store = new GameStore();
        assertNull(store.getMostPlayer());
    }
}