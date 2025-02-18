package com.example.mywebapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/")
    public String index(Model model) {
        return "index"; // Отображает главную страницу
    }

    @GetMapping("/radioluch")
    public String radioluch(Model model) {
        List<String> subLinks = new ArrayList<>();
        subLinks.add("Арбалет");
        subLinks.add("Василек");
        model.addAttribute("subLinks", subLinks);
        return "radioluch"; // Отображает страницу radioluch.html
    }

    @GetMapping("/triboelekt")
    public String triboelekt(Model model) {
        List<String> subLinks = new ArrayList<>();
        subLinks.add("Гюрза");
        subLinks.add("Ежевика");
        subLinks.add("Микрос");
        model.addAttribute("subLinks", subLinks);
        return "triboelekt"; // Отображает страницу triboelekt.html
    }

    @GetMapping("/infokras")
    public String infokras(Model model) {
        List<String> subLinks = new ArrayList<>();
        subLinks.add("ИД-50");
        subLinks.add("ИД-70");
        model.addAttribute("subLinks", subLinks);
        return "infokras"; // Отображает страницу infokras.html
    }

    @GetMapping("/vibracion")
    public String vibracion(Model model) {
        List<String> subLinks = new ArrayList<>();
        subLinks.add("Паук");
        subLinks.add("Тюльпан");
        model.addAttribute("subLinks", subLinks);
        return "vibracion"; // Отображает страницу vibracion.html
    }
}