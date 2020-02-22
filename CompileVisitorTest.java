import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for CompileVisitor.
 *
 * @author Tim
 * @version 1.0
 */
public class CompileVisitorTest extends AbstractVisitorTest
{
    private ConstantExpression constEx = AbstractVisitorTest
            .getConstantExpression();
    private VariableExpression varEx = AbstractVisitorTest
            .getVariableExpression();
    private BinaryExpression simpleBinaryEx = AbstractVisitorTest
            .getBinaryExpression();
    /** Test simple expressions. */
    @Test
    public void testSimpleExpressions()
    {
        //  The expressions we're testing are defined in AbstractVisitorTest
        CompileVisitor v = new CompileVisitor();
        constEx.accept(v);
        assertEquals("Hint: CompileVisitor failed for const expression",
            "i32.const 5\n",
            v.getString());

        v = new CompileVisitor();
        varEx.accept(v);
        assertEquals("Hint: CompileVisitor failed for variable expression",
            "get_global 0\n",
            v.getString());

        v = new CompileVisitor();
        simpleBinaryEx.accept(v);
        assertEquals("Hint: CompileVisitor failed for simple binary expression",
            "get_global 0\n" +
            "i32.const 5\n" +
            "i32.add\n",
            v.getString());
    }
}
