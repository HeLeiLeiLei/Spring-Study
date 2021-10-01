package com.hl.service;

public class Proxy implements Rent {

    private Hose hose;
    public void setHose(Hose hose) {
        this.hose = hose;
    }
    public void rent() {


        seeHouse();
        hose.rent();
        farm();
        qianHeTong();
    }

    public void seeHouse(){
        System.out.println("看房子房子");
    }

    public void farm(){
        System.out.println("收费");
    }

    public void qianHeTong(){
        System.out.println("签合同");
    }
}
