package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Output;

@Repository
public interface OutputRepository extends JpaRepository<Output,Integer> {

}
