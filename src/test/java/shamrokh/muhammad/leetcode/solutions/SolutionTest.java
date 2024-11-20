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
    @DisplayName("Equal lists (ignoring order)")
    public void testOne(){
        //Input: dividend = 10, divisor = 3
        //Output: 3
        //Explanation: 10/3 = 3.33333.. which is truncated to 3.
        assertEquals(3, solution.divide(10, 3));
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        //Input: dividend = 7, divisor = -3
        //Output: -2
        //Explanation: 7/-3 = -2.33333.. which is truncated to -2.
        assertEquals(-2, solution.divide(7, -3));
    }

    @Test
    @Order(3)
    @DisplayName("Test Three")
    public void testThree(){

    }

    @Test
    @Order(4)
    @DisplayName("Test Four")
    public void testFour(){
    }

    @Test
    @Order(5)
    @DisplayName("Test Five")
    public void testFive(){
    }


}