package rodrigoschaer.conferencemanager.domain.model

import rodrigoschaer.conferencemanager.controller.dto.ConferenceDTO
import rodrigoschaer.conferencemanager.repository.dbo.ConferenceDBO
import java.util.UUID

data class Conference (
    var id: UUID,
    var title: String,
    var detail: String,
    var slug: String,
    var maximumAttendees: Int
) {
    fun toConferenceDTO(): ConferenceDTO {
        val currentAttendeesAmount = 0

        return ConferenceDTO(
            id = id.toString(),
            title = title,
            detail = detail,
            slug = slug,
            maximumAttendees = maximumAttendees,
            currentAttendeesAmount = currentAttendeesAmount,
        )
    }

    fun toConferenceDBO(): ConferenceDBO = ConferenceDBO(
        id = id.toString(),
        title = title,
        detail = detail,
        slug = slug,
        maximumAttendees = maximumAttendees,
    )
}