package csc.agile.AgileDiner.Controller;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import csc.agile.AgileDiner.Modals.resDTO;

import csc.agile.AgileDiner.Services.reservationService;

@Controller
@RequestMapping("/AgileDiner")
public class clientController {
    
    @GetMapping("/")
    public String welcome(@ModelAttribute resDTO dto ){
        System.out.println("haha");
        return "index";
    }    

    @PostMapping("/reserve")
    public String reserve (@ModelAttribute resDTO dto){
        reservationService.saveRes(dto);
        System.out.println(dto.toString());
        return "saved";
    }
   


}
