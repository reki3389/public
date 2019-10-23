package com.yedam.collections.list;

import java.util.List;

import com.board.model.Board;

public class ListExample {
	public static void main(String[] args) {
		Baord1 dao = new BoardDao();
		List<Board> list = dao.getBoard1List();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
