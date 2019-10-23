package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.board.model.Board;

public class BoardDao extends Baord1 {
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		
		list.add("제목1", "내용1");
	}
}