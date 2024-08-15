let memberJs = (function () {
  function signUp(data, callback) {
    $.ajax({
      url: '/member/signup', // 데이터를 전송할 서버 URL을 입력하세요.
      type: 'POST',
      contentType: 'application/json', // JSON 형식으로 보낼 것임을 명시
      data: JSON.stringify(formData), // 데이터를 JSON 문자열로 변환
      success: function (response) {
        if (callback !== null) {
          callback(data);
        }
        location.hre = response;
      },
      error: function (xhr, status, error) {
        // 에러 발생 시 처리
        console.error('에러 발생:', error);
      },
    });
  }

  return {
    signUp: signUp,
  };
})();

export default {
  memberJs,
};
