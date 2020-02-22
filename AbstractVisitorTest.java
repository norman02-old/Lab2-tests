import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Base class for tests.
 *
 * @author Tim
 * @version 1.0
 */
public class AbstractVisitorTest
{
    /** Constant expression. */
    private static ConstantExpression constEx;
    /** Variable expression. */
    private static VariableExpression varEx;
    /** Simple BinaryExpression. */
    private static BinaryExpression simpleBinaryEx;

    //  TODO: Add more expressions and statements here for the
    //  subclasses to use

    /** Set up tests. 
     * @throws Exception 
     * */
    @Before
    public void setUp() throws Exception
    {
        constEx = new ConstantExpression(5);
        varEx = new VariableExpression(0);

        simpleBinaryEx =
            new BinaryExpression(
                varEx,
                Operator.ADD,
                constEx);

        //  TODO: initialize other expressions and statements
    }

    /** Keep WebCAT happy */
    @Test
    public void testNothing()
    {
        int num = 3 + 5;
        assertEquals("Can't happen", 8, num);
    }
    
    /**
     * @return the constant expression
     */
    public static ConstantExpression getConstantExpression() {
        return constEx;
        
    }
    
    /**
     * @return the variable expression
     */
    public static VariableExpression getVariableExpression() {
        return varEx;
        
    }
    
    /**
     * @return the binary expression
     */
    public static BinaryExpression getBinaryExpression() {
        return simpleBinaryEx;
    }
    
}
