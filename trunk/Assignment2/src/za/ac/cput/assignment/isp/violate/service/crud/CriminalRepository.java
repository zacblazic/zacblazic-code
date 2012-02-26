package za.ac.cput.assignment.isp.violate.service.crud;

import java.util.List;
import za.ac.cput.assignment.isp.violate.model.Criminal;

/**
 *
 * @author Zac Blazic
 */

public interface CriminalRepository
{
    void persist(Criminal criminal);
    Criminal findById(long id);
    List<Criminal> findAll();
}
