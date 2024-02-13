
public class RightJustified implements TextBlock{
    //fields
    TextBlock contents;
    int totalWidth;
    

    //constructor
    public RightJustified(TextBlock inputText, int centerWidth){
        this.contents=inputText;
        this.totalWidth=centerWidth;
    }

    //method
    public int height() {
        return this.contents.height();
    } // height()

    public int width() {
        return this.totalWidth;
    } // width()
    
    public String row(int i) throws Exception {
        if (totalWidth < contents.width()) {
            throw new Exception("wrong width for centered");
        }

        int padding = (totalWidth - contents.width());
        String space = TBUtils.spaces(padding);
        String ret = space + contents.row(i);

        return ret;
    };

    public boolean eqv(TextBlock other) {
        return (other instanceof RightJustified) &&
                (this.totalWidth == ((RightJustified) other).totalWidth) &&
                (this.contents.eqv(((RightJustified) other).contents));
    }
}