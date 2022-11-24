

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Sequence;
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
}

