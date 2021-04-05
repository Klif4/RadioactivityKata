public class Radioactivity {
  private final int value;

  public Radioactivity(int value) {
    this.value = value;
  }

  public boolean isGreaterOrEqualThan(Radioactivity other) {
    return this.value >= other.value;
  }

  public boolean isLowerThan(Radioactivity other) {
    return this.value < other.value;
  }
}
