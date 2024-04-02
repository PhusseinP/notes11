import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Games game1 = new Games("PS4","GTA");
        Games game2 = new Games("PC","WZ");
        Games game3 = new Games("XBOX","watch Dog");
        Games game4 = new Games("switch","Mario");
        Games game5 = new Games("PC","FORTNITE");


        ArrayList<Games> myGameList = new ArrayList<>();
        myGameList.add(game1);
        myGameList.add(game2);
        myGameList.add(game3);
        myGameList.add(game4);
        myGameList.add(game5);

        Collections.sort(myGameList);

        for(Games a : myGameList){
            System.out.println(a);
        }


    }
}