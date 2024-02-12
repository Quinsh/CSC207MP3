public class horizontallyFlipped implements TextBlock{
    //fields
    TextBlock contents;

    //constructor
    public horizontallyFlipped(TextBlock inputText){
        this.contents=inputText;
    }

    //method
    public int height() {
        return this.contents.height();
    } // height()

    public int width() {
        return this.contents.width();
    } // width()
    
    public String row(int i) throws Exception {
        StringBuilder reversed = new StringBuilder();
        reversed.append(this.contents.row(i));
        reversed.reverse();

        return reversed.toString();
    };

    public boolean eqv(TextBlock other) {
        return (other instanceof horizontallyFlipped);
    }

}