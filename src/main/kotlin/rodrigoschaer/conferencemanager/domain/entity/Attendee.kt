package rodrigoschaer.conferencemanager.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.UUID
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "attendees")
data class Attendee (
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = UUID)
    var id: String,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var email: String,

    @ManyToOne
    @JoinColumn(nullable = false, name="conference_id")
    var conference: Conference,

    @Column(nullable = false, name = "created_at")
    var createdAt: LocalDateTime,
)