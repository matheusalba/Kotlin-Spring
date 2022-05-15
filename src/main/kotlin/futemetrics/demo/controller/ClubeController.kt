package futemetrics.demo.controller

import futemetrics.demo.extension.toClube
import futemetrics.demo.model.ClubeModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import futemetrics.demo.request.ClubeRequest
import futemetrics.demo.request.JogoRequest
import futemetrics.demo.service.ClubeService

@RestController
@RequestMapping("clube")
class ClubeController(
val clubeService: ClubeService,

)
{
    @GetMapping
    fun consultarClubes():List<ClubeModel>{
        return clubeService.consultarClubes()
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastarClube(@RequestBody clubeRequest : ClubeRequest){
        clubeService.create(clubeRequest.toClube())
    }


}