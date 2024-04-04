package rodrigoschaer.conferencemanager.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import rodrigoschaer.conferencemanager.controller.dto.ConferenceDTO
import rodrigoschaer.conferencemanager.controller.dto.ConferenceResponseDTO
import rodrigoschaer.conferencemanager.domain.service.ConferenceService

@RestController
@RequestMapping("/conferences")
class ConferenceController(val conferenceService: ConferenceService) {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    fun getConference(
        @PathVariable("id") id: String
    ): ConferenceResponseDTO {
        return conferenceService.getConferenceDetail(id)
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/create")
    fun postConference(
        @RequestBody dto: ConferenceDTO
    ) = conferenceService.createConference(dto)
}