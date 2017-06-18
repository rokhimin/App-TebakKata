package com.rokhim.simpletebakkata;
import java.util.Random;

/**
 * Rokhimin Wahid on 07/06/2017.
 */

public class GenerateWord {

    /*Generate data "kata" dari string*/
    public static String generate()
    {
        // TODO: this words shouldn't be hardcoded here. API or local DB should be used.
        /*List kata hewan*/
        String[] words = { "angsa", "anjing", "anoa", "antilop", "aphid", "arwana", "ayam", "ayamkalkun", "babi", 
							"badak", "bangau", "banteng", "bebek", "bekantan", "bekicot", "belalang", "belibis", 
							"belut", "beo", "berangberang", "beruang", "beruk", "biawak", "bintanglaut", "biribiri", 
							"bison", "buaya", "bunglon", "burung", "cacing", "capung", "cendrawasih", "cheetah", "cicak", 
							"cumicumi", "domba", "gajah", "garuda", "gorila", "gurita", "hamster", "harimau", "hiena", 
							"hiu", "iguana", "ikan", "jangkrik", "jerapah", "kadal", "kakatua", "kalajengking", "kalkun", 
							"kambing", "kelabang", "keledai", "kelelawar", "kelinci", "keong", "kepiting", "kera", "kerang", 
							"kerbau", "kijang", "koala", "kodok", "komodo", "kucing", "kuda", "kudanil", "landak", "lebah", 
							"lintah", "lobster", "lumbalumba", "lutung", "luwak", "merak", "merpati", "monyet", "musang", 
							"nyamuk", "onta", "rajawali", "rubah", "rusa", "sapi", "semut", "serigala", "singa", "tikus", 
							"trenggiling", "tupai", "undurundur", "zebra"};

        /*merandomkan list kata*/
        Random randomGenerator = new Random();
        randomGenerator.nextInt(words.length);
        return words[randomGenerator.nextInt(words.length)];
    }
}
