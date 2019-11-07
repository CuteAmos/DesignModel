package interpret.simple.expression.concrete;

import interpret.simple.context.Context;
import interpret.simple.expression.AbstractExpression;

/**
 * @author aixiaobai
 * @date 2019/11/8 0:03
 */
public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终结操作");
    }
}
