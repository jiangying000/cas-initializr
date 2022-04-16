package org.apereo.cas.initializr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is {@link InitializrHomeController}.
 *
 * @author Misagh Moayyed
 * @since 6.6.0
 */
@Controller
@RequestMapping(path = "/ui")
public class InitializrHomeController {

    @GetMapping
    public String home() {
        return "index";
    }
}
