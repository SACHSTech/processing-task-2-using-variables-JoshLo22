import processing.core.PApplet;

public class Sketch extends PApplet {
    
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  
  public void settings() {
    // put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
  public void setup() {
    background(0, 200, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  @Override
  public void draw() {
    fill(255, 128, 0);
    ellipse(width/4, height/4, width/2, height/2);
    ellipse(width*.75f, height/4, width/2, height/2);
    ellipse(width/4, height*.75f, width/2, height/2);
    ellipse(width*.75f, height*.75f, width/2, height/2);

    fill(255, 0, 0);
    ellipse(width/2, height/2, width/2, height/2);
  
    // Define other methods if necessary
  }
}