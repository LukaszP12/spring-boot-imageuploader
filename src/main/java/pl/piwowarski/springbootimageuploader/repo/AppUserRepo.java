package pl.piwowarski.springbootimageuploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.springbootimageuploader.Model.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Long> {

    AppUser findByUserName(String username);
}
