package com.hamurabi;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
   Random rand = new Random();
   Scanner scanner = new Scanner(System.in);
   
    int year = 1;
    int starved = 0;
    int journeyed = 5;
    int flock = 100;
    int harvested = 3000;
    int grainPerAcre = 3;
    int storedBushels = 2800;
    int clankersAte = 200;
    int acresOwned = 1000;
    int landPrice = 19;
    
    

    public void printRules() {
        System.out.println("HAIL, MIGHTY HAMMURABI, CHOSEN SHEPHERD OF SUMER! \n\n" +
                           "The gods have blessed thee with dominion over our sacred city-state.\n" +
                           "May Kris grant thee wisdom and Paul bestow prosperity upon thy reign!\n\n" +
                           "---\n\nTHE FIRST YEAR OF THY REIGN\n\n" +
                           "Thy People: 100 souls\n" +
                           "Grain in the Royal Storehouse: 2,800 bushels\n" +
                           "Land Under Thy Dominion: 1,000 acres\n" +
                           "Worth of One Acre: 19 bushels of grain\n\n" +
                           "The Harvest: By the grace of Raz, thy fields yielded 3 bushels per acre\n" +
                           "Misfortune: The cursed rats have devoured 200 bushels from thy stores\n" +
                           "The Dead: None have perished (the gods smile upon thy ascension!)\n\n" +
                           "---\n\nO GREAT HAMMURABI, THOU MUST NOW DECREE:\n\n" +
                           "The scribes await thy commands:\n\n" +
                           "1. How many acres of land dost thou wish to acquire or relinquish unto others?\n" +
                           "   (The merchants offer 19 bushels per acre this season)\n\n" +
                           "2. How many bushels of grain shall be distributed to feed thy people?\n" +
                           "   (Each soul requires no less than 20 bushels to endure the year)\n\n" +
                           "3. How many acres shall thy farmers sow and tend?\n" +
                           "   (Each farmer may till no more than 10 acres, and 2 bushels are required to plant each acre)\n\n" +
                           "---\n\nSpeak thy will, O Exalted One, and thy servants shall obey!");
    }

    public void printSummary () {
        System.out.println( "\nHAIL, MIGHTY HAMMURABI, CHOSEN SHEPHERD OF SUMER!\n" +
                            "Thou art in year " + this.year + " of thy sacred ten-year reign!\n\n" +
                            "By the mercy of the gods, " + this.starved + " among thy people have perished from hunger in the year past.\n\n" +
                            "Kris and Paul have smiled upon thee! " + this.journeyed + 
                            " souls have journeyed from distant lands to dwell beneath thy benevolent rule.\n\n" +
                            "Thy flock now numbers " + this.flock + " SOULS, entrusted to thy wisdom and care.\n\n" +
                            "By the grace of Raz, God of Agriculture, thy fields have yielded " + this.harvested + 
                            " BUSHELS from the earth, blessed with " + this.grainPerAcre + " bushels per acre!\n\n" +
                            "Alas! The cursed clankers, spawn of darkness, have devoured " + this.clankersAte + 
                            " BUSHELS from thy stores, leaving " + this.storedBushels + " BUSHELS in the Royal Storehouse.\n\n" +
                            "Thy dominion encompasses " + this.acresOwned + " ACRES of fertile land.\n\n" +
                            "The merchants in the marketplace decree that each acre may be bought or sold for " + this.landPrice + 
                            " BUSHELS of grain in this season.\n\n" +
                            "---\n\n" +
                            "What is thy command, O Exalted One?");
    }
    public void printEndGame() {
        System.out.println("\n" +
                           "========================================\n" +
                           "THE TENTH YEAR HAS PASSED\n" +
                           "========================================\n\n" +
                           "MIGHTY HAMMURABI, THY REIGN HAS COME TO ITS DESTINED END!\n\n" +
                           "For ten cycles of the sun, thou hast guided the people of Sumer through times of plenty and times of hardship.\n\n" +
                           "The scribes have recorded thy deeds in the sacred tablets.\n" +
                           "The priests have consulted the omens.\n" +
                           "Kris and Paul have weighed thy soul against the feather of Desa.\n\n" +
                           "---\n\n" +
                           "THY FINAL RECKONING:\n\n" +
                           "Souls under thy care: " + this.flock + "\n" +
                           "Grain in the Royal Storehouse: " + this.storedBushels + " bushels\n" +
                           "Acres of fertile land: " + this.acresOwned + "\n" +
                           "Total who perished from starvation during thy reign: " + this.starved + "\n\n" +
                           "---\n\n" +
                           "THE JUDGMENT OF THE GODS:\n\n" +
                           "May the annals of history remember thy name, O Hammurabi!\n\n" +
                           "THE GAME HAS ENDED");
    }

    int askHowManyAcresToBuy (int price, int bushels)
        sanity check - does the player have enough bushels?
        Response if False - System.out.println("FOLLY, O GREAT HAMMURABI!\n\n" +
                                               "Dost thou mock thy faithful scribes?!\n\n" +
                                               "The Royal Storehouse contains a mere " + this.storedBushels + " bushels!\n\n" +
                                               "Thy decree demands grain that exists only in the realm of dreams!\n\n" +
                                               "Kris and Paul frown upon such impossible commands!\n\n" +
                                               "Speak again, O Exalted One, with wisdom befitting thy station!");


    int askHowManyAcresToSell(int acresOwned)
        sanity check - does the player have enough acres to sell?
        Response if False - System.out.println("IMPOSSIBLE, O GREAT HAMMURABI!\n\n" +
                                               "Thy dominion encompasses but " + this.acresOwned + " acres of land!\n\n" +
                                               "Thou canst not plant seeds upon fields that exist not!\n\n" +
                                               "Raz herself cannot harvest from phantom soil!\n\n" +
                                               "Speak a wiser decree, O Exalted One!");


    int askHowMuchGrainToFeedPeople(int bushels)
        sanity check - does the player have enough bushels?
            Response if False - System.out.println("O GREAT HAMMURABI, SURELY THOU DOST JEST!\n\n" +
                                                   "The Royal Storehouse contains but " + this.storedBushels + " bushels of grain!\n\n" +
                                                   "Thy command exceeds the bounty bestowed upon thee by Raz!\n\n" +
                                                   "The scribes implore thee to reconsider thy decree, O Exalted One!");


    int askHowManyAcresToPlant(int acresOwned, int population, int bushels)
        sanity check - does the player have enough acres, grain, and people to do the planting? 
        Leftover grain goes into storage.
        Response if False - public void printInsufficientResources(String resourceType, int available, int requested) {
            System.out.println("INCONCEIVABLE, O GREAT HAMMURABI!\n\n" +
                               "Thy decree demands " + requested + " " + resourceType + ",\n" +
                               "yet thou possessest but " + available + "!\n\n" +
                               "Even the mighty gods cannot conjure resources from the ether!\n\n" +
                               "Speak again with wisdom, O Exalted One!");
}