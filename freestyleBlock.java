

// +------+
// |hello +
// +------+

// this should turn to

// *****
// *+|+*
// *-h-*
// *-e-*
// *-l-*
// *-l-*
// *-o-*
// *****

public class freestyleBlock implements TextBlock{
    TextBlock contents;


    //constructor
    public freestyleBlock(TextBlock inputText){
        this.contents=inputText;
    }

    //method
    public int height() {
        return 2 + this.contents.width();
    } // height()

    public int width() {
        return 2 + this.contents.height();
    } // width()
    
    public String row(int i) throws Exception {
        // first row
        if (i == 0) {
            String ret = TBUtils.stars(this.width());
            return ret;
        }
        // last row
        else if (i == this.height() - 1) {
            String ret = TBUtils.stars(this.width());
            return ret;
        }
        // in between
        else {
            String ret = "";

            for (int j = 0; j < this.width()-2 ; j++) {
                String temp = this.contents.row(j).substring(i-1, i);
                ret += temp;
            }

            ret = "*" + ret + "*";
            return ret;
        }  
    };

    public boolean eqv(TextBlock other) {
        return (other instanceof freestyleBlock) &&
                (this.contents.eqv(((freestyleBlock) other).contents));
    }

}
