package org.example;

import java.util.*;

public class Main {

    public static Random Random = new Random();
    public static int currentSubStageIndex = 0;
    public static HashMap<String, Integer> Stats = new HashMap<>();
    public static ArrayList<String> CultivationRanks = new ArrayList<>();
    public static ArrayList<String> MartialRanks = new ArrayList<>();
    public static ArrayList<String> Titles = new ArrayList<>();
    public static ArrayList<String> Inventory = new ArrayList<>();
    public static int sectRank = 0;
    public static int sect_points = 0;
    public static int talent = Random.nextInt(0, 22);
    public static int neededEXP = (1 + currentSubStageIndex) * (22 - talent);
    public static float currentCultivationEXP = 0;
    public static int cultivationStage = 0;


    public static void main(String[] args) {
        ;
        Scanner Scanner = new Scanner(System.in);
        AddRanks.AddCultivationRanks();
        AddRanks.AddMartialRanks();
        StatsManipulation.AddStats();
        String input;




        System.out.println("To cultivate is to defy Heaven. Your vessel is limited by your Spirit Root.\nStructure: 6 Major Ranks, 4 Minor Stages each, 10 Substages (G0-G9) each. \nRequirement: You must pass a Heavenly Tribulation at G9 to reach G0 of the next stage.");
        LetUserKnowTalent(talent);

        System.out.println("Would you like to join the Heaven Shattering Sect ( yes / no ): ");
        input = Scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations! You have joined the Heaven Shattering Sect. May your cultivation journey be blessed with divine favor.");
            if (talent == 0) {
                System.out.println("You have joined as a servant, with the only benefit being the ability to buy resources from the sect.");
                sectRank = 1;
            } else if (talent < 9) {
                System.out.println("You have joined as a servant disciple, this gives you a 2% discount on cultivation resources.");
                sectRank = 3;
            } else if (talent < 13) {
                System.out.println("You have joined as a outer disciple, this gives you a 4% discount on cultivation resources.");
                sectRank = 5;
            } else if (talent <  17){
                System.out.println("You have joined as a inner disciple, this gives you a 6% discount on cultivation resources.");
                sectRank = 7;
            } else if (talent < 21) {
                System.out.println("You have joined as a core disciple, this gives you a 8% discount on cultivation resources.");
                sectRank = 9;
            } else if (talent == 21) {
                System.out.println("You have joined as a chosen disciple disciple, this gives you a 10% discount on cultivation resources.");
                sectRank = 11;
            }
        } else if (input.equalsIgnoreCase("no")) {
            System.out.println("You have chosen not to join the Heaven Shattering Sect. You will have to make your own way in the world.");
        }

        while (true) {
            System.out.println("What would yo like to do?");
            System.out.print("Cultivate, Battle, Sect:");
            input = Scanner.nextLine();

            input = input.toLowerCase();

            switch (input) {
                case "cultivate":
                    currentCultivationEXP +=  Random.nextFloat(0, ((float) neededEXP / (22 - talent)));
                    System.out.println("You now have " + currentCultivationEXP + " cultivation EXP out of " + neededEXP + ".");
                    if (currentCultivationEXP >= neededEXP) {
                        if (!CultivationRanks.get(cultivationStage).contains("G9")) {
                            System.out.println("Congratulations! You have ascended from " + CultivationRanks.get(cultivationStage) + " to " + CultivationRanks.get(cultivationStage + 1) + ".");
                            cultivationStage++;
                        } else {
                            System.out.println("You must pass a Heavenly Tribulation at G9 to ascend to the next stage.");
                        }
                    }
                    break;
                case "battle":
                    break;
                case "sect":
                    if (sectRank == 0) {
                        System.out.println("You must join the sect to use this command.");
                    } else {
                        sect_loop:
                        while (true) {
                            System.out.println("What would you like to do?");
                            System.out.print("Tasks, promote, shop, back");
                            input = Scanner.nextLine();
                            input = input.toLowerCase();
                            switch (input) {
                                case "tasks":
                                    break;
                                case "promote":
                                    break;
                                case "shop":
                                    break;
                                case "back":
                                    break sect_loop;
                                default:
                                    System.out.println("Invalid input, please try again.");
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        }

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
