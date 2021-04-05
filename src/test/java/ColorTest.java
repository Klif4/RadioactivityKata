import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ColorTest {

  @Test
  void WHITE_for_0() {
    Radioactivity radioactivity = new Radioactivity(0);
    Color color = Color.getForRadioactivity(radioactivity);
    assertThat(color).isEqualTo(Color.WHITE);
  }

  @Test
  void WHITE_for_12() {
    Radioactivity radioactivity = new Radioactivity(12);
    Color color = Color.getForRadioactivity(radioactivity);
    assertThat(color).isEqualTo(Color.WHITE);
  }

  @Test
  void WHITE_for_49() {
    Radioactivity radioactivity = new Radioactivity(49);
    Color color = Color.getForRadioactivity(radioactivity);
    assertThat(color).isEqualTo(Color.WHITE);
  }

  @Test
  void YELLOW_for_50() {
    Radioactivity radioactivity = new Radioactivity(50);
    Color color = Color.getForRadioactivity(radioactivity);
    assertThat(color).isEqualTo(Color.YELLOW);
  }
}