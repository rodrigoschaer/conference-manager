package rodrigoschaer.conferencemanager.controller.dto

import rodrigoschaer.conferencemanager.domain.model.Conference
import rodrigoschaer.conferencemanager.repository.dbo.ConferenceDBO
import java.util.UUID

data class ConferenceResponseDTO(
    val conference: ConferenceDTO
)

data class ConferenceDTO(
    val id: String,
    val title: String,
    val detail: String,
    val slug: String,
    val maximumAttendees: Int,
    val currentAttendeesAmount: Int
){
    fun toModel(): Conference = Conference(
        id = UUID.fromString(id),
        title = title,
        detail = detail,
        slug = slug,
        maximumAttendees = maximumAttendees,
    )

    fun toConferenceResponseDTO(): ConferenceResponseDTO {
        return ConferenceResponseDTO(conference = this)
    }
}