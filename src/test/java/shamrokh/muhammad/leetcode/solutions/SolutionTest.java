package shamrokh.muhammad.leetcode.solutions;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {

    Solution solution;
    @BeforeEach
    public void init(){
        solution = new Solution();
    }

    @Test
    @Order(1)
    @DisplayName("Test one")
    public void testOne(){
        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        assertEquals(-42, solution.myAtoi(" -042"));
    }

    @Test
    @Order(3)
    @DisplayName("Test Three")
    public void testThree(){
        assertEquals(1337, solution.myAtoi("1337c0d3"));
    }

    @Test
    @Order(4)
    @DisplayName("Test Four")
    public void testFour(){
        assertEquals(0, solution.myAtoi("0-1"));
    }

    @Test
    @Order(5)
    @DisplayName("Test Five")
    public void testFive(){
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-2147483649"));
    }


}