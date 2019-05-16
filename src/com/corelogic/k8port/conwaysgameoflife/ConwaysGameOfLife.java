package com.corelogic.k8port.conwaysgameoflife;

class ConwaysGameOfLife {
    private int[][] gol;

    void seed(int n) {
        this.gol = new int[n][n];
    }

    void seed(int n, boolean initVal) {
        this.gol = new int[n][n];
        if (initVal == true) setValue(0, 0);
    }

    void setValue(int row, int col) {
        this.gol[row][col] = 1;
    }

    void display() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : this.gol) {
            for (int col : row) {
                sb.append(col + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
