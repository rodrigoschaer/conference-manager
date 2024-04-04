package rodrigoschaer.conferencemanager.repository.dbo

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import rodrigoschaer.conferencemanager.domain.model.Conference
import java.util.UUID

@Entity
@Table(name = "conferences")
data class ConferenceDBO (
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: String,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var detail: String,

    @Column(nullable = false, unique = true)
    var slug: String,

    @Column(nullable = false, name = "maximum_attendees")
    var maximumAttendees: Int
){
    fun toModel(): Conference = Conference(
        id = UUID.fromString(id),
        title = title,
        detail = detail,
        slug = slug,
        maximumAttendees = maximumAttendees
    )
}