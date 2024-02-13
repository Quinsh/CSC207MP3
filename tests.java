import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class tests {

    void equalTest() {
        // normal case:
        TextLine str1 = new TextLine("some string");
        TextLine str2 = new TextLine("some string");
        assertTrue(str1.equals(str2));

        // normal case:
        TextLine str3 = new TextLine("some string1");
        TextLine str4 = new TextLine("some string2");
        assertFalse(str1.equals(str2));
        
        // same string but built differently:
        horizontallyFlipped flippedpalindrome = new horizontallyFlipped(new TextLine ("heh"));
        TextLine palindrome = new TextLine("heh");
        assertTrue(palindrome.equals(flippedpalindrome));
    }

    void eqvTest() {
        // normal case:
        TextBlock block1 = new BoxedBlock(new BoxedBlock(new BoxedBlock(new TextLine("hello"))));
        TextBlock block2 = new BoxedBlock(new TextLine("hello"));
        assertFalse(block1.eqv(block2));
        
        // same text but built differently:
        horizontallyFlipped flippedpalindrome = new horizontallyFlipped(new TextLine("heh"));
        TextLine palindrome = new TextLine("heh");
        assertFalse(palindrome.eqv(flippedpalindrome));
    }

    void eqTest() {
        // no two things are eq:
        TextLine str5 = new TextLine("hello");
        TextLine str6 = new TextLine("hello");
        assertFalse(TBUtils.eq(str5, str6));
        
        // two things are eq iff they are same objects.
        assertTrue(TBUtils.eq(str5, str5));
    }

}
