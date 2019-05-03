package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ed.blair on 5/2/2019.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
