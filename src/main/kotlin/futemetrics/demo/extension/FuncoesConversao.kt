package futemetrics.demo.extension

import futemetrics.demo.model.ClubeModel
import futemetrics.demo.model.JogoModel
import futemetrics.demo.request.ClubeRequest
import futemetrics.demo.request.JogoRequest

fun ClubeRequest.toClube(): ClubeModel {
    return ClubeModel(nome = this.nome, cidade = this.cidade)
}

fun JogoRequest.toJogo(nome_casa:String, nome_visitante:String): JogoModel{
    return JogoModel(
        cidade = this.cidade,
        clube_casa_nome = nome_casa,
        clube_casa_id = this.clubeCasaId,
        clube_casa_gol = this.clubeCasaGol,
        clube_casa_escanteio = this.clubeCasaEscanteio,
        clube_visitante_nome = nome_visitante,
        clube_visitante_id = this.clubeVisitanteId,
        clube_visitante_gol = this.clubeVisitanteGol,
        clube_visitante_escanteio = this.clubeVisitanteEscanteio
    )
}

