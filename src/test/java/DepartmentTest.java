import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DepartmentTest {

  @Test
  void color_should_return_WHITE_when_radioactivity_is_0() {
    Radioactivity radioactivity = new Radioactivity(0);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.WHITE);
  }

  @Test
  void color_should_return_WHITE_when_radioactivity_is_2() {
    Radioactivity radioactivity = new Radioactivity(2);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.WHITE);
  }

  @Test
  void color_should_return_WHITE_when_radioactivity_is_49() {
    Radioactivity radioactivity = new Radioactivity(49);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.WHITE);
  }

  @Test
  void color_should_return_YELLOW_when_radioactivity_under_50() {
    Radioactivity radioactivity = new Radioactivity(50);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.YELLOW);
  }

  @Test
  void color_should_return_YELLOW_when_radioactivity_under_65() {
    Radioactivity radioactivity = new Radioactivity(65);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.YELLOW);
  }

  @Test
  void color_should_return_YELLOW_when_radioactivity_under_99() {
    Radioactivity radioactivity = new Radioactivity(99);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.YELLOW);
  }

  @Test
  void color_should_return_RED_when_radioactivity_under_100() {
    Radioactivity radioactivity = new Radioactivity(100);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.RED);
  }

  @Test
  void color_should_return_RED_when_radioactivity_under_149() {
    Radioactivity radioactivity = new Radioactivity(149);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.RED);
  }

  @Test
  void color_should_return_BLACK_when_radioactivity_under_150() {
    Radioactivity radioactivity = new Radioactivity(150);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.BLACK);
  }

  @Test
  void color_should_return_BLACK_when_radioactivity_under_123456() {
    Radioactivity radioactivity = new Radioactivity(123456);
    Department department = new Department(radioactivity);

    assertThat(department.color()).isEqualTo(Color.BLACK);
  }
}