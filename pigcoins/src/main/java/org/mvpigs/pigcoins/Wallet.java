package org.mvpigs.pigcoins;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private PublicKey address;
    private PrivateKey SK;
    private double totalInput = 0d;
    private double totalOutput = 0d;
    private double balance = 0d;
    private ArrayList<Transaction> inputTransactions = new ArrayList();
    private ArrayList<Transaction> outputTransactions = new ArrayList();

    //Constructor
    public Wallet() {
    }

    public void generateKeyPair(){
        KeyPair pair = GenSig.generateKeyPair();
        setAddress(pair.getPublic());
        setSK(pair.getPrivate());
    }
}

