package rodrigoschaer.conferencemanager.domain.model

import rodrigoschaer.conferencemanager.controller.dto.AttendeeDTO
import java.time.LocalDateTime
import java.util.UUID

data class Attendee(
    val id: UUID,
    val name: String,
    val email: String,
    val conference: Conference,
    val createdAt: LocalDateTime
){
    fun toAttendeeDTO(): AttendeeDTO = AttendeeDTO(
            id = id.toString(),
            name = name,
            email = email,
            conference = conference.toConferenceDTO(),
            createdAt = createdAt.toString()
    )
}
