package test.interpret;

import interpret.simple.context.Context;
import interpret.simple.expression.AbstractExpression;
import interpret.simple.expression.concrete.NonTerminalExpression;
import interpret.simple.expression.concrete.TerminalExpression;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/8 0:05
 */
public class SimpleInterpretTest {
    @Test
    public void testSimpleInterpret(){
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        Context context = new Context();
        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }
}