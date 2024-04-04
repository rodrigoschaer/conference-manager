package rodrigoschaer.conferencemanager.domain.service

import org.springframework.stereotype.Service
import rodrigoschaer.conferencemanager.controller.dto.ConferenceDTO
import rodrigoschaer.conferencemanager.controller.dto.ConferenceResponseDTO
import rodrigoschaer.conferencemanager.domain.model.Conference
import rodrigoschaer.conferencemanager.repository.ConferenceRepository


@Service
class ConferenceService (
    private val conferenceRepository: ConferenceRepository,
){
    fun getConferenceDetail(conferenceId: String): ConferenceResponseDTO {
        val conference: Conference = conferenceRepository.findById(conferenceId).orElseThrow{
            RuntimeException("Conference not found [id=${conferenceId}]")
        }.toModel()

        return conference.toConferenceDTO().toConferenceResponseDTO()
    }

    fun createConference(dto: ConferenceDTO){
        conferenceRepository.save(dto.toModel().toConferenceDBO())
    }
}
