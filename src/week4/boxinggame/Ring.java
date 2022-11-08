package week4.boxinggame;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ring {
    private final Fighter fighter1;
    private final Fighter fighter2;
    private final int minWeight;
    private final int maxWeight;

    public Ring(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (!checkWeight()) {
            System.out.println("Athletes' weights do not match.");
            return;
        }

        boolean first = ThreadLocalRandom.current().nextBoolean();

        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            System.out.println("======== NEW ROUND ===========");

            if (first)
                fighter2.setHealth(fighter1.hit(fighter2));
            else
                fighter1.setHealth(fighter2.hit(fighter1));


            if (isWin()) {
                break;
            }

            if (first)
                fighter1.setHealth(fighter2.hit(fighter1));

            else
                fighter2.setHealth(fighter1.hit(fighter2));

            if (isWin()) {
                break;
            }

            printScore();
        }
    }

    public boolean checkWeight() {
        return (fighter1.getWeight() >= minWeight && fighter1.getWeight() <= maxWeight) &&
                (fighter2.getWeight() >= minWeight && fighter2.getWeight() <= maxWeight);
    }

    public boolean isWin() {

        if(fighter1.getHealth() != 0 && fighter2.getHealth() != 0){
            return false;
        }

        String winner = fighter1.getHealth() == 0 ? fighter2.getName() : fighter1.getName();

        System.out.println("Winner: " + winner);

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(fighter1.getName() + " Health \t:" + fighter1.getHealth());
        System.out.println(fighter2.getName() + " Health \t:" + fighter2.getHealth());
        System.out.println("------------");
    }
}
