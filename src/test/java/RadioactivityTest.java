import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RadioactivityTest {

  private static final Radioactivity RADIOACTIVITY_1 = new Radioactivity(1);
  private static final Radioactivity RADIOACTIVITY_2 = new Radioactivity(2);

  @Test
  void isGreaterOrEqual() {
    assertThat(RADIOACTIVITY_2.isGreaterOrEqualThan(RADIOACTIVITY_1)).isTrue();
    assertThat(RADIOACTIVITY_1.isGreaterOrEqualThan(RADIOACTIVITY_2)).isFalse();
    assertThat(RADIOACTIVITY_1.isGreaterOrEqualThan(RADIOACTIVITY_1)).isTrue();
  }

  @Test
  void isLowerThan() {
    assertThat(RADIOACTIVITY_2.isLowerThan(RADIOACTIVITY_1)).isFalse();
    assertThat(RADIOACTIVITY_1.isLowerThan(RADIOACTIVITY_2)).isTrue();
    assertThat(RADIOACTIVITY_1.isLowerThan(RADIOACTIVITY_1)).isFalse();
  }
}