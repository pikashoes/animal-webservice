package edu.uchicago.sooji1;

import edu.uchicago.sooji1.domain.Make;
import edu.uchicago.sooji1.domain.Van;
import edu.uchicago.sooji1.repository.MakeRepository;
import edu.uchicago.sooji1.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProWebServiceApplication implements CommandLineRunner
{
	@Autowired
	private VanRepository vanRepository;

	@Autowired
	private MakeRepository makeRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(ProWebServiceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		Make[] makes = new Make[3];
		makes[0] = new Make("BMW");
		makes[1] = new Make("Audi");
		makes[2] = new Make("Mercedes");

		makeRepository.save(Arrays.asList(makes));

		Van[] vans = new Van[5];
		vans[0] = new Van("RB Low top", "151 inch wheel base with Diesel", makes[2], "http://sportsmobile.com/wp-content/uploads/2015/01/red-sprinter-penthouse-2.jpg");
		vans[1] = new Van("A3", "Best car ever", makes[1], "http://www.parkwayspecialistcars.co.uk/uploads/product/zoom_AUDI_A3_2.0_TDI_170_BHP_QUATTRO_BLACK_EDITION_5Dr.jpg");
		vans[2] = new Van("R8", "GET THIS", makes[1], "http://i.imgur.com/ZEXzBeF.jpg");
		vans[3] = new Van("3-series", "SF cars", makes[0], "http://st.motortrend.com/uploads/sites/5/2015/05/2016-BMW-3-Series-Wagon-front-three-quarter-in-motion.jpg");
		vans[4] = new Van("5-series", "Old people cars", makes[0], "https://upload.wikimedia.org/wikipedia/commons/c/cd/BMW_535i_GT_(F07)_front-2_20101016.jpg");

		vanRepository.save(Arrays.asList(vans));
	}
}
