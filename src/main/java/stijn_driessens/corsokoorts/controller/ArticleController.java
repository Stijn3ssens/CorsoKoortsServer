package stijn_driessens.corsokoorts.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import stijn_driessens.corsokoorts.entities.Article;
import stijn_driessens.corsokoorts.response.Response;
import stijn_driessens.corsokoorts.response.ResponseGenerator;
import stijn_driessens.corsokoorts.services.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController extends CrudController<Article> {
    private ArticleService service;

    public ArticleController(ArticleService service) {
        super(service);
        this.service = service;
    }

    @GetMapping("/getallbytabid/{tabId}")
    public Response<Article> getAllByTabId(HttpServletRequest request, @PathVariable Long tabId) {
        List<Article> result = service.getAllByTabId(tabId);
        return new ResponseGenerator<Article>().generateResponse(result, "Could not find the ID...");
    }
}
