//package csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class Test2{
  /**
   * A test that should succeed.
   * @throws Exception 
   */
  @Test
  void truncatedTest() throws Exception {
    assertEquals("+--",(new Truncated(new BoxedBlock(new TextLine("hello")),3)).row(0));
    assertEquals("|he",(new Truncated(new BoxedBlock(new TextLine("hello")),3)).row(1));
  } 

  @Test
  void centeredTest() throws Exception {
    assertEquals(" +-----+  ",(new Centered(new BoxedBlock(new TextLine("hello")),10)).row(0));
    assertEquals(" |hello|  ",(new Centered(new BoxedBlock(new TextLine("hello")),10)).row(1));
  } 

  @Test
  void RightJustifiedTest() throws Exception {
    assertEquals("   +-----+",(new RightJustified(new BoxedBlock(new TextLine("hello")),10)).row(0));
    assertEquals("   |hello|",(new RightJustified(new BoxedBlock(new TextLine("hello")),10)).row(1));
  } 
  
  @Test
  void horizontallyFlippedTest() throws Exception {
    assertEquals("+-----+",(new horizontallyFlipped(new BoxedBlock(new TextLine("hello")))).row(0));
    assertEquals("|olleh|",(new horizontallyFlipped(new BoxedBlock(new TextLine("hello")))).row(1));
  } 

  @Test
  void verticallyFlippedTest()throws Exception {
    assertEquals("+-----+",(new verticallyFlipped(new BoxedBlock(new TextLine("hello")))).row(0));
    assertEquals("|hello|",(new verticallyFlipped(new BoxedBlock(new TextLine("hello")))).row(1));
  } 


  @Test
  void equalTest() throws Exception {
    assertEquals(true, TBUtils.equal(new BoxedBlock(new TextLine("hello")), new BoxedBlock(new TextLine("hello"))));
    assertEquals(true, TBUtils.equal(new BoxedBlock(new TextLine("hello")), (new horizontallyFlipped(new horizontallyFlipped (new BoxedBlock(new TextLine("hello")))))));
  } 

  @Test
  void eqTest() throws Exception {
    assertEquals(false, TBUtils.eq(new BoxedBlock(new TextLine("hello")), new BoxedBlock(new TextLine("hello"))));
    assertEquals(false, TBUtils.eq((new horizontallyFlipped(new horizontallyFlipped (new BoxedBlock(new TextLine("hello"))))),new BoxedBlock(new TextLine("hello")) ));
  } 

  @Test
  void eqvTest() throws Exception {
    assertEquals(true, TBUtils.eqv(new BoxedBlock(new TextLine("hello")), new BoxedBlock(new TextLine("hello"))));
    assertEquals(false, TBUtils.eqv((new horizontallyFlipped(new horizontallyFlipped (new BoxedBlock(new TextLine("hello"))))),new BoxedBlock(new TextLine("hello")) ));
  } 
  

} // class TestSampleMethods