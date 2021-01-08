package utils;

import java.util.List;

import models.Bakery;

//お試し用

public class Run {

    public static void main(String[] args) {
        String s = "select * from bakerys";
        List<Bakery> results = DBDAO.getBakery(s);
            System.out.println(results.get(0).getName());

    }

}
