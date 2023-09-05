package compostringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment com1 = new Comment("Tenha uma boa viagem");
		Comment com2 = new Comment("Wow isso é incrivel");
		Comment com3 = new Comment("Boa noite");
		Comment com4 = new Comment("Que a força esteja com voce");
		
		Post post1 = new Post(sdf.parse("18/08/2023 14:07:32"),"Viajando para Nova Zelandia", "Estou indo viajar esse país Maravilhoso!", 12);
		post1.addComment(com1);
		post1.addComment(com2);
		Post post2 = new Post(sdf.parse("01/08/2023 14:30:22"),"Boa noite galera","Vejo voces amanha",5);
        post2.addComment(com3);
        post2.addComment(com4);
        
        System.out.println(post1.toString());
		
		
	}

}
