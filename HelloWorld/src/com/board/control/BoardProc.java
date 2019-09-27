package com.board.control;

import java.util.Scanner;

import com.board.imp1.BoardServiceImp1;
import com.board.model.Board;
import com.board.model.BoardService;

public class BoardProc {

	Scanner sc = new Scanner(System.in);
	Board[] boardAry = new Board[10];
	BoardService service = new BoardServiceImp1();

	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 9.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글번호입력:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);

	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력:");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);

	}

	public void getBoardList() {
		System.out.println("전체글조회.");
		Board[] boards = service.getBoardList(boardAry);
		for (Board board : boards) {
			if (board != null)
				System.out.println(board);
		}

	}

	public void updateBoard() {
		System.out.println("수정할 글 번호: ");
		int boardNo = sc.nextInt();
		System.out.println("변경할 제목: ");
		String title = sc.next();
		System.out.println("변경할 내용: ");
		String content = sc.next();
		System.out.println("변경할 이름: ");
		String writer = sc.next();

		Board board1 = new Board(boardNo, title, content, writer);
		service.updateBoard(board1, boardAry);
	}

	public void getBoardDelete() {
		System.out.println("몇번 글을 삭제 합니까?");
		int boardNo = sc.nextInt();
		service.getBoardDelete(boardNo, boardAry);

	}
}