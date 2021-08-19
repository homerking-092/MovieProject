package kr.co.movie.review.service;

import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.movie.review.model.ReviewDAO;
import kr.co.movie.review.model.ReviewVO;

public class MovieUpdateReviewService implements IMovieReviewService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션 쓰는법
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String) session.getAttribute("i_s");

		if (idSession == null) {
			try {
				// 서비스 내부에서 포워딩을 시키면
				// 리다이렉트가 아니기 문에 실행됨
				String ui = "movieuser/movie_user_login_form.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 1. 파라미터 6개 받아오기
		String strrNum = request.getParameter("bId");
		int rNum = Integer.parseInt(strrNum);
		// 유저id
		// 영화제목
		String strrRate = request.getParameter("rRate");
		int rRate = Integer.parseInt(strrRate);
		String rContent = request.getParameter("rContent");
		String strrDate = request.getParameter("rDate");
		Timestamp rDate = Timestamp.valueOf(strrDate);

		// 2. VO생성해서 setter 저장하기
		ReviewVO review = new ReviewVO();
		review.setrNum(rNum);
		review.setrRate(rRate);
		review.setrContent(rContent);
		review.setrDate(rDate);

		// 3. DAO 생성 및 update로직 호출(update 로직은 직접작성)
		ReviewDAO dao = ReviewDAO.getInstance();
		int resultCode = dao.update(review);
		if (resultCode == 1) {
			System.out.println("리뷰 수정 성공");
		} else if (resultCode == 0) {
			System.out.println("오류로 인한 리뷰 수정 실패");
		}

	}// end execute()

}
