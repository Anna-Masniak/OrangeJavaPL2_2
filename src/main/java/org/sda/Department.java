package org.sda;

import jakarta.persistence.*;

@Entity
@Table(name = "department")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer departmentId;
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public Department() {}
    public Department(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
