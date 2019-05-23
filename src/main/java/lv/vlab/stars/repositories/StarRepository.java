package lv.vlab.stars.repositories;

import lv.vlab.stars.models.Star;
import org.springframework.data.repository.CrudRepository;

public interface StarRepository extends CrudRepository<Star, Long> {
}
