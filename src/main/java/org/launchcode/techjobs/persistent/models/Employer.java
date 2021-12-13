package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @NotBlank(message = "Field is required")
    @Size(min=1 , max=255)
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    @OneToMany(mappedBy = "employer")
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

}

