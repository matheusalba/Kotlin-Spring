package futemetrics.demo.service

import futemetrics.demo.model.ClubeModel
import org.springframework.stereotype.Service
import futemetrics.demo.repository.ClubeRepository

@Service
class ClubeService(
val clubeRepository: ClubeRepository
) {
fun create(clube: ClubeModel){
    clubeRepository.save(clube)
}
fun consultarClubes():List<ClubeModel>{
    return clubeRepository.findAll()
}
}