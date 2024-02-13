

public class Truncated implements TextBlock{
    //fields
    TextBlock contents;
    int truncatedWidth;

    //constructor
    public Truncated (TextBlock inputText, int maxWidth){
        this.contents=inputText;
        this.truncatedWidth=maxWidth;
    }

        //method
    public int height() {
        return this.contents.height();
    } // height()

    public int width() {
        return this.truncatedWidth;
    } // width()
    
    public String row(int i) throws Exception {
        // width is less or equal than 0
        if (truncatedWidth <= 0) {
            throw new Exception("wrong width for truncating");
        }
        // width is more than the length of string
        else if (truncatedWidth >= contents.width()) {
            String original = contents.row(i);
            int len = contents.width();
            return original.concat(TBUtils.spaces(truncatedWidth - len));
        }

        return this.contents.row(i).substring(0, truncatedWidth);
    };

    public boolean eqv(TextBlock other) {
        return (other instanceof Truncated) &&
                (this.truncatedWidth == ((Truncated) other).truncatedWidth) &&
                (this.contents.eqv(((Truncated) other).contents));
    }

}