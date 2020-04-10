# Servlet_3

###
- 공지사항(Notice)
- 글쓰기,수정, 삭제  id가 admin만 가능 
- 글 리스트 페이지, 최신순으로 출력
- 리스트 페이지에서 글쓰기 버튼을 누르면 글쓰기로 이동 (admin만 보이게)
- 리스트 페이지에서 글제목을 누르면 글 상세보기로 이동
- 글 상세보기에서 글수정, 글삭제 버튼 존재 (admin만 보이게)
- 글 삭제 버튼을 누르면 확인, 취소 창을 띄우고 확인을 누르면 삭제
- 글 수정은 누르면 글수정 이동
- 로그인 한상태로만 구현
- 글번호 시퀀스 , 날짜 sysdate
- [option] 조회수 , 글상세보기 하면 조회수를 1증가

### /WEB-INF/ views/ notice
 - /point/pointList		/ pointList.jsp		/ GET
 - /point/pointAdd		/ pointAdd.jsp		/ GET
 - /point/pointAdd		/					/ POST
 - /point/pointSelect	/ pointSelect.jsp	/ GET
 - /point/pointMod		/ pointMod.jsp		/ GET
 - /point/pointMod		/					/ POST
 - /point/pointDelete	/					/ GET
 

##기능 

### Member
 - 회원 가입(insert)
 - 로그인(Select One)
 - 회원정보 수정(Update)
 - 회원 탈퇴(Delete)
 - myPage
 
 ## JSP
  - /WEb-INF/views/member/...
  
## URL 주소				/	JSP				/ Method
### /WEB-INF/views/point/
/member/memberJoin		/ memberJoin.jsp	/ GET
/member/memberJoin		/					/ POST
/member/memberLogin		/ memberLogin.jsp	/ GET
/member/memberLogin		/ 					/ POST
/member/memberPage		/ memberPage.jsp	/ GET
/member/memberUpdate	/ memberUpdate.jsp	/ GET
/member/memberUpdate	/					/ POST
/member/memberDelete	/					/ GET
### point
 - point list 출력
 - point 등록
 - point 상세 정보 출력 
 - point 수정
 - point 삭제
 
 
## JSP
 - pointList.jsp	: List 출력
 - pointAdd.jsp		: 입력 폼
 - pointSelect.jsp	: point 상세정보 출력 
 - pointMod.jsp		: point 수정
 
## URL 주소				/	JSP				/ Method
### /WEB-INF/views/point/**
 - /point/pointList		/ pointList.jsp		/ GET
 - /point/pointAdd		/ pointAdd.jsp		/ GET
 - /point/pointAdd		/					/ POST
 - /point/pointSelect	/ pointSelect.jsp	/ GET
 - /point/pointMod		/ pointMod.jsp		/ GET
 - /point/pointMod		/					/ POST
 - /point/pointDelete	/					/ GET
 

 
