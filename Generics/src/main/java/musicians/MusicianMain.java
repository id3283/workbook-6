package musicians;

import java.time.LocalDate;
import java.util.ArrayList;

public class MusicianMain {

    public static void main(String[] args) {

        ArrayList<Musician> musicians = new ArrayList<>();

        Guitarist guitarist = new Guitarist();
        Drummer maya = new Drummer();

        Musician randMusician = maya;


        musicians.add(guitarist);
        musicians.add(maya);

        MusicianPair<Musician> duet = new MusicianPair<>(guitarist, maya);

        if (maya instanceof Drummer)
            System.out.println("drummer");

        if (randMusician instanceof Musician)
            System.out.println("musician");

        duet.perform();

    }
}
