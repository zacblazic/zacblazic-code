package za.ac.cput.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.assignment.adp.ADPTestSuite;
import za.ac.cput.assignment.crp.CRPTestSuite;
import za.ac.cput.assignment.dip.DIPTestSuite;
import za.ac.cput.assignment.isp.ISPTestSuite;
import za.ac.cput.assignment.lsp.LSPTestSuite;
import za.ac.cput.assignment.ocp.OCPTestSuite;
import za.ac.cput.assignment.oo.OOTestSuite;
import za.ac.cput.assignment.plk.PLKTestSuite;
import za.ac.cput.assignment.srp.SRPTestSuite;

/**
 *
 * @author Zac Blazic
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({OOTestSuite.class,
                     SRPTestSuite.class,
                     OCPTestSuite.class,
                     DIPTestSuite.class,
                     PLKTestSuite.class,
                     LSPTestSuite.class,
                     ISPTestSuite.class,
                     CRPTestSuite.class,
                     ADPTestSuite.class})
public class Assignment2TestSuite
{
}