package worldCup;

public class Team {
	private String name;
	private int score;// 进球数
	private int tolscore;// 积分
	private int allnum;// 总进球数
	private int tolnum;// 总净胜球数

	public Team() {
		this.name = "";
		this.score = 0;
		this.tolnum = 0;
		this.tolscore = 0;
		this.allnum = 0;
	}

	public Team(String a) {
		this.name = a;
		this.score = 0;
		this.tolnum = 0;
		this.tolscore = 0;
		this.allnum = 0;
	}

	/**
	 * 
	 * @param a
	 *            a队实体类
	 * @param b
	 *            b队实体类
	 * @param scoreA
	 *            a队与b队的比分
	 * @param scoreB
	 */
	public void game(Team a, Team b, int scoreA, int scoreB) {
		a.score = scoreA;
		b.score = scoreB;

		a.allnum += a.score;
		b.allnum += b.score;
		// score;进球数
		// tolscore;积分
		// allnum;总进球数
		// tolnum;总净胜球数
		if (a.score > b.score) {
			a.tolscore += 3;
			a.tolnum += a.score - b.score;
		}
		if (a.score < b.score) {
			b.tolscore += 3;
			b.tolnum += b.score - a.score;
		}
		if (a.score == b.score) {
			a.tolscore += 1;
			b.tolscore += 1;
		}
	}

	public String getname() {
		return name;
	}

	public int gettolscore() {
		return tolscore;
	}

	public int gettolnum() {
		return tolnum;
	}

	public int getallnum() {
		return allnum;
	}

	public void setname(String a) {
		this.name = a;
	}

	public void settolscore(int a) {
		this.tolscore = a;
	}

	public void settolnum(int a) {
		this.tolnum = a;
	}

	public void setallnum(int a) {
		this.allnum = a;
	}
}
