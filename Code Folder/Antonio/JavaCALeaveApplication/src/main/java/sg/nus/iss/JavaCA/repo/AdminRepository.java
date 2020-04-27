package sg.nus.iss.JavaCA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sg.nus.iss.JavaCA.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {
	
	@Query("SELECT a FROM Admin a WHERE a.username=:un AND a.password=:pwd")
	Admin findUserByNamePwd(@Param("un")String uname, @Param("pwd")String pwd);



}

