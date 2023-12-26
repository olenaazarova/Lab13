package com.example.task3;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class CompanyData {
    
    private String name;
    private String description;
    private String logo;

    @Override
    public String toString()
    {
        return "Company{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logoUrl='" + logo + '\'' + '}';
    }
}
