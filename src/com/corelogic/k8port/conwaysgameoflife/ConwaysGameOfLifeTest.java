package com.corelogic.k8port.conwaysgameoflife;

public class ConwaysGameOfLifeTest {
    public static void main(String[] args) {
        test1();
        initAllTrue();
    }

    private static void test1() {
        ConwaysGameOfLife game = new ConwaysGameOfLife();
        System.out.println("Test 1 assert non-empty 2dimensional array");
        game.seed(1);
        game.display();
    }

    private static void initAllTrue() {
        ConwaysGameOfLife game = new ConwaysGameOfLife();
        System.out.println("Init board to all true");
        game.seed(1, true);
        game.display();
    }
}
