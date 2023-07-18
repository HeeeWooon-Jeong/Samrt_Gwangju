<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
   <%
   request.setCharacterEncoding("UTF-8");

   String name = request.getParameter("name");
   String java1 = request.getParameter("java");
   String web1 = request.getParameter("web");
   String iot1 = request.getParameter("iot");
   String android1 = request.getParameter("android");

   int java = Integer.parseInt(java1);
   int web = Integer.parseInt(web1);
   int iot = Integer.parseInt(iot1);
   int android = Integer.parseInt(android1);

   int avg = (java + web + iot + android) / 4;
   String score;
   if (avg >= 95) {
      score = "A+";
   } else if (avg >= 90) {
      score = "A";
   } else if (avg >= 85) {
      score = "B+";
   } else if (avg >= 80) {
      score = "B";
   } else {
      score = "F";
   }
   %>
   <table>
      <tr>
         <td align="center">이름</td>
         <td align="center"><%=name%></td>
      </tr>
      <tr>
         <td align="center">JAVA점수</td>
         <td align="center"><%=java%></td>
      </tr>
      <tr>
         <td align="center">WEB점수</td>
         <td align="center"><%=web%></td>
      </tr>
      <tr>
         <td align="center">IOT점수</td>
         <td align="center"><%=iot%></td>
      </tr>
      <tr>
         <td align="center">ANDROID점수</td>
         <td align="center"><%=android%></td>
      </tr>
      <tr>
         <td align="center">평균</td>
         <td align="center"><%=avg%></td>
      </tr>
      <tr>
         <td align="center">학점</td>
         <td align="center"><Strong><%=score%></Strong></td>
      </tr>

   </table>
</body>
</html>
