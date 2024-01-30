//package com.daily.study.service;
//
//import com.daily.study.entity.Member;
//import com.daily.study.repository.MemberRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MemberService {
//    @Autowired
//    MemberRepository memberRepository;
//
//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }
//
//    public void test() {
//        memberRepository.save(new Member(1L, "A"));
//
//        Optional<Member> member = memberRepository.findById(1L);
//        List<Member> members = memberRepository.findAll();
//
//        memberRepository.deleteById(1L);
//
//    }
//}
