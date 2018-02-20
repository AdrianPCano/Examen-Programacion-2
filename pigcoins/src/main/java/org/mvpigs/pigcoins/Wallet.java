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
    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public PublicKey getAddress() {
        return address;
    }
    public void setTotal_output(double total_output) {
        this.total_output = total_output;
    }
    public double getTotal_output(){
        return this.total_output;
    }
    public void setTotal_input(double total_input) {
        this.total_input = total_input;
    }
    public double getTotal_input(){
        return this.total_input;
    }
    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }
    public PrivateKey getSKey() {
        return sKey;
    }
    
}

