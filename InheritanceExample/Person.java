//John French

public class Person
{
//  Member Variables  ===========================================
	private String firstName;
    private String lastName;

//  Member Methods  =============================================
   	public Person()
    {
        System.out.println("SUPER CLASS CONSTRUCTOR GOT CALLED!!");
        this.firstName = "A.N.";
        this.lastName = "Other";
    }

  	public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   	public void setName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   	public String getFirstName()
    {
        return firstName ;
    }

 	public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

   	public String getLastName()
    {
        return lastName ;
    }

   	public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

	public String toString()
	{
		return (firstName + " " + lastName);
	}
}
