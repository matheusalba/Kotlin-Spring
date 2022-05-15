package futemetrics.demo.repository

import futemetrics.demo.model.ClubeModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface ClubeRepository : JpaRepository<ClubeModel, Long>{

}