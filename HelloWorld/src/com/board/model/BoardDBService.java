package com.board.model;

import java.util.List;

public interface BoardDBService {
	
	public String loginCheck (String id, String passwd); // 로그인 체크
	
	public void insertBoard(BoardDB board); // 게시글작성
	
	public List<BoardDB> getBoardList(); // 게시글 리스트
	
	public BoardDB getBoard(int boardNo); //한건 조회
	
	public List<BoardDB> getReply(int boardNo); //댓글 조회
	
	public void insertReply(BoardDB board1); // 댓글 추가
	
	public void updateBoard(BoardDB board); //수정
	
	public void deleteBoard(BoardDB board); //삭제

	
}
