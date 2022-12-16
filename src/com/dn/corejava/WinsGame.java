package com.dn.corejava;

public class WinsGame {

    public static void main(String[] args){
        WinsGame winsGame = new WinsGame();

        Boolean flag = winsGame.canIWin(10,10);
        System.out.println(flag);
    }
    public boolean canIWin(int maxChoosableInteger, int desiredTotal){
        int player1 = 0;
        int player2 =0;
        for(int i=1;i<=maxChoosableInteger;i++){
            player1 = i;
            if(player1+0>=desiredTotal)
                return true;
            for(int j=1;j<=maxChoosableInteger;j++){
                if(j==i)
                    continue;
                player2=j;
                if(player1+player2>=desiredTotal){
                    return false;
                }
            }
        }
        return false;
    }
}
