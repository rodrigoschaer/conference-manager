package rodrigoschaer.conferencemanager.controller.dto

data class AttendeeDTO (
    val id: String,
    val name: String,
    val email: String,
    val conference: ConferenceDTO,
    val createdAt: String,
)