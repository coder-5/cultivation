package org.example;

import java.util.*;

public class Main {

    public static HashMap<String, Integer> Stats = new HashMap<>();
    public static ArrayList<String> CultivationRanks = new ArrayList<>();
    public static ArrayList<String> MartialRanks = new ArrayList<>();
    public static ArrayList<String> Titles = new ArrayList<>();
    public static ArrayList<String> Inventory = new ArrayList<>();

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        AddRanks.AddCultivationRanks();
        AddRanks.AddMartialRanks();



    }
}
