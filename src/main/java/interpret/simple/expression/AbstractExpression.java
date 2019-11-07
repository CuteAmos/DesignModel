package interpret.simple.expression;

import interpret.simple.context.Context;

/**
 * 解释器模式
 * 抽象表达式，声明一个抽象的解释操作，该接口为抽象语法树中所有的节点所共享
 * @author aixiaobai
 * @date 2019/11/7 23:57
 */
public abstract class AbstractExpression {
    /**
     * 抽象解释接口
     * @param context 上下文
     */
    public abstract void interpret(Context context);
}
