package com.secor.hra25frontend;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController
{


    @GetMapping("/loginredirect")
    public String redirectToLogin()
    {
        return "redirect:/login.html"; // Redirects to the static login.html file
    }

    @GetMapping("/dashboardredirect")
    public String redirectToDashboard(@PathParam("userid") String userid)
    {
        return "redirect:/dashboard.html?userid=" + userid; // Redirects to the dashboard.html file with userid as a query parameter    }
    }



}
