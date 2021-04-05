import static java.util.Arrays.stream;

public enum Color {
  WHITE(new RadioactivityRange(0, 50)),
  YELLOW(new RadioactivityRange(50, 100)),
  RED(new RadioactivityRange(100, 150)),
  BLACK(new RadioactivityRange(150, Integer.MAX_VALUE));

  private final RadioactivityRange radioactivityRange;

  Color(RadioactivityRange radioactivityRange) {
    this.radioactivityRange = radioactivityRange;
  }

  public static Color getForRadioactivity(Radioactivity radioactivity) {
    return stream(Color.class.getEnumConstants())
        .filter(color -> color.radioactivityRange.contains(radioactivity))
        .findFirst()
        .orElseThrow(RuntimeException::new);
  }

}
