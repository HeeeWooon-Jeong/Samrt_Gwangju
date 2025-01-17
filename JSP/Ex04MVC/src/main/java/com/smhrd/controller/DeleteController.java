package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;


@WebServlet("/delete")
public class DeleteController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        String pw = request.getParameter("pw");
        
        HttpSession session = request.getSession();
        Member user = (Member)session.getAttribute("user");
        
        String id = user.getId();
        
        Member member = new Member();
        member.setId(id);
        member.setPw(pw);
        
        MemberDAO dao = new MemberDAO();
        
        int del = dao.delete(member);
        
        if(del > 0) {
            System.out.println("삭제 성공");
            session.removeAttribute("user");
        }else {
            System.out.println("삭제 실패");
        }
        
        String url = "goMain";
        response.sendRedirect(url);
        
                
    }    

}