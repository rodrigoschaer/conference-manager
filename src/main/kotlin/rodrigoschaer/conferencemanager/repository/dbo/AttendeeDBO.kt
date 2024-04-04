package rodrigoschaer.conferencemanager.repository.dbo

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import rodrigoschaer.conferencemanager.domain.model.Attendee
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "attendees")
data class AttendeeDBO (
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: String,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var email: String,

    @ManyToOne
    @JoinColumn(nullable = false, name="conference_id")
    var conference: ConferenceDBO,

    @Column(nullable = false, name = "created_at")
    var createdAt: LocalDateTime,
){
    fun toModel(): Attendee = Attendee(
        id = UUID.fromString(id),
        name = name,
        email = email,
        createdAt = createdAt,
        conference = conference.toModel()
    )
}