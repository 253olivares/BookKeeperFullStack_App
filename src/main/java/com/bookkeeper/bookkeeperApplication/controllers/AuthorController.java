package com.bookkeeper.bookkeeperApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Out Rest controller is used to create a restful web service using Spring MVC
// Using Rest Controller we can watch and listen for api calls
@RestController

// In SpringFramework The @RequestMapping annotation is used to map web requests
// to a specific handler or classes.
// this allows us to define url patterns, Http methods, and other parameters
// in this case we are setting our root users api route
@RequestMapping("/authors")

public class AuthorController {

}
