package by.byportal.repository;

import by.byportal.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

    //void deleteEmployeeByEmployeeId(Long id);

    void deleteEmployeByEmployeId(Long personId);

    // PUT ?

    //
}
