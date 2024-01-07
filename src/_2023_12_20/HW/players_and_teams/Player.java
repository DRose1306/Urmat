package _2023_12_20.HW.players_and_teams;

import _2023_12_20.HW.enums.Position;
import com.github.javafaker.Faker;

import java.util.Objects;

public class Player {
    static final Faker FAKER = new Faker();
    private String name;
    private Position position;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player that = (Player) o;
        return Objects.equals(name, that.name) && position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Player(String name, Position position) {
        this.name = name;
        this.position = position;
    }
}
