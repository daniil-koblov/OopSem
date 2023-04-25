package OopSem4;

import java.util.ArrayList;
import java.util.List;

public class Team <T>{
    List<T> team = new ArrayList<>();
    public Team<T> add(T warriorT){
        team.add(warriorT);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for(T itemT: team){
            warriors.append(itemT);
            warriors.append("\n");
        }
        return warriors.toString();
    }
}
