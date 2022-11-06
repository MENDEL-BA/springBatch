package sn.mendel.techpal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.mendel.techpal.entities.BusinessEmp;

public interface BusinessEmpRepository extends JpaRepository<BusinessEmp, Long> {
}
