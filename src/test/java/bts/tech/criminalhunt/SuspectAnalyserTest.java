package bts.tech.criminalhunt;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SuspectAnalyserTest {

    @Test
    public void equal_suspects() {

        SuspectAnalyser suspectAnalyser = new SuspectAnalyser();
        Suspect suspect = new Suspect("pedro", 20, 169, 75, "brown","blue",true);
        Suspect suspect1 = new Suspect("Pedro", 20, 169, 75, "brown", "blue", true);
        boolean matchresult = suspectAnalyser.match(suspect,suspect1);

        assertTrue(matchresult);

    }

    @Test
    public void very_similar_suspects() {

        SuspectAnalyser suspectAnalyser = new SuspectAnalyser();
        Suspect suspect = new Suspect("daniel", 16, 158, 75, "brown","blue",true);
        Suspect suspect1 = new Suspect("Daniel", 15, 157, 74, "brown", "brown", true);
        boolean matchresult2 = suspectAnalyser.match(suspect,suspect1);

        assertTrue(matchresult2);
    }

    @Test
    public void quite_similar_suspect() {

        SuspectAnalyser suspectAnalyser = new SuspectAnalyser();
        Suspect suspect2 = new Suspect("Pablo", 16, 158, 75, "brown","blue",true);
        Suspect suspect3 = new Suspect("Pablo", 16, 158, 75, "blue", "brown", true);
        boolean matchresult3 = suspectAnalyser.match(suspect2,suspect3);
        Suspect suspect4 = new Suspect("Paulo", 16, 158, 75, "brown","blue",true);
        Suspect suspect5 = new Suspect("Pablo", 16, 158, 75, "blue", "brown", true);
        boolean matchresult4 = suspectAnalyser.match(suspect4,suspect5);

        assertTrue(matchresult3);
        assertFalse(matchresult4);
    }

    @Test
    public void completely_different_subjects() {

        SuspectAnalyser suspectAnalyser = new SuspectAnalyser();
        Suspect suspect6 = new Suspect("Daniel", 19, 165, 80, "brown","blue",true);
        Suspect suspect7 = new Suspect("Pablo", 16, 158, 75, "blue", "brown", true);
        boolean matchresult5 = suspectAnalyser.match(suspect6,suspect7);

        assertFalse(matchresult5);
    }

    @Test
    public void hair_aye_changed() {

        SuspectAnalyser suspectAnalyser = new SuspectAnalyser();
        Suspect suspect8 = new Suspect("Daniel", 19, 165, 80, "brown","blue",true);
        Suspect suspect9 = new Suspect("Daniel", 19, 165, 80, "blue", "brown", true);
        boolean matchresult6 = suspectAnalyser.match(suspect8,suspect9);

        assertTrue(matchresult6);

    }


}

