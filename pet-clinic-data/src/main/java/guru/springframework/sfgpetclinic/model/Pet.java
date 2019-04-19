package guru.springframework.sfgpetclinic.model;

import java.util.Locale;

/**
 * Created by ed.blair on 4/18/2019.
 */
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private Locale birthdate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Locale getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Locale birthdate) {
        this.birthdate = birthdate;
    }
}
