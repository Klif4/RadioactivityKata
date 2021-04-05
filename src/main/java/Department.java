public class Department {
  private final Radioactivity radioactivity;

  public Department(Radioactivity radioactivity) {
    this.radioactivity = radioactivity;
  }

  public Color color() {
    return Color.getForRadioactivity(radioactivity);
  }
}
