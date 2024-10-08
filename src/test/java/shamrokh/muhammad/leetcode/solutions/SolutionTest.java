package shamrokh.muhammad.leetcode.solutions;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
        List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
        List<String> actual = solution.generateParenthesis(3);

        assertEquals(expected.size(), actual.size());
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }

    @Test
    @Order(2)
    @DisplayName("Test Two")
    public void testTwo(){
        List<String> expected = List.of("()");

        assertIterableEquals(expected, solution.generateParenthesis(1));
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