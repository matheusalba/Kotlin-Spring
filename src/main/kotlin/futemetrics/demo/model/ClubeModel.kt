package futemetrics.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="clube")
data class ClubeModel(
    @Id
    @GeneratedValue
    var id: Long = 0,
    var nome: String = "",
    var cidade: String = ""

)
