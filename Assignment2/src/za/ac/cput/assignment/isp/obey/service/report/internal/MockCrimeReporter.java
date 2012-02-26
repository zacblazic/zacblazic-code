package za.ac.cput.assignment.isp.obey.service.report.internal;

import java.util.List;
import za.ac.cput.assignment.isp.obey.model.*;
import za.ac.cput.assignment.isp.obey.service.crud.CriminalRepository;

/**
 *
 * @author Zac Blazic
 */

public class MockCrimeReporter implements CrimeReporter
{
    private final CriminalRepository repository;
    
    public MockCrimeReporter(CriminalRepository repository)
    {
        this.repository = repository;
    }
    
    @Override
    public AbductionReport compileAbductionReport() 
    {
        List<Criminal> criminals = repository.findAll();
        int numberAbduction = 0;
        
        for(Criminal criminal : criminals)
        {
            for(Crime crime : criminal.getRecord())
            {
                if(crime.getCategory().equals("Abduction"))
                    numberAbduction++;
            }
        }
        
        return new AbductionReport(numberAbduction);
    }

    @Override
    public AutoTheftReport compileAutoTheftReport() 
    {
        List<Criminal> criminals = repository.findAll();
        int numberAutoTheft = 0;
        
        for(Criminal criminal : criminals)
        {
            for(Crime crime : criminal.getRecord())
            {
                if(crime.getCategory().equals("Auto Theft"))
                    numberAutoTheft++;
            }
        }
        
        return new AutoTheftReport(numberAutoTheft);
    }

    @Override
    public SexualHarrassmentReport compileSexualHarrassmentReport() 
    {
        List<Criminal> criminals = repository.findAll();
        int numberSexualHarrassement = 0;
        
        for(Criminal criminal : criminals)
        {
            for(Crime crime : criminal.getRecord())
            {
                if(crime.getCategory().equals("Sexual Harrassment"))
                    numberSexualHarrassement++;
            }
        }
        
        return new SexualHarrassmentReport(numberSexualHarrassement);
    }
}
