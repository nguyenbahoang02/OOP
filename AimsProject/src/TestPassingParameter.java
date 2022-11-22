
public class TestPassingParameter {
	public static void main(String args[]) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		dvdWrapper dvd5 = new dvdWrapper(jungleDVD);
		dvdWrapper dvd6 = new dvdWrapper(cinderellaDVD);
		swap(dvd5, dvd6);
		System.out.println("Jungle dvd title: "+ dvd5.c.getTitle());
		System.out.println("cinderella dvd title: "+ dvd6.c.getTitle());
		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("Jungle dvd title: "+ jungleDVD.getTitle());
	}
	
	public static void swap(dvdWrapper o1, dvdWrapper o2) {
		DigitalVideoDisc tmp = o1.c;
		o1.c=o2.c;
		o2.c=tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
 	}
}
