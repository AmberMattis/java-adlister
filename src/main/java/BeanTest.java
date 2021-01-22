import models.*;

public class BeanTest {
    public static void main(String[] args) {
        Album Djesse = new Album();
        Djesse.setArtist("Jacob Collier");
        Djesse.setGenre("Other");
        Djesse.setName("Djesse Vol.3 ");


        Quote quoteOne = new Quote();
        quoteOne.setContent("");





        System.out.println(Djesse.getArtist() + Djesse.getName());
    }
}
