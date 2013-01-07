import java.util.ArrayList;

/**
 * A sequence a move for the IA.
 *  
 * @author tdebroc
 * @version 1.0
 */
public class ScoreSequence {
  long score = 0;
  ArrayList<Integer> sequence = new ArrayList<Integer>();
  
  
  public long getScore() {
    return score;
  }
  public void setScore(int score) {
    this.score = score;
  }
  public ArrayList<Integer> getSequence() {
    return sequence;
  }
  public void setSequence(ArrayList<Integer> sequence) {
    this.sequence = sequence;
  }
  public ScoreSequence(long score, ArrayList<Integer> sequence) {
    super();
    this.score = score;
    this.sequence = sequence;
  }
  
  public ScoreSequence(long score, int firstOfSequence) {
    super();
    this.score = score;
    this.sequence = new ArrayList<Integer>();
    this.sequence.add(firstOfSequence);
  }
  
  
  
}
