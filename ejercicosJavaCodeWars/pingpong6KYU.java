//este codigo no me funciona en el codewars en los tests random


public class Dinglemouse {
    public static String pingPong(String sounds) {
        int pingScore = 0;
        int pongScore = 0;
        boolean lastShotWasPing = false;
        boolean lastShotWasPong = false;

        String[] rallies = sounds.split("-");
        for (String rally : rallies) {
            if (rally.equals("ping")) {
                pingScore++;
                lastShotWasPing = true;
                lastShotWasPong = false;
            } else if (rally.equals("pong")) {
                pongScore++;
                lastShotWasPing = false;
                lastShotWasPong = true;
            } else {
                if (lastShotWasPing) {
                    pongScore++;
                } else {
                    pingScore++;
                }
            }
        }

        if (pingScore == pongScore) {
            return lastShotWasPong ? "ping" : "pong";
        } else {
            return pingScore > pongScore ? "ping" : "pong";
        }
    }
}