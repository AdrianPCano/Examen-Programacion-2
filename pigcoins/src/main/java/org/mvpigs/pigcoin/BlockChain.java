package org.mvpigs.pigcoins;

import org.mvpigs.pigcoins.Transaction;

import java.util.ArrayList;
import java.security.PublicKey;
import java.util.Map;


public class BlockChain {

    ArrayList<Transaction> blockchain = new ArrayList<Transaction>();

    //Constructor
    public BlockChain(){
    }

    public ArrayList<Transaction> getBlockChain() {
        return this.blockChain;
    }

    public void addOrigin(Transaction transaction) {
        blockChain.add(transaction);
    }

}