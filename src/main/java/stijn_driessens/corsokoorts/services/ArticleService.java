package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.Article;
import stijn_driessens.corsokoorts.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService extends CrudService<Article, Long> {
    private ArticleRepository repos;

    public ArticleService(ArticleRepository repos) {
        super(repos);
        this.repos = repos;
    }

    public List<Article> getAllByTabId(long societyId, long tabId) {
        return repos.findAllByTabId(societyId, tabId);
    }
}
