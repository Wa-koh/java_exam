package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		List<Member> memberList = repository.findAll();
		System.out.println("findAllメソッド動作確認");
		for (Member mem : memberList) {
			System.out.println(mem);
		}

		System.out.println("loadメソッド動作確認");
		Member member = repository.load(2);
		System.out.println(member);

		System.out.println("「あなたの情報」を登録");
		Member member2 = new Member();
		member2.setName("若井田");
		member2.setAge(24);
		member2.setDepId(2);
		repository.save(member2);
		member2 = repository.load(4);
		System.out.println(member2);

		System.out.println("「ジロー」を「シロー」に更新");
		member.setName("シロー");
		repository.save(member);
		System.out.println(member);

		return "member";
	}
}
