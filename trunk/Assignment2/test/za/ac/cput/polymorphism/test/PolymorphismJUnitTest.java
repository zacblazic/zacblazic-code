package za.ac.cput.polymorphism.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.polymorphism.Connection;
import za.ac.cput.polymorphism.DatabaseConnection;
import za.ac.cput.polymorphism.MySQLDatabaseConnection;

/**
 *
 * @author Zac Blazic
 */

public class PolymorphismJUnitTest
{
    public PolymorphismJUnitTest()
    {
    }
    
    @Test
    public void testOpenConnection()
    {
        MySQLDatabaseConnection mysqlConnection = new MySQLDatabaseConnection();
        DatabaseConnection dbConnection = mysqlConnection;
        Connection connection = dbConnection;
        connection.open();
        
        Assert.assertFalse(connection.isClosed());
    }
    
    @Test
    public void testCloseConnection()
    {
        MySQLDatabaseConnection mysqlConnection = new MySQLDatabaseConnection();
        DatabaseConnection dbConnection = mysqlConnection;
        Connection connection = dbConnection;
        connection.open();
        connection.close();
        
        Assert.assertTrue(connection.isClosed());
    }
}