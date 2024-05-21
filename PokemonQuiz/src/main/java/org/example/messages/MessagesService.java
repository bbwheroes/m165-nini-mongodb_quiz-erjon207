package org.example.messages;

import org.example.player.PlayerService;
import org.example.pokémon.Pokémon;

import java.util.List;
import java.util.Scanner;

public interface MessagesService {

    void endOfGameMsg(String name, double time, int points, PlayerService playerService);

    String getAnswerToQuestion(String question, Scanner scanner);

    int getSolution(Scanner scanner, List<Pokémon> pokemons, int points);

    String getCategory(Scanner scanner);

    void getLogo();
}
