package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;


/**
 * Created by ed.blair on 4/18/2019.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
