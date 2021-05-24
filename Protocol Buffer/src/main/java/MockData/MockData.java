package MockData;

import model.Address;
import model.Employee;
import model.Person;

public class MockData {
    public static Person getPersonData() {
        Person person = new Person();
        person = Person.builder().age(21)
            .firstName("First_Name")
            .lastName("Last_Name")
            .email("name@org.com")
            .currentAddress(getAddressDetails("Person"))
            .employee(getEmployeeDetails())
            .build();
        return person;
    }

    private static Employee getEmployeeDetails() {
        return Employee.builder()
            .employeeId(123321)
            .employerName("Employer_Name")
            .employerAddress(getAddressDetails("Employee"))
            .build();
    }

    private static Address getAddressDetails(String addressType) {
        return Address.builder()
            .addressLine1("Address_Line1_"+addressType)
            .addressLine2("Address_Line2_"+addressType)
            .city("Address_City_"+addressType)
            .country("Address_Country_"+addressType)
            .zip(123654)
            .build();
    }
}
