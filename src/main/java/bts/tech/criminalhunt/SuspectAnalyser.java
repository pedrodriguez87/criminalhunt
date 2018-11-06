package bts.tech.criminalhunt;

import java.util.ArrayList;
import java.util.List;


public class SuspectAnalyser {

    public boolean match(Suspect suspect, Suspect suspect1) {

        double result = 0;

            if (suspect.isMale()) {
                if (suspect.getName().equalsIgnoreCase(suspect1.getName())) {
                    result++;
                }
                if (suspect.getAge() == suspect1.getAge() || (suspect.getAge() - suspect1.getAge()) <= 1) {
                    result++;
                }
                if (suspect.getHeight() == suspect1.getHeight() || (suspect.getHeight() - suspect1.getHeight()) <= 2) {
                    result++;
                }
                if (suspect.getWeight() == suspect1.getWeight() || (suspect.getWeight() - suspect1.getWeight()) <= 5) {
                    result++;
                }
                if (suspect.getHaircolor().equals(suspect1.getHaircolor())) {
                    result++;
                }
                if (suspect.getEyecolor().equals(suspect1.getEyecolor())) {
                    result++;
                }
                return (result >= 5) || (result == 4) && suspect.getName().equalsIgnoreCase(suspect1.getName())
                        && suspect.getAge() == suspect1.getAge() && suspect.getHeight() == suspect1.getHeight()
                        && suspect.getWeight() == suspect1.getWeight();
            }
            return false;
    }
}



