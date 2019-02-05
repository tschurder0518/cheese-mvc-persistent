package org.launchcode.models.data;

import javax.transaction.Transactional;

import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer>{
}
