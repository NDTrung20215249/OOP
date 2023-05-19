package main;

public class Main {
	
	public static void main(String[] args) {
		
		String start_url = "https://nguoikesu.com/dong-lich-su/viet-nam-dan-chu-cong-hoa";
		
		Bot bot = new Bot(start_url);
		bot.start();
		
	}

}