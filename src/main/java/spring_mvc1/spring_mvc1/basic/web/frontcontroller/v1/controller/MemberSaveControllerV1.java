package spring_mvc1.spring_mvc1.basic.web.frontcontroller.v1.controller;

import spring_mvc1.spring_mvc1.basic.domain.member.Member;
import spring_mvc1.spring_mvc1.basic.domain.member.MemberRepository;
import spring_mvc1.spring_mvc1.basic.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV1 implements ControllerV1 {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int aget = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, aget);
        memberRepository.save(member);

        request.setAttribute("member", member);
        String viewPath = "/WEB-INF/views/save-result.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request,response);
    }
}
