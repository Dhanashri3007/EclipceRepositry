package com.demo.controller;
@RestController
public class HomeController {
@GetMapping("getData")
public String getData()
{
  return "All Data";
}
}
