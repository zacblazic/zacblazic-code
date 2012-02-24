package za.ac.cput.assignment.oo.encapsulation.model;

/**
 *
 * @author Zac Blazic
 */

public final class Document
{
    private final String name;
    private final String type;
    private final int numberPages;
    
    public Document(String name, String type, int numberPages)
    {
        this.name = name;
        this.type = type;
        this.numberPages = numberPages;
    }

    public String getName() 
    {
        return name;
    }

    public int getNumberPages() {
        return numberPages;
    }
    
    public String getType() 
    {
        return type;
    }

    @Override
    public String toString()
    {
        return this.name + "." + this.type;
    }
}
