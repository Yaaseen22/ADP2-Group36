/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

/**
 *
 * @author yaase
 */
public class Shoetest {

    private Shoetest Shoe1;
    private Shoetest Shoe2;
    private Shoetest Shoe3;
    
    public Shoetest() {
    }
    
    @BeforeEach
    public void setUp() {
        Shoe1 = new Shoetest();
        Shoe2 = new Shoetest();
        Shoe3 = Shoe1;
    }
    @Test
    public void testEquality(){
        assertEquals( Shoe1, Shoe3);
    
    }
    @Test
    public void testIdentity(){
        assertSame(Shoe1, Shoe2);
    }

    @Test
     @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void objectEquality(){
      assertEquals(Shoe1, Shoe2);   
    }
    
    @Test
    public void objectIdentity(){
        assertSame(Shoe1, Shoe2);
    }
    
    @Test
    public void failingTest(){
        fail("System has failed");
        System.out.println("Program has Failed");
    }
    
    @Test
    @Timeout(1)
    public void timeOuts(){
        System.out.println("Timed Out");
    }
    
    @Test
    @Disabled
    public void disablingTest(){
        System.out.println("World Disable");
    }