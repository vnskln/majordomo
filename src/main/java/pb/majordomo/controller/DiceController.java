package pb.majordomo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pb.majordomo.domains.DiceSet;
import pb.majordomo.domains.DiceSetCreator;
import pb.majordomo.services.DiceRoller;

import javax.validation.Valid;

@Controller
@RequestMapping("/dice")
public class DiceController {

    @GetMapping("prepare")
    public String diceTagInput(Model model) {
        model.addAttribute("dice_set_creator", new DiceSetCreator());
        return "diceTagInput";
    }

    @PostMapping("create")
    public String diceInput (@Valid @ModelAttribute("dice_set_creator") DiceSetCreator diceSetCreator, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "diceTagInput";
        }
        DiceSet diceSet = new DiceSet(diceSetCreator);
        model.addAttribute("dice_set", diceSet);
        return "diceInput";
    }

    @PostMapping("roll")
    public String processDiceInput (@Valid @ModelAttribute("dice_set") DiceSet diceSet, Model model, Errors errors) {
        if (errors.hasErrors()) {
            return "create";
        }
        DiceRoller.roll(diceSet.getDiceList());
        model.addAttribute("dice_set", diceSet);
        return "diceOutput";
    }
}
