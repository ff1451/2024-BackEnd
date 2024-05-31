package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Member;

public interface MemberRepository {

    List<Member> findAll();

    Optional<Member> findById(Long id);

    Member insert(Member member);

    Member update(Member member);

    void deleteById(Long id);

    boolean existsByEmail(String email);
}
