package org.advent.day5;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestDay5Part2Solution {

    Day5Part2Solution solution;
    @Test
    void test_solution() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("day5-input-sample.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        solution = new Day5Part2Solution(reader);
        assertThat(solution.lowestLocationNumber(), equalTo(new BigInteger(String.valueOf(46))));
    }

    @Test
    void test_solution_puzzle_input() { // 1hr 13mins
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("day5-input.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        solution = new Day5Part2Solution(reader);
        assertThat(solution.lowestLocationNumber(), equalTo(new BigInteger(String.valueOf(46))));
    }
}
