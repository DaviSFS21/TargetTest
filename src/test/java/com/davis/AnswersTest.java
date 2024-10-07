package com.davis;

import org.junit.Assert;
import org.junit.Test;

public class AnswersTest {

    @Test
    public void answer2Test() {
        Assert.assertEquals("Pertence a sequencia de Fibonacci",Answers.answer2(21));
        Assert.assertEquals("Pertence a sequencia de Fibonacci",Answers.answer2(2584));
        Assert.assertEquals("Nao pertence a sequencia de Fibonacci",Answers.answer2(75));
        Assert.assertEquals("Nao pertence a sequencia de Fibonacci",Answers.answer2(223439));
    }

    @Test
    public void answer4Test() {
        Assert.assertEquals("SP = 37.53% RJ = 20.29% MG = 16.17% ES = 15.03% Outros = 10.98%",Answers.answer4());
    }

    @Test
    public void answer5Test() {
        Assert.assertEquals("ivad",Answers.answer5("davi"));
        Assert.assertEquals("leirbag",Answers.answer5("gabriel"));
    }
}
