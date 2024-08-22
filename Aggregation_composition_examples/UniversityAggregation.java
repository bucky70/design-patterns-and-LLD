package Aggregation_composition_examples;

import java.util.ArrayList;
import java.util.List;

 class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    // Other department-related methods
}

public class UniversityAggregation {
    private String name;
    private List<Department> departments; // Aggregation

    public UniversityAggregation(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Other university-related methods
}


//department data is set outside of this class meaning it is created independent of this university class
//if university is destryed Department can exist without it
//reference : https://medium.com/@salvipriya97/java-aggregation-and-composition-explained-with-examples-66cbffd21b9c