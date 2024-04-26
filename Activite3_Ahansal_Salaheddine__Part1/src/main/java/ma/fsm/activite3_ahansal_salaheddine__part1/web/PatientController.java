package ma.fsm.activite3_ahansal_salaheddine__part1.web;

import lombok.AllArgsConstructor;
import ma.fsm.activite3_ahansal_salaheddine__part1.entities.Patient;
import ma.fsm.activite3_ahansal_salaheddine__part1.repositories.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    /*
     * Syntaxe pour récupérer un paramètre avec Spring MVC :
     * - direct  :
     *   index(int page)
     * - Utilisation de @RequestParam avec une valeur par défaut :
     *   index(@RequestParam(name = "page", defaultValue = "0") int page)
     *
     * Syntaxe pour récupérer un paramètre avec HttpServletRequest :
     *   index(HttpServletRequest request) {
     *       int page = Integer.parseInt(request.getParameter("page"));
     *   }
     */
    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int p,
                        @RequestParam(name = "size", defaultValue = "5") int s,
                        @RequestParam(name = "keyword",defaultValue = "") String kw
                        ){

        Page<Patient> pagePatients = patientRepository.findByNomContains(kw,PageRequest.of(p,s));
        model.addAttribute("patients", pagePatients.getContent());
        System.out.println(pagePatients.getContent());
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]);
        System.out.println(pagePatients.getTotalPages());
        model.addAttribute("currentPage",p);
        model.addAttribute("keyword",kw);
        return "patients";
    }
@GetMapping("/delete")
    public String delete(Long id,String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
}
