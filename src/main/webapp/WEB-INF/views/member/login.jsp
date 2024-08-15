<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#loginForm").on('submit',function(e){
			e.preventDefault();
		    // 폼 데이터를 JSON 형식으로 변환
	         var formData = {
	             email: $('#email').val(),
	             pass: $('#pass').val()
	          
	         };
	         $.ajax({
	             url: '/member/login', // 데이터를 전송할 서버 URL을 입력하세요.
	             type: 'POST',
	             contentType: 'application/json', // JSON 형식으로 보낼 것임을 명시
	             data: JSON.stringify(formData), // 데이터를 JSON 문자열로 변환
	             success: function (response) {
	               if(response.code === '200')
	               location.href = response.data;
	             },
	             error: function (xhr, status, error) {
	               // 에러 발생 시 처리
	               console.error('에러 발생:', error);
	             },
	           });
	        })
		
		
	})

</script>
</head
>
<body>
	<form id="loginForm" >
	 이메일:<input type="text" id="email">
	 비밀번호:<input type="password" id="pass">
	 <input type="submit">
	</form>
</body>
</html>