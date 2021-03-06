package futemetrics.demo.repository

import futemetrics.demo.model.JogoModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository interface JogoRepository:JpaRepository<JogoModel,Long> {

    @Query(" select j.cidade from jogo j ", nativeQuery = true)
    fun consultarCidades():List<String>

    @Query(" select sum(j.clube_casa_escanteio) \n" +
            "from jogo j\n" +
            "where j.clube_casa_id = :id ", nativeQuery = true)
    fun retornarEscanteiosCasa(
        @Param("id") id: Long
    ):Int

    @Query("select \n" +
            "sum(j.clube_casa_gol) as gols_casa\n" +
            "from jogo j\n" +
            "where j.clube_casa_id = :id ", nativeQuery = true)
    fun golsCasa(
        @Param("id") id:Long
    ):Int

    @Query("select \n" +
            "sum(j.clube_visitante_gol) as gols_visitante \n" +
            "from jogo j\n" +
            "where j.clube_visitante_id = :id ", nativeQuery = true)
    fun golsFora(
        @Param("id") id:Long
    ):Int
}