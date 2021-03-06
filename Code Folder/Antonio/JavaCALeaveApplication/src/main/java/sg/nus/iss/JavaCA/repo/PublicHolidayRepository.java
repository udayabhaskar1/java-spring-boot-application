package sg.nus.iss.JavaCA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.nus.iss.JavaCA.model.PublicHoliday;

@Repository
public interface PublicHolidayRepository extends JpaRepository<PublicHoliday, Integer> {

}
