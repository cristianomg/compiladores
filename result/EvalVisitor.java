import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();

        int value = visit(ctx.expr());

        memory.put(id, value);

        return value;

    }

    @java.lang.Override
    public Integer visitIfStat(LabeledExprParser.IfStatContext ctx) {
        int condition = visit(ctx.expr());

        if (condition == 1)
            visit(ctx.prog(0));
        else
            visit(ctx.prog(1));
        return 0;
    }

    @java.lang.Override
    public Integer visitWhileStat(LabeledExprParser.WhileStatContext ctx) {
        int condition = visit(ctx.expr());
        while (condition == 1){
            visit(ctx.prog());
            condition = visit(ctx.expr());
        }
        return 0;
    }

    @java.lang.Override
    public Integer visitPrintln(LabeledExprParser.PrintlnContext ctx) {
        int value = visit(ctx.expr());

        System.out.println(value);

        return 0;
    }

    @java.lang.Override
    public Integer visitAndExpr(LabeledExprParser.AndExprContext ctx) {
        return ((visit(ctx.expr(0)) == 1) && (visit(ctx.expr(1)) == 1)) ? 1 : 0;
    }

    /** INT */
    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @java.lang.Override
    public Integer visitOrExpr(LabeledExprParser.OrExprContext ctx) {
        return ((visit(ctx.expr(0)) == 1) || (visit(ctx.expr(1)) == 1)) ? 1 : 0;
    }

    /** ID */
    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if(memory.containsKey(id)) return memory.get(id);

        return 0;
    }

    @java.lang.Override
    public Integer visitRelationalExpr(LabeledExprParser.RelationalExprContext ctx) {
        int left = visit(ctx.expr(0));

        int right = visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.GT:
                return left > right ? 1 : 0;
            case LabeledExprParser.GTEQ:
                return left >= right ? 1 : 0;
            case LabeledExprParser.LT:
                return left < right ? 1 : 0;
            case LabeledExprParser.LTEQ:
                return left <= right ? 1 : 0;
            default:
                return 0;
        }
    }


    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));

        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LabeledExprParser.MUL) return left * right;

        return left / right;
    }

    /** expr op=('+' | '-') */
    @Override
    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));


        if(ctx.op.getType() == LabeledExprParser.ADD) return left + right;

        return left - right;

    }
    /** '(' expr ')' */
    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @java.lang.Override
    public Integer visitEqualityExpr(LabeledExprParser.EqualityExprContext ctx) {
        int left = visit(ctx.expr(0));

        int right = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case LabeledExprParser.EQUALS:
                return left == right ? 1 : 0;
            case LabeledExprParser.NEQ:
                return left != right ? 1 : 0;
            default:
                return 0;
        }
    }

}