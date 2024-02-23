package com.balikicindebalik.guidebackend.Service;

import com.balikicindebalik.guidebackend.API.models.Guide;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GuideService {
    private List<Guide> guides;

    public GuideService() {
       guides = new ArrayList<>();
         guides.add(new Guide(1, "Guide 1", "Content 1", "Author 1", new Date(2025,02,01), "5 min"));
         guides.add(new Guide(2, "Guide 2", "Content 2", "Author 2", new Date(2022,02,01), "5 min"));
         guides.add(new Guide(3, "Guide 3", "Content 3", "Author 3", new Date(2020,02,01), "5 min"));

    }

    public Guide getGuide(Integer id) {
        for (Guide guide : guides) {
            if (guide.getId() == id) {
                return guide;
            }
        }
        return null;
    }

    public List<Guide> getGuides() {
        return guides;
    }

    //Guides that are wroted after the given date
    public List<Guide> getGuidesAfterDate(Date date) {
        List<Guide> guidesAfterDate = new ArrayList<>();
        for (Guide guide : guides) {
            if (guide.getReleaseDate().after(date)) {
                guidesAfterDate.add(guide);
            }
        }
        return guidesAfterDate;
    }
}
