package test;

import main.BalancedBrackets;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    // 1
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // 2
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // 3
    @Test
    public void oneLeftBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    // 4
    @Test
    public void oneRightBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // 5
    @Test
    public void onlyBackwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // 6
    @Test
    public void longStringWithBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("package test;\n" +
                "\n" +
                "import main.BalancedBrackets;\n" +
                "import org.junit.Assert;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "import static org.junit.Assert.*;\n" +
                "\n" +
                "public class BalancedBracketsTest {\n" +
                "\n" +
                "    //TODO: add tests here\n" +
                "    @Test\n" +
                "    public void emptyTest() {\n" +
                "        assertEquals(true, true);\n" +
                "    }\n" +
                "    // 1\n" +
                "    @Test\n" +
                "    public void onlyBracketsReturnsTrue(){\n" +
                "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"[]\"));\n" +
                "    }\n" +
                "\n" +
                "    // 2\n" +
                "    @Test\n" +
                "    public void emptyStringReturnsTrue(){\n" +
                "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"\"));\n" +
                "    }\n" +
                "\n" +
                "    // 3\n" +
                "    @Test\n" +
                "    public void oneLeftBracketReturnsFalse(){\n" +
                "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"[\"));\n" +
                "    }\n" +
                "\n" +
                "    // 4\n" +
                "    @Test\n" +
                "    public void oneRightBracketReturnsFalse(){\n" +
                "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"]\"));\n" +
                "    }"));
    }
        // 7
        @Test
        public void longStringWithUnBalancedRightBracketReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("package test;\n" +
                    "\n" +
                    "import main.BalancedBrackets;\n" +
                    "import org.junit.Assert;\n" +
                    "import org.junit.Test;\n" +
                    "\n" +
                    "import static org.junit.Assert.*;\n" +
                    "\n" +
                    "public class BalancedBracketsTest {\n" +
                    "\n" +
                    "    //TODO: add tests here\n" +
                    "    @Test\n" +
                    "    public void emptyTest() {\n" +
                    "        assertEquals(true, true);\n" +
                    "    }\n" +
                    "    // 1\n" +
                    "    @Test\n" +
                    "    public void onlyBracketsReturnsTrue(){\n" +
                    "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"[]\"));\n" +
                    "    }\n" +
                    "\n" +
                    "    // 2\n" +
                    "    @Test\n" +
                    "    public void emptyStringReturnsTrue(){\n" +
                    "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"\"));\n" +
                    "    }\n" +
                    "\n" +
                    "    // 3\n" +
                    "    @Test\n" +
                    "    public void oneLeftBracketReturnsFalse(){\n" +
                    "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"[\"));\n" +
                    "    }\n" +
                    "\n" +
                    "    // 4\n" +
                    "    @Test\n" +
                    "    public void oneRightBracketReturnsFalse(){\n" +
                    "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"]\"));\n" +
                    "    }]"));
    }

    // 8
    @Test
    public void longStringWithUnBalancedLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("package test;\n" +
                "\n" +
                "import main.BalancedBrackets;\n" +
                "import org.junit.Assert;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "import static org.junit.Assert.*;\n" +
                "\n" +
                "public class BalancedBracketsTest {\n" +
                "\n" +
                "    //TODO: add tests here\n" +
                "    @Test\n" +
                "    public void emptyTest() {\n" +
                "        assertEquals(true, true);\n" +
                "    }\n" +
                "    // 1\n" +
                "    @Test\n" +
                "    public void onlyBracketsReturnsTrue(){\n" +
                "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"[]\"));\n" +
                "    }\n" +
                "\n" +
                "    // 2\n" +
                "    @Test\n" +
                "    public void emptyStringReturnsTrue(){\n" +
                "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"\"));\n" +
                "    }\n" +
                "\n" +
                "    // 3\n" +
                "    @Test\n" +
                "    public void oneLeftBracketReturnsFalse(){\n" +
                "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"[\"));\n" +
                "    }\n" +
                "\n" +
                "    // 4\n" +
                "    @Test\n" +
                "    public void oneRightBracketReturnsFalse(){\n" +
                "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"]\"));\n" +
                "    }["));
    }

    // 9
    @Test
    public void longStringWithBalancedBackwardBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("package test;\n" +
                "\n" +
                "import main.BalancedBrackets;\n" +
                "import org.junit.Assert;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "import static org.junit.Assert.*;\n" +
                "\n" +
                "public class BalancedBracketsTest {\n" +
                "\n" +
                "    //TODO: add tests here\n" +
                "    @Test\n" +
                "    public void emptyTest() {\n" +
                "        assertEquals(true, true);\n" +
                "    }\n" +
                "    // 1\n" +
                "    @Test\n" +
                "    public void onlyBracketsReturnsTrue(){\n" +
                "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"[]\"));\n" +
                "    }\n" +
                "\n" +
                "    // 2\n" +
                "    @Test\n" +
                "    public void emptyStringReturnsTrue(){\n" +
                "        assertTrue(BalancedBrackets.hasBalancedBrackets(\"\"));\n" +
                "    }\n" +
                "\n" +
                "    // 3\n" +
                "    @Test\n" +
                "    public void oneLeftBracketReturnsFalse(){\n" +
                "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"[\"));\n" +
                "    }\n" +
                "\n" +
                "    // 4\n" +
                "    @Test\n" +
                "    public void oneRightBracketReturnsFalse(){\n" +
                "        assertFalse(BalancedBrackets.hasBalancedBrackets(\"]\"));\n" +
                "    }" +
                "Launch][" ));
    }
}
