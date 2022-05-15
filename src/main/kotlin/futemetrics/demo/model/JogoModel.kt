package futemetrics.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "jogo")
data class JogoModel (
    @Id
    @GeneratedValue
    var id: Int = 0,
    var cidade: String = "",
    var clube_casa_id: Int = 0,
    var clube_casa_nome : String = "",
    var clube_casa_gol: Int = 0,
    var clube_casa_escanteio: Int = 0,
    var clube_visitante_id: Int=0,
    var clube_visitante_nome: String = "",
    var clube_visitante_gol: Int=0,
    var clube_visitante_escanteio: Int=0,
    )