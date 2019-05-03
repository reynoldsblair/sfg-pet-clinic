package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ed.blair on 5/2/2019.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
