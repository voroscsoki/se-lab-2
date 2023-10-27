package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {
  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);
  }

  /*@Test
  void env_failure_rate(){
    TorpedoStore store = new TorpedoStore(1);
    System.setProperty("IVT_RATE", "1");
    store = new TorpedoStore(1);

    assertEquals(false, store.fire(1));

    System.setProperty("IVT_RATE", "qwertz");
    store = new TorpedoStore(1);

    assertEquals(true, store.fire(1));
  }*/
  @Test
  void illegal_argument_1(){
    TorpedoStore store = new TorpedoStore(1);
    assertThrows(IllegalArgumentException.class, () -> {store.fire(0);});
  }

  @Test
  void illegal_argument_2(){
    TorpedoStore store = new TorpedoStore(1);
    assertThrows(IllegalArgumentException.class, () -> {store.fire(500);});
  }
  @Test
  void get_count(){
    TorpedoStore store = new TorpedoStore(3);
    assertEquals(3, store.getTorpedoCount());
  }
}
