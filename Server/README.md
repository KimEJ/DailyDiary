Summary
=======

서버 라우팅 path와 HTTP METHOD 정리
-----------------------------------

POST /auth/signin // 로그인

POST /auth/signup // 회원가입

GET /notes // 사용자가 작성한 note 목록 전송

GET /notes/:index // 특정 번호를 가진 note의 정보 전송

POST /notes // 특정 사용자의 note 작성

PUT /notes/:index // 특정 번호를 가진 note의 정보 수정

DELETE /notes/:index // 특정 번호를 가진 note 삭제


사용 HTTP 상태코드
------------------


200 : 성공

404 : 찾을 수 없음

500 : 내부서버 예외

REDME
-----
Port : 5000
npm : hapi

Issue 정리
----------

* 서버 라우팅 path와 HTTP METHOD 정리
	
	* 적용

* Server/Document 필독!!!
