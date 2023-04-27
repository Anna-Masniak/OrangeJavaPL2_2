package org.sda;

import jakarta.persistence.*;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workerId;

    private String name;

    @OneToOne(cascade = PERSIST)
    @JoinColumn(name = "department_id", )
    public Worker(String name) {
        this.name = name;
    }


    public Worker() {
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", name='" + name + '\'' +
                '}';
    }

}
