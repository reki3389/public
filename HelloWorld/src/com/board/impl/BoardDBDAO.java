package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public String getUserName(String id, String passwd) {
		conn = DAO.getConnect(); // 데이터베이스 연결
		String sql = "select * from user_login where id=? and passwd=?"; // 쿼리문 작성
		String name = null; // 초기값 선언
		try { // 트라이캐치로
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return name;
	}
	
	public String compareCheck (String login_id, String writer) {
		conn = DAO.getConnect();
		String sql = "select * from user_login, boards where user_login.ID = boards.WRITER";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, login_id);
			pstmt.setString(2, writer);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values(board_seq.nextval, ?, ?, ?, sysdate, null)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<BoardDB> getBoardList() {
		List<BoardDB> list = new ArrayList<>();
		conn = DAO.getConnect();
		String sql = "select board_no, title, content, writer, creation_date, orig_no, \r\n" + 
				"(select count(*) from boards where orig_no = b.board_no) as reply_cnt\r\n" + 
				",get_reply_cnt(b.board_no) as reply_count from boards b where orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title")+"("+rs.getString("reply_cnt")+")");
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<BoardDB> getReplyList(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no = " + boardNo;
		List<BoardDB> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

	public BoardDB getBoard(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no = ? and orig_no is null";
		BoardDB board = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo); // 파라메터 타입 지정
			rs = pstmt.executeQuery(); // 데이터를 가져오기위한 쿼리 전송

			if (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}

	public void replyBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values(board_seq.nextval, ?, ?, ?, sysdate, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			pstmt.setInt(4, board.getOrigNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "delete from boards where board_no = ? or orig_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
			pstmt.setInt(2, board.getOrigNo());
			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건이 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateBoard(BoardDB board) {
		System.out.println("content : " + board.getContent());
		conn = DAO.getConnect();
		String sql = "update boards set orig_no = orig_no ";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += ", title=? ";
		}
		if (board.getContent() != null && !board.getContent().equals("")) {
			sql += ", content=? ";
		}
		sql += " where board_no=? and orig_no is null ";
		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (board.getTitle() != null && !board.getTitle().equals("")) {
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getContent() != null && !board.getContent().equals("")) {
				pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoardNo());
			System.out.println(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
