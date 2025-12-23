package org.example;

import java.util.*;

public class Main {

    public static HashMap<String, Integer> Stats = new HashMap<>();
    public static ArrayList<String> CultivationRanks = new ArrayList<>();
    public static ArrayList<String> MartialRanks = new ArrayList<>();
    public static ArrayList<String> Titles = new ArrayList<>();
    public static ArrayList<String> Inventory = new ArrayList<>();

    /**
     * Initializes game; displays cultivation rules; handles talent
     */
    public static void main(String[] args) {

        Random Random = new Random();
        Scanner Scanner = new Scanner(System.in);
        AddRanks.AddCultivationRanks();
        AddRanks.AddMartialRanks();
        StatsManipulation.AddStats();

        int talent = Random.nextInt(0, 21);

        System.out.println("To cultivate is to defy Heaven. Your vessel is limited by your Spirit Root.\nStructure: 6 Major Ranks, 4 Minor Stages each, 10 Substages (G0-G9) each. \nRequirement: You must pass a Heavenly Tribulation at G9 to reach G0 of the next stage.");
        LetUserKnowTalent(talent);
    }

    private static void LetUserKnowTalent(int talent) {
        // Outputs talent‑based message about cultivation limitations
        switch (talent) {
            case 0:
                System.out.println("Your spiritual root is weak, witheriered and none existent, are bound for mortality");
                System.out.println("You may cultivate up to what would normally Allow someone to become a cultivator, and then sacrifice it to the heavens to heal your spiritual root.");
                break;
            case 1:
                System.out.println("Your Spiritual root while weak, still is capable of letting you reach the peak of Qi Gathering Early");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 2:
                System.out.println("Your Spiritual root while weak, still is capable of letting you reach the peak of Qi Gathering Middle");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 3:
                System.out.println("Your Spiritual root while weak, still is capable of letting you reach the peak of Qi Gathering Late");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 4:
                System.out.println("Your Spiritual root while weak, still is capable of letting you reach the peak of Qi Gathering");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation  to the heavens to Strengthen your spiritual root.");
                break;
            case 5:
                System.out.println("Your Spiritual root is not utter garbage, capable of letting you reach the peak of Foundation Establishment Early");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 6:
                System.out.println("Your Spiritual root is not utter garbage, capable of letting you reach the peak of Foundation Establishment Middle");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 7:
                System.out.println("Your Spiritual root is not utter garbage, capable of letting you reach the peak of Foundation Establishment Late");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 8:
                System.out.println("Your Spiritual root is not utter garbage, capable of letting you reach the peak of Foundation Establishment");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 9:
                System.out.println("You have potential as a cultivator, being capable of reaching the peak of Core Formation Early");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 10:
                System.out.println("You have potential as a cultivator, being capable of reaching the peak of Core Formation Middle");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice it to the heavens to Strengthen your spiritual root.");
                break;
            case 11:
                System.out.println("You have potential as a cultivator, being capable of reaching the peak of Core Formation Late");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 12:
                System.out.println("You have potential as a cultivator, being capable of reaching the peak of Core Formation");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 13:
                System.out.println("You are a hidden gem, being capable of reaching you reach the peak of Nascent Soul Early");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 14:
                System.out.println("You are a hidden gem, being capable of reaching the peak of Nascent Soul Middle");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 15:
                System.out.println("You are a hidden gem, being capable of reaching the peak of Nascent Soul Late");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 16:
                System.out.println("You are a hidden gem, being capable of reaching the peak of Nascent Soul");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 17:
                System.out.println("You are a you are one of the greatest geniuses the world has seen in centuries, being capable of reaching the peak of Deity Transformation Early");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 18:
                System.out.println("You are a you are one of the greatest geniuses the world has seen in centuries, being capable of reaching the peak of Deity Transformation Middle");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 19:
                System.out.println("You are a you are one of the greatest geniuses the world has seen in centuries, being capable of reaching the peak of Deity Transformation Late");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 20:
                System.out.println("You are a you are one of the greatest geniuses the world has seen in centuries, being capable of reaching the peak of Deity Transformation");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            case 21:
                System.out.println("You are a you are the greatest geniuses the world has seen in menial, being capable of reaching Immortality");
                System.out.println("To Go beyond that, you will need cultivate up till what will allow you to ascend to the next stage, and then sacrifice your cultivation to the heavens to Strengthen your spiritual root.");
                break;
            default:
                System.out.println("internal error with talent");
        }
    }
}
