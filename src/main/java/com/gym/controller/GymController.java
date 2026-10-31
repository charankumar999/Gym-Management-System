package com.gym.controller;

import com.gym.model.Member;
import com.gym.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GymController {

    private final MemberRepository memberRepository;

    public GymController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("memberCount", memberRepository.count());
        model.addAttribute("members", memberRepository.findAll());
        return "index";
    }

    @GetMapping("/members")
    public String members(Model model) {
        model.addAttribute("members", memberRepository.findAll());
        return "members";
    }

    @GetMapping("/members/new")
    public String newMember(Model model) {
        model.addAttribute("member", new Member());
        return "member-form";
    }

    @PostMapping("/members/save")
    public String saveMember(@ModelAttribute Member member) {
        memberRepository.save(member);
        return "redirect:/members";
    }

    @GetMapping("/members/delete/{id}")
    public String deleteMember(@PathVariable Long id) {
        memberRepository.deleteById(id);
        return "redirect:/members";
    }
}
