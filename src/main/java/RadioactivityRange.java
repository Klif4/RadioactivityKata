import lombok.NonNull;

public class RadioactivityRange {

  @NonNull
  private final Radioactivity minRadioactivity;

  @NonNull
  private final Radioactivity maxRadioactivity;

  public RadioactivityRange(int minRadioactivity, int maxRadioactivity) {
    this.minRadioactivity = new Radioactivity(minRadioactivity);
    this.maxRadioactivity = new Radioactivity(maxRadioactivity);
  }

  public boolean contains(Radioactivity radioactivity) {
    return radioactivity.isGreaterOrEqualThan(minRadioactivity) && radioactivity.isLowerThan(maxRadioactivity);
  }
}
