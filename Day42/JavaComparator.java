/*
Problem:
Comparators are used to compare two objects. In this challenge, you’ll create a comparator and use it to sort an array.
The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.
Given an array of n Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the 
same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator 
interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format:
->Input from stdin is handled by the locked stub code in the Solution class.
->The first line contains an integer, n, denoting the number of players.
->Each of the n subsequent lines contains a player’s name and score, respectively.

Constraints:
->Players can have the same name.
->Player names consist of lowercase English letters.

Output Format:
You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, 
use it to sort the Player array, and print each sorted element.

Sample Input:
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output:
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/

import java.util.*;

class Checker implements Comparator<Player> {
    public int compare(Player o1, Player o2) {
       if (o1.score > o2.score) {
           return -1;
       } if (o1.score < o2.score) {
           return 1;
       } if (o1.score == o2.score) {
           return o1.name.compareTo(o2.name);
       }
    return 0;
    }
}
class Player{
    String name;
    int score;
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class  JavaComparator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        for(int i = 0; i < n; i++){
            player[i] = new Player(sc.next(), sc.nextInt());
        }
        sc.close();
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}