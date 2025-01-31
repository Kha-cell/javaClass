import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaculator {
    @Test
    public void test_Add() {
    Caculator caculator = new Caculator();
    int summation = caculator.add(4,  4);
    assertEquals(8, summation);





 }


}
