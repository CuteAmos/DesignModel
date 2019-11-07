package interpret.simple.expression.concrete;

import interpret.simple.context.Context;
import interpret.simple.expression.AbstractExpression;

/**
 * @author aixiaobai
 * @date 2019/11/8 0:02
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终结操作");
    }
}
