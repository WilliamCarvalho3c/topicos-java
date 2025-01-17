package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//exce��o � um erro que deve ser tratado
		Date x1 = new Date();//data hor�rio atual
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L );//multiplica por 60 para dar um minuto; por 60 de novo para dar uma hora e pelo hor�rio final para imprimir o hor�rio 5 da manh� do dia 1 de janeiro de 1970
		Date y1 = sdf1.parse("22/05/2021");
		Date y2 = sdf2.parse("22/02/2021 11:00:15");
		Date y3 = Date.from(Instant.parse("2021-05-22T11:18:07Z"));//definido utc o "z" no final indica isso.
		
		System.out.println("----------------------");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("----------------------");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("----------------------");
		System.out.println("y1: " + (y1));
		System.out.println("y2: " + (y2));
		System.out.println("y3: " + (y3));
		System.out.println("x1: " + (x1));
		System.out.println("x2: " + (x2));
		System.out.println("x3: " + (x3));
		System.out.println("x4: " + (x4));
	}

}
