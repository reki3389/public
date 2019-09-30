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
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.hasNextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
			}
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
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 게시글 번호를 입력하세요.");
			sc.hasNextLine();
		}
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
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 조회 번호를 입력하세요.");
			sc.hasNextLine();
		}
		sc.nextLine();
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
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 수정글 번호를 입력하세요.");
			sc.hasNextLine();
		}
		sc.nextLine();
		System.out.println("변경할 제목: ");
		String title = null;
		try {
			title = sc.nextLine();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 변경할 제목을 입력하세요.");
		}
		sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = null;
		try {
			content = sc.nextLine();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 변경 내용을 작성하세요.");
		}
		sc.nextLine();
		System.out.println("변경할 이름: ");
		String writer = null;
		try {
			writer = sc.nextLine();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 변경할 이름을 입력하세요.");
		}
		sc.nextLine();
		Board board1 = new Board(boardNo, title, content, writer);
		service.updateBoard(board1, boardAry);
	}

	public void getBoardDelete() {
		System.out.println("몇번 글을 삭제 합니까?");
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 삭제 글 번호를 입력하세요.");
		}
		sc.nextLine();
		service.getBoardDelete(boardNo, boardAry);

	}
}