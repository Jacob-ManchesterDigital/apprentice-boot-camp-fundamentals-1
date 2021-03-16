package cards;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalCardTest {
    /*@Test
    void animalCardDoesNotSnapPlayingCard(){
        // Arrange
        PlayingCard playingCard = new PlayingCard(2,1);

        // Act
        boolean isSnap = new AnimalCard(Animal.AARDVARK).snap(playingCard);

        // Assert
        Assertions.assertThat(isSnap).isFalse();

    }*/

    @Test
    public void aardvarkSnapsAardvark(){
        AnimalCard card1 = new AnimalCard(Animal.AARDVARK);
        AnimalCard card2 = new AnimalCard(Animal.AARDVARK);

        boolean isSnap = card1.snap(card2);

        Assertions.assertThat(isSnap).isTrue();
    }

    @Test
    public void camelSnapsAardvark(){
        AnimalCard card1 = new AnimalCard(Animal.CAMEL);
        AnimalCard card2 = new AnimalCard(Animal.AARDVARK);

        boolean isSnap = card1.snap(card2);

        Assertions.assertThat(isSnap).isFalse();
    }
}