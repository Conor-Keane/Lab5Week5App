package ie.atu.week5blockingapplication.week5blockingapplication;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    private final FeignService feignService;

    public FeignController(FeignService feignService) {
        this.feignService = feignService;
    }


}
