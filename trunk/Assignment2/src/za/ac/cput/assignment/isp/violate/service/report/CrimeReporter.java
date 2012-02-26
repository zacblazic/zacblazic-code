package za.ac.cput.assignment.isp.violate.service.report;

import za.ac.cput.assignment.isp.violate.model.AbductionReport;
import za.ac.cput.assignment.isp.violate.model.AutoTheftReport;
import za.ac.cput.assignment.isp.violate.model.SexualHarrassmentReport;

/**
 *
 * @author Zac Blazic
 */

public interface CrimeReporter
{
    AbductionReport compileAbductionReport();
    AutoTheftReport compileAutoTheftReport();
    SexualHarrassmentReport compileSexualHarrassmentReport();
}
