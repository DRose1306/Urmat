package _2023_12_20.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<P extends Participant> {
    private String name;
    private List<P> participants  = new ArrayList<>(100);

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<P> getParticipants() {
        return participants;
    }

    public void setParticipants(List<P> participants) {
        this.participants = participants;
    }

    public void addNewParticipant(P newParticipant) {
        participants.add(newParticipant);
    }

    public void play(Team<P> teamPlayWith) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0) {
            winner = this.name;
        } else {
            winner = teamPlayWith.name;
        }

        System.out.println("*****Winner is: " + winner + "*****");
    }
}