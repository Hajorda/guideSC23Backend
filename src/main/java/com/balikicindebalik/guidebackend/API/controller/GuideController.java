package com.balikicindebalik.guidebackend.API.controller;

import com.balikicindebalik.guidebackend.API.models.Guide;
import com.balikicindebalik.guidebackend.Service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GuideController {

    private GuideService guideService;
    @Autowired
    public GuideController(GuideService guideService) {
        this.guideService = guideService;
    }
    @GetMapping("/guide")
   public Guide getGuide(@RequestParam Integer id) {
      return guideService.getGuide(id);
   }

    @GetMapping("/guides")
    public Iterable<Guide> getGuides() {
        return guideService.getGuides();
    }

    @GetMapping("/guidesAfterDate")
    public Iterable<Guide> getGuidesAfterDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
        return guideService.getGuidesAfterDate(date);
    }
}
