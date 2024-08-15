<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<style type="text/css">
/* 페이지 기본 스타일 */
body {
    font-family: 'Spoqa Han Sans Neo', sans-serif;
    background-color: #1e1e1e;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

/* 폼 컨테이너 */
form {
    background: #2c2c2c;
    padding: 40px;
    border-radius: 15px;
    box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.5);
    width: 350px;
    box-sizing: border-box;
    transition: transform 0.3s ease, box-shadow 0.3s ease;
}

form:hover {
    transform: translateY(-5px);
    box-shadow: 0px 15px 40px rgba(0, 0, 0, 0.7);
}

/* 입력 필드 스타일 */
form input[type="text"],
form input[type="password"] {
    width: 100%;
    padding: 15px;
    margin: 15px 0;
    border-radius: 10px;
    border: 2px solid #444;
    background-color: #3a3a3a;
    color: #ffffff;
    font-size: 16px;
    box-sizing: border-box;
    transition: border-color 0.3s ease, background-color 0.3s ease;
}

form input[type="text"]:focus,
form input[type="password"]:focus {
    border-color: #6200ea;
    background-color: #4a4a4a;
    outline: none;
}

/* 인풋 필드 플레이스홀더 스타일 */
form input::placeholder {
    color: #bdbdbd;
}

/* 버튼 스타일 */
form button {
    width: 100%;
    padding: 15px;
    margin-top: 20px;
    background-color: #6200ea;
    color: #ffffff;
    border: none;
    border-radius: 10px;
    cursor: pointer;
    font-size: 18px;
    text-transform: uppercase;
    transition: background-color 0.3s ease, box-shadow 0.3s ease;
}

form button:hover {
    background-color: #7c00ff;
    box-shadow: 0px 8px 15px rgba(98, 0, 234, 0.3);
}
</style>

<script type="text/javascript">

$(function(){
	
	
	    $('#loginForm').on('submit', function(event) {
         event.preventDefault(); // 폼의 기본 제출 동작 방지

         // 폼 데이터를 JSON 형식으로 변환
         var formData = {
             email: $('#userId').val(),
             name: $('#userName').val(),
             pass: $('#password').val(),
             address: $('#address').val()
         };
         $.ajax({
             url: '/member/signup', // 데이터를 전송할 서버 URL을 입력하세요.
             type: 'POST',
             contentType: 'application/json', // JSON 형식으로 보낼 것임을 명시
             data: JSON.stringify(formData), // 데이터를 JSON 문자열로 변환
             success: function (response) {
            
               location.href = response.data;
             },
             error: function (xhr, status, error) {
               // 에러 발생 시 처리
               console.error('에러 발생:', error);
             },
           });
        }
         )
	
	
})


</script>

</head>
<body>
<!-- form 데이터 그대로 읽어와서 JSON으로 만들어서 요청 -->
<form id="loginForm">
	이메일:<input type="text" id="userId" >
	이름: <input type="text" id="userName">
	비밀번호:<input type="password" id="password">
	주소:<input type="text" id="address">
	<input type="submit" value="제출하기">
</form>
</body>
</html>