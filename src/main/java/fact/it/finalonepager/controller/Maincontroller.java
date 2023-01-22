package fact.it.finalonepager.controller;

import fact.it.finalonepager.model.Feedbackmodel;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class Maincontroller {
    @Autowired
    private RestTemplate template;
    private String baseurl = "https://feedback-service-utopia-kevinvandeputte-tm.cloud.okteto.net/";

    @RequestMapping("/")
    private String index(Model model) {
        model.addAttribute("feedback","false");
        model.addAttribute("sendmessage","");
        return "index";
    }

    @RequestMapping("/analyse")
    private String analyse() {
        return "analytics";
    }

    @RequestMapping("/feedback")
    private String feedback() {
        return "feedback";
    }

    @PostMapping("/")
    public String getfeedback(Model model, HttpServletRequest request) {
        //make model
        String visuals= request.getParameter("visuals");

        String content = request.getParameter("content");
        String game = request.getParameter("game");
        String other = request.getParameter("other");
        int score=
                Integer.parseInt(request.getParameter("score"));

        //send model to api
        Feedbackmodel feedback = new Feedbackmodel(game,visuals,content,other,score);
        String uri = baseurl + "feedback";
        template.postForObject(uri, feedback, Feedbackmodel.class);

        model.addAttribute("feedback","true");
        model.addAttribute("sendmessage","De feedback is verzonden");
        return "index";
    }

}
