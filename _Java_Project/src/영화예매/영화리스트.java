package 영화예매;

import java.util.ArrayList;

public class 영화리스트 {
	private ArrayList<영화> movieList = new ArrayList<>(); //영화 객체가 든 리스트
	
	public void 영화리스트() { //기본 영화 목록
		영화 aven = new 영화("어벤져스");
		aven.insertDate("7월 2일");
		aven.insertDate("7월 6일");
		aven.insertDate("7월 13일");
		aven.insertDate("7월 14일");
		aven.insertDate("7월 18일");
		movieList.add(aven);

		영화 lapu=new 영화("라푼젤");
		lapu.insertDate("7월 1일");
		lapu.insertDate("7월 3일");
		lapu.insertDate("7월 7일");
		lapu.insertDate("7월 10일");
		lapu.insertDate("7월 15일");
		movieList.add(lapu);
		
		영화 avat = new 영화("아바타");
	    avat.insertDate("7월 14일");
	    avat.insertDate("7월 16일");
	    avat.insertDate("7월 18일");
	    avat.insertDate("7월 20일");
	    avat.insertDate("7월 21일");
	    avat.insertDate("7월 24일");
	    avat.insertDate("7월 25일");
	    movieList.add(avat);
	      
	    영화 gong = new 영화("공조");
	    gong.insertDate("7월 1일");
	    gong.insertDate("7월 6일");
	    gong.insertDate("7월 10일");
	    gong.insertDate("7월 13일");
	    gong.insertDate("7월 19일");
	    gong.insertDate("7월 21일");
	    gong.insertDate("7월 22일");
	    gong.insertDate("7월 25일");
	    gong.insertDate("7월 28일");
	    movieList.add(gong);
	      
	    영화 ring = new 영화("링");
	    ring.insertDate("7월 11일");
	    ring.insertDate("7월 13일");
	    ring.insertDate("7월 16일");
	    ring.insertDate("7월 20일");
	    ring.insertDate("7월 21일");
	    ring.insertDate("7월 22일");
	    ring.insertDate("7월 26일");
	    ring.insertDate("7월 29일");
	    ring.insertDate("7월 31일");
	    movieList.add(ring);
	}
	
	public void printMovie() { //영화리스트 출력
		System.out.println("--현재 상영 영화--");
		for(int i=0; i<movieList.size(); i++) {
			System.out.println((i+1)+". "+movieList.get(i).getName());
		}
	}

	public ArrayList<영화> getMovieList() {
		return movieList;
	}

	public void setMovieList(ArrayList<영화> movieList) {
		this.movieList = movieList;
	}
	
}
