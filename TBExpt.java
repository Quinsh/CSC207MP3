import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock txt1 = new TextLine("Hello");
    TextBlock txt2 = new TextLine("GoodBye");

    TextBlock box = new VComposition(new BoxedBlock(txt1), new BoxedBlock(txt2));
    
    TextBlock rev = new verticallyFlipped(box);
    
    // Print out the block
    TBUtils.print(pen, rev);

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
