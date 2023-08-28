package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(String s, String answer) {
        // when
        String result = solution.solution(s);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test @DisplayName("Test 1")
    void testcase1() {
        // given
        String s = "1 2 3 4";
        String answer = "1 4";

        // when & then
        assertAnswer(s, answer);
    }

    @Test @DisplayName("Test 2")
    void testcase2() {
        // given
        String s = "-1 -2 -3 -4";
        String answer = "-4 -1";

        // when & then
        assertAnswer(s, answer);
    }

    @Test @DisplayName("Test 3")
    void testcase3() {
        // given
        String s = "-1 -1";
        String answer = "-1 -1";

        // when & then
        assertAnswer(s, answer);
    }
}