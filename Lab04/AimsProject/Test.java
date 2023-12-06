package Lab04.AimsProject;

import Lab04.AimsProject.Media.Book;
import Lab04.AimsProject.Media.CompactDisc;
import Lab04.AimsProject.Media.DigitalVideoDisc;
import Lab04.AimsProject.Media.Media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Media> list = new ArrayList<Media>();
        Media dvd = new DigitalVideoDisc(1, "The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        list.add(dvd);
        Media cd = new CompactDisc(2, "Nam cham",
                "Rock", 24.95f, "Tran Lap", 5, "Tran Lap");
        list.add(cd);
        Media book = new Book(3, "Harry Potter",
                "Fiction", 18.99f);
        list.add(book);
        for (Media media : list) {
            media.print();
        }
    }
}