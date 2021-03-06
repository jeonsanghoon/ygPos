package com.mrc.yg.api.framework.jwt;


import com.mrc.yg.api.domain.member.dto.MemberDto;
import com.mrc.yg.api.domain.member.dto.MemberDtoReq;
import com.mrc.yg.api.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final MemberService<MemberDtoReq, MemberDto> memberService;

    public UserDetails loadUserByUsername(String memberCode) {
        MemberDtoReq req = new MemberDtoReq();
        req.setMemberCode(Integer.parseInt(memberCode));
        MemberDto member =  memberService.getList(req).getData().get(0);

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(member.getMemberId(), member.getMemberPw(), authorities);
    }


}
