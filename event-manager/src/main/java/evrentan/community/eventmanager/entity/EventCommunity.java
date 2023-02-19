package evrentan.community.eventmanager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;


/**
 * Event Community Class represents the event_community table in the database.
 * It is represented by {@link evrentan.community.eventmanager.dto.EventCommunityDto} in DTO level.
 *
 * @author <a href="https://github.com/Onuraktasj">Onur Aktas</a>
 * @since 1.0.0
 */
@Entity
@Table(name = "event_community")
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class EventCommunity {
    /**
     * Event Community ID in UUID Type.
     * It is equalized to the id column in the database.
     * It is the primary key of the table.
     * It is auto-generated by the database.
     * It is unique.
     * It is not nullable.
     *
     * @since 1.0.0
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "community_id")
    private UUID communityId;

    /**
     * Indicates whether the event community is active or not.
     * It is equalized to the is_active column in the database.
     *
     * @since 1.0.0
     */
    @Basic
    @Column(name = "is_active")
    private boolean isActive;

    @ManyToMany
    @JoinColumn(name = "event_id")
    private List<EventEntity> eventList;
}
