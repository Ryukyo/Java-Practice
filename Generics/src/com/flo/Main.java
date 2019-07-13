package com.flo;

public class Main {

    public static void main(String[] args) {

        League<Team<BasketballPlayer>> basketballLeague = new League<>("bLeague");
        Team<BasketballPlayer> tokyoAlvark = new Team<>("Tokyo Alvark");
        Team<BasketballPlayer> chibaJets = new Team<>("Chiba Jets");
        Team<BasketballPlayer> kyotoHannaryz = new Team<>("KyotoHannaryz");
        Team<BasketballPlayer> osakaEvessa = new Team<>("Osaka Evessa");

        basketballLeague.add(tokyoAlvark);
        basketballLeague.add(chibaJets);
        basketballLeague.add(kyotoHannaryz);
        basketballLeague.add(osakaEvessa);

        tokyoAlvark.matchResult(chibaJets,88,90);
        tokyoAlvark.matchResult(kyotoHannaryz,67,83);
        osakaEvessa.matchResult(kyotoHannaryz,95,104);

        basketballLeague.showLeagueTable();
    }
}
