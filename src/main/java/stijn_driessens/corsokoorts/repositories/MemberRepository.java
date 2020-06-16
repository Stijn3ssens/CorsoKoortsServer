package stijn_driessens.corsokoorts.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import stijn_driessens.corsokoorts.entities.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    @Query(value = "SELECT * FROM members AS m WHERE m.accountId = :userId AND m.organisationId = :societyId", nativeQuery = true)
    Member getMemberByUserAndSociety(@Param("userId") long userId, @Param("societyId") long societyId);
}
