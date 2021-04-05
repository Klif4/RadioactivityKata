import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RadioactivityRangeTest {

  private static final RadioactivityRange RADIOACTIVITY_RANGE = new RadioactivityRange(10, 50);

  @Test
  void contains() {
    Radioactivity radioactivity = new Radioactivity(42);
    assertThat(RADIOACTIVITY_RANGE.contains(radioactivity)).isTrue();
  }

  @Test
  void not_contains() {
    Radioactivity radioactivity = new Radioactivity(76);
    assertThat(RADIOACTIVITY_RANGE.contains(radioactivity)).isFalse();
  }

  @Test
  void contains_minLimit() {
    Radioactivity radioactivity = new Radioactivity(10);
    assertThat(RADIOACTIVITY_RANGE.contains(radioactivity)).isTrue();
  }

  @Test
  void not_contains_maxLimit() {
    Radioactivity radioactivity = new Radioactivity(50);
    assertThat(RADIOACTIVITY_RANGE.contains(radioactivity)).isFalse();
  }
}