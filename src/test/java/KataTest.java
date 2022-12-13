

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Sequence;
import java.awt.print.Paper;
import java.util.Random;

public class KataTest {

        @Test
        public void test1() {
            System.out.println("Fixed Tests Player 1 won!");
            assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
            assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
            assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
        }
        @Test
        public void test2() {
            System.out.println("Fixed Tests Player 2 won!");
            assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
            assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
            assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
        }
        @Test
        public void test3() {
            System.out.println("Fixed Tests Draw!");
            assertEquals("Draw!", Kata.rps("scissors", "scissors"));
            assertEquals("Draw!", Kata.rps("paper", "paper"));
            assertEquals("Draw!", Kata.rps("rock", "rock"));
        }

        @Test
        public void testSolution() {
            assertEquals("############5616", Kata.maskify("4556364607935616"));
            assertEquals("#######5616",      Kata.maskify(     "64607935616"));
            assertEquals("1",                Kata.maskify(               "1"));
            assertEquals("",                 Kata.maskify(                ""));

            // "What was the name of your first pet?"
            assertEquals("##ippy",                                    Kata.maskify("Skippy")                                  );
            assertEquals("####################################man!",  Kata.maskify("Nananananananananananananananana Batman!"));
        }

        @Test
        public void testCase1() {
            assertEquals("Nope!", 5, Kata.getCount("abracadabra"));
            assertEquals("Nope!", 0, Kata.getCount(""));
            assertEquals("Nope!", 4, Kata.getCount("pear tree"));
            assertEquals("Nope!", 13, Kata.getCount("o a kak ushakov lil vo kashu kakao"));
            assertEquals("Nope!", 168, Kata.getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
        }

        @Test
        public void setAlarmTest() {
            assertTrue("Should be true.", Kata.setAlarm(true, false));
            assertFalse("Should be false.", Kata.setAlarm(true, true));
            assertFalse("Should be false.", Kata.setAlarm(false, false));
            assertFalse("Should be false.", Kata.setAlarm(false, true));
        }

        @Test
        public void testExamples() {
            assertEquals(-110, Kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
            assertEquals(0, Kata.min(new int[]{42, 54, 65, 87, 0}));
            assertEquals(566, Kata.max(new int[]{4,6,2,1,9,63,-134,566}));
            assertEquals(5, Kata.max(new int[]{5}));
        }

        @Test
        public void testPallindrome(){
            assertEquals(false, Kata.isPal(1212));
            assertEquals(false, Kata.isPal(234231334));
            assertEquals(true, Kata.isPal(2112));
            assertEquals(true, Kata.isPal(21344312));
        }

        @Test
        public void canSum(){
            assertEquals(15, Kata.sumNumber(new int[]{1, 2, 3, 4, 5}));
        }

        @Test
        public void testSomething() {
            assertEquals(1, Kata.strCount("Hello", 'o'));
            assertEquals(2, Kata.strCount("Hello", 'l'));
            assertEquals(0, Kata.strCount("",'z'));
        }

        @Test
        public void simpleTest() {
            assertArrayEquals(new int[]{5,4,3,2,1}, Kata.reverse(5));
        }

    @Test
    public void checkSmallValues() {
        assertEquals(6, Kata.expressionsMatter(2, 1, 2));
        assertEquals(3, Kata.expressionsMatter(1, 1, 1));
        assertEquals(4, Kata.expressionsMatter(2, 1, 1));
        assertEquals(9, Kata.expressionsMatter(1, 2, 3));
        assertEquals(5, Kata.expressionsMatter(1, 3, 1));
        assertEquals(8, Kata.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals( 20, Kata.expressionsMatter(5, 1, 3));
        assertEquals(105, Kata.expressionsMatter(3, 5, 7));
        assertEquals( 35, Kata.expressionsMatter(5, 6, 1));
        assertEquals(  8, Kata.expressionsMatter(1, 6, 1));
        assertEquals( 14, Kata.expressionsMatter(2, 6, 1));
        assertEquals( 48, Kata.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals( 60, Kata.expressionsMatter( 2, 10,  3));
        assertEquals( 27, Kata.expressionsMatter( 1,  8,  3));
        assertEquals(126, Kata.expressionsMatter( 9,  7,  2));
        assertEquals( 20, Kata.expressionsMatter( 1,  1, 10));
        assertEquals( 18, Kata.expressionsMatter( 9,  1,  1));
        assertEquals(300, Kata.expressionsMatter(10,  5,  6));
        assertEquals( 12, Kata.expressionsMatter( 1, 10,  1));
    }

//    @Test
//    public void exampleCases() {
//        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
//        assertEquals("elppa", Kata.reverseWords("apple"));
//        assertEquals("a b c d", Kata.reverseWords("a b c d"));
//        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords("double  spaced  words"));
//        assertEquals("    ", Kata.reverseWords("    "));
//    }
    @Test
    public void tests() {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        assertEquals("found the needle at position 3", Kata.findNeedle(haystack1));
        assertEquals("found the needle at position 5", Kata.findNeedle(haystack2));
        assertEquals("found the needle at position 30", Kata.findNeedle(haystack3));
    }

    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1,5}, Kata.minMax(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5, 2334454}, Kata.minMax(new int[]{2334454,5}));
        assertArrayEquals(new int[]{1, 1}, Kata.minMax(new int[]{1}));
    }

    Random rand;
    @Before
    public void initTest() {
        rand = new Random();
    }
    @Test
    public void minMaxRandomTest() {
        for(int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, Kata.minMax(new int[]{r}));
        }
    }

    @Test
    public void basicTests() {
        assertEquals(true, Kata.checkForFactor(10, 2));
        assertEquals(true, Kata.checkForFactor(63, 7));
        assertEquals(true, Kata.checkForFactor(2450, 5));
        assertEquals(true, Kata.checkForFactor(24612, 3));
    }

    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Kata.stray(numbers);
    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Kata.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Kata.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Kata.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testOtherAngle() {
        assertEquals(123, Kata.otherAngle(45,12));
        assertEquals(70, Kata.otherAngle(50,60));
    }

    @Test
    public void testSomethingElse() {
        assertEquals(16, Kata.areaOrPerimeter(4 , 4));
        assertEquals(32, Kata.areaOrPerimeter(6 , 10));
    }

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", Kata.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", Kata.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", Kata.toJadenCase(""));
    }

    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", Kata.greet("english"));
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Kata.greet("dutch"));
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Kata.greet("IP_ADDRESS_INVALID"));
    }

    @Test public void testSomethingNew() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Kata.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Kata.noSpace("8j aam"));
    }

    @Test
    public void sampleTestCases() {
        assertEquals(14, Kata.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, Kata.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, Kata.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, Kata.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, Kata.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }

    @Test
    public void testSomething1() {
        assertEquals(true, Kata.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, Kata.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, Kata.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, Kata.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, Kata.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, Kata.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, Kata.getXO("Xxxxertr34"));
    }

    @Test
    public void testo1(){
        assertEquals("Failed at paperWork(5,5)",25, Kata.paperWork(5,5));
    }

    @Test
    public void testo2(){
        assertEquals("Failed at paperWork(5,-5)",0, Kata.paperWork(5,-5));
    }

    @Test
    public void testo3(){
        assertEquals("Failed at paperWork(-5,-5)",0, Kata.paperWork(-5,-5));
    }

    @Test
    public void testo4(){
        assertEquals("Failed at paperWork(-5,5)",0, Kata.paperWork(-5,5));
    }

    @Test
    public void testo5(){
        assertEquals("Failed at paperWork(5,0)",0, Kata.paperWork(5,0));
    }
    @Test
    public void basicTests2() {
        assertEquals(-1, Kata.nthPower(new int[] {1,2}, 2));
        assertEquals(8, Kata.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, Kata.nthPower(new int[] {3,1,2}, 2));
    }

    @Test
    public void testBasic() {
        assertEquals("'add' should return the two numbers added together!", 3, Kata.arithmetic(1, 2, "add"));
        assertEquals("'subtract' should return a minus b!", 6, Kata.arithmetic(8, 2, "subtract"));
        assertEquals("'multiply' should return a multiplied by b!", 10, Kata.arithmetic(5, 2, "multiply"));
        assertEquals("'divide' should return a divided by b!", 4, Kata.arithmetic(8, 2, "divide"));
    }

    @Test
    public void test_factorial0() {
        assertEquals(1, Kata.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, Kata.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, Kata.factorial(5));
    }

    @Test
    public void publicTests() {
//        assertEquals(true, Kata.isTriangle(1,2,2));
        assertEquals(false, Kata.isTriangle(7,2,2));
    }

//    @Test
//    public void testEmptyArray() throws Exception {
//        assertEquals("Empty arrays should have a max of 0", 0, Kata.sequence(new int[]{}));
//    }
//    @Test
//    public void testExampleArray() throws Exception {
//        assertEquals("Example array should have a max of 6", 6, Kata.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//    }

    @Test
    public void testBasicss() {
        assertFalse("0  is not prime", Kata.isPrime(0));
        assertFalse("1  is not prime", Kata.isPrime(1));
        assertTrue ("2  is prime",     Kata.isPrime(2));
        assertTrue ("73 is prime",     Kata.isPrime(73));
        assertFalse("75 is not prime", Kata.isPrime(75));
        assertFalse("-1 is not prime", Kata.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Kata.isPrime(3));
        assertTrue("5 is prime", Kata.isPrime(5));
        assertTrue("7 is prime", Kata.isPrime(7));
        assertTrue("41 is prime", Kata.isPrime(41));
        assertTrue("5099 is prime", Kata.isPrime(5099));
    }

    @Test
    public void testNotPrime() {
        assertFalse("4 is not prime", Kata.isPrime(4));
        assertFalse("6 is not prime", Kata.isPrime(6));
        assertFalse("8 is not prime", Kata.isPrime(8));
        assertFalse("9 is not prime", Kata.isPrime(9));
        assertFalse("45 is not prime", Kata.isPrime(45));
        assertFalse("-5 is not prime", Kata.isPrime(-5));
        assertFalse("-8 is not prime", Kata.isPrime(-8));
        assertFalse("-41 is not prime", Kata.isPrime(-41));
    }

    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(
                new int[] { 20, 37, 21 },
                Kata.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                Kata.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                Kata.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                Kata.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                Kata.deleteNth( new int[] { }, 5 )
        );

    }

    @Test
    public void testNormalCondition() {
        assertEquals(9, Kata.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Kata.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Kata.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }
}

