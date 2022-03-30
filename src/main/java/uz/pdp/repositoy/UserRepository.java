package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.User;
import uz.pdp.entity.Warehouse;
import uz.pdp.projection.CustomUser;

import javax.swing.text.StyledEditorKit;
import java.util.List;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
Boolean existsByPhoneNumber(String phone);
Boolean existsByPhoneNumberAndPassword(String phone,String password);
}
