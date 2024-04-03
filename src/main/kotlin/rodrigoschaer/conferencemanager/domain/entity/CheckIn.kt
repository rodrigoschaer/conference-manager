package rodrigoschaer.conferencemanager.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "check_ins")
data class CheckIn (
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    var id: Int,

    @Column(nullable = false, name = "created_at")
    var createdAt: LocalDateTime,

    @OneToOne
    @JoinColumn(nullable = false, name="attendee_id")
    var attendee: Attendee,
)