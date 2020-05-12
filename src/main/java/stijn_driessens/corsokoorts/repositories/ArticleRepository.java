package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Modifying
    @Query(value = "SELECT a FROM articles a WHERE a.tabId = :tabId", nativeQuery = true)
    List<Article> findAllByTabId(@Param("tabId") long tabId);
}
