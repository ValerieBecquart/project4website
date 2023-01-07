//package fact.it.finalonepager.controller;
//
//import fact.it.finalonepager.model.Feedbackmodel;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@RestController
//public class RestMaincontroller {
//
////    @Autowired
////    private RestTemplate template;
////    private String baseurl = "https://feedback-service-vanbroekhovenstef.cloud.okteto.net/";
////
////
////
//////@RequestBody Feedbackmodel feedback
////    @RequestMapping("/sendfeedback")
////    public String getfeedback(Model model, HttpServletRequest request) {
////        String visuals = request.getParameter("visuals");
////String content = request.getParameter("content");
////        String game = request.getParameter("game");
////        String other = request.getParameter("other");
////        int score=Integer.parseInt("3");
////
////        Feedbackmodel feedback = new Feedbackmodel(game,visuals,content,other,score);
////        String uri = baseurl + "feedback";
////        Feedbackmodel result = template.postForObject(uri, feedback, Feedbackmodel.class);
////        return "index";
////    }
//
//
//    @GetMapping("/getfeedback")
//    public List<Feedbackmodel> getfeedback() {
//        String uri = baseurl + "feedback";
//        return List.of(template.getForObject(uri, Feedbackmodel[].class));
//    }
//}