package kyu_8.oop_object_oriented_piracy.java;

public class Ship {
  private final double draft;
  private final int crew;

  public Ship(double draft, int crew) {
    this.draft = draft;
    this.crew = crew;
  }

  public double getDraft() {
    return draft;
  }

  public int getCrew() {
    return crew;
  }

  public boolean isWorthIt() {
    return getDraft() - getCrew() * 1.5 > 20;
  }

  @Override
  public String toString() {
    return "Ship{" +
            "draft=" + draft +
            ", crew=" + crew +
            '}';
  }
}