package sn.esmt.emplois.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.emplois.entities.CvEntity;
@Repository

public interface CvRepository extends JpaRepository<CvEntity, Integer> {
    CvEntity findById (int Id);
}
