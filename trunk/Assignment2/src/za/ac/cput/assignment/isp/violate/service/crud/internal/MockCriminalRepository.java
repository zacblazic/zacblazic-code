package za.ac.cput.assignment.isp.violate.service.crud.internal;

import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment.isp.violate.model.Criminal;
import za.ac.cput.assignment.isp.violate.service.crud.CriminalRepository;

/**
 *
 * @author Zac Blazic
 */

public class MockCriminalRepository implements CriminalRepository
{
    private final List<Criminal> criminals = new ArrayList<Criminal>();
    
    public MockCriminalRepository()
    {
    }
    
    @Override
    public void persist(Criminal criminal) 
    {
        criminals.add(criminal);
    }

    @Override
    public Criminal findById(long id) 
    {
        for(Criminal c : criminals)
        {
            if(c.getId() == id)
                return c;
        }
        
        return null;
    }

    @Override
    public List<Criminal> findAll() 
    {
        return criminals;
    }
}
