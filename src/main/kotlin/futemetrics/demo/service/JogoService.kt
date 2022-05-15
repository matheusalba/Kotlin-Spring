package futemetrics.demo.service

import futemetrics.demo.extension.toJogo
import futemetrics.demo.model.JogoModel
import futemetrics.demo.repository.ClubeRepository
import futemetrics.demo.repository.JogoRepository
import futemetrics.demo.request.JogoRequest
import org.springframework.stereotype.Service

@Service
class JogoService(
    val jogoRepository: JogoRepository,
    val clubeRepository: ClubeRepository
) {
    fun cadastrarJogo(jogoRequest: JogoRequest){
        val nome_clube_casa = funcaoAuxiliarRetornaNomeClubePorId(jogoRequest.clubeCasaId.toLong())
        val nome_clube_visitante = funcaoAuxiliarRetornaNomeClubePorId(jogoRequest.clubeVisitanteId.toLong())

        jogoRepository.save(jogoRequest.toJogo(nome_clube_casa,nome_clube_visitante))
    }
    fun consultarCidades():List<String>{
        return jogoRepository.consultarCidades()
    }
    fun consultarJogos():List<JogoModel>{
        return jogoRepository.findAll()
    }
    fun retornaEscanteiosMandante(id:Long):Int{
        return jogoRepository.retornarEscanteiosCasa(id)
    }


    /*Funções auxiliares */
    fun funcaoAuxiliarRetornaNomeClubePorId(id:Long):String{
        return clubeRepository.findById(id).get().nome
    }

}