package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by ed.blair on 4/18/2019.
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
