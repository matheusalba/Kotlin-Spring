package futemetrics.demo.controller

import futemetrics.demo.extension.toJogo
import futemetrics.demo.model.JogoModel
import futemetrics.demo.request.JogoRequest
import futemetrics.demo.service.JogoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
@RequestMapping("jogo")
class JogoController(
val jogoService: JogoService
) {
    @PostMapping
    fun cadastrarJogo(@RequestBody jogoRequest: JogoRequest){
        jogoService.cadastrarJogo(jogoRequest)
    }
    @GetMapping
    fun consultarJogos():List<JogoModel>{
       return jogoService.consultarJogos()
    }
    @GetMapping("/{id}")
    fun consultarEscanteiosMandante(@PathVariable id:Long):Int{
        return jogoService.retornaEscanteiosMandante(id)
    }
}