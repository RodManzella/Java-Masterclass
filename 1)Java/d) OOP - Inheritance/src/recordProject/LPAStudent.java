package recordProject;

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
    
}

// we´ve replaced the multiple lines of code, that we have in Student.java, with these 2 lines of code in LPAStudent.java.
    // Now, the truth is, the record LPAStudent doesn´t have or support setters methods, but the other functionality, calling the
    // constructor with 4 parameters, and printing the data out, is implictly part of the record.

    //What´s really happening here? What does Java tell us about what is implicitly created, when we declare a record as we did in this code?

    // First, it´s important to understand that the part that´s in parentehses, is called the record header.
    // The record header consists of record components, a comma delimited list of components.
    // For each component in the header, Java generates:
    //  - A field with the same name and declared type as the record component.
    //      The field is declared private and final. We´ll be talking about final later, but simply put, it means the field can´t be modified.
    //      The field is sometimes referred to as a component field.

    //  - Java generates a toString method that prints out each attribute in a formatted String
    //  - In addition to creating a private final field for each component, Java generates a public acessor method for each component.
    //      this method has the same name and type of the component, but it doesn´t have any kind of special prefix, no get, or is, for example.
    //      The acessor method, for id in this example, is simply id().

