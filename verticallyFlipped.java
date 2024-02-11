public class verticallyFlipped implements TextBlock{
    //fields
    TextBlock contents;

    //constructor
    public verticallyFlipped(TextBlock inputText){
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
        return this.contents.row(this.contents.height() - i - 1);
    };

}