package com.ciit.battlesimulator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GUI {
    public int spawnMonster(){
        int choice = 0;
        System.out.println("Choose a monster to spawn: ");
        System.out.println("1 - Lesser Demon");
        System.out.println("2 - Akira Demon");
        System.out.println("3 - Emperor Demon");
        System.out.println("4 - Hyperion Demon");

        return choice;
    }

    public int doAction(){
        int choice = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("What action would you like to take?");
        System.out.println("1 - Attack");
        System.out.println("2 - Use a spell");
        System.out.println("3 - Check your stats");
        System.out.println("4 - Check the monster's stats");
        System.out.println("Enter your choice here: ");
        choice = in.nextInt();
        return choice;
    }
}
