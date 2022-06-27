package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);

        int expected = 3;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);
    }
    @Test
    public void SumHours() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Квест", "Аркады");
        Game game3 = store.publishGame("Завоеватели", "Стратегии");

        Player player = new Player("Petya");
        player.installGame(game2);

        int expected = 4;
        int actual = player.play(game2,4);
        assertEquals(expected, actual);
    }
    @Test
    public void NoInstallGame() { //RuntimeException//
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Квест", "Аркады");
        Game game3 = store.publishGame("Завоеватели", "Стратегии");

        Player player = new Player("Petya");
        player.installGame(game);

        assertThrows(Exception.class,() -> {
            player.play(game2,1);
        });
    }

    @Test
    public void mostPlayerByGenre() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Квест", "Аркады");
        Game game3 = store.publishGame("Завоеватели", "Стратегии");

        Player player = new Player("Petya");
        player.installGame(game1);
        player.installGame(game2);
        player.installGame(game3);
        player.play(game1, 3);
        player.play(game2, 2);
        player.play(game3, 2);

        Game expected = game1;
        Game actual = player.mostPlayerByGenre("Аркады");
        assertEquals(expected, actual);
    }
    @Test
    public void notPlayTheGenre() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Квест", "Аркады");
        Game game3 = store.publishGame("Завоеватели", "Стратегии");

        Player player = new Player("Petya");
        player.installGame(game1);
        player.installGame(game2);
        player.installGame(game3);
        player.play(game1, 3);
        player.play(game2, 2);

        String expected = null;
        Game actual = player.mostPlayerByGenre("Стратегии");
        assertEquals(expected, actual);
    }
}
