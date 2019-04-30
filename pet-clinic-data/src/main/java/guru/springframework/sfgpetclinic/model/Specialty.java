package guru.springframework.sfgpetclinic.model;

/**
 * Created by ed.blair on 4/30/2019.
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
