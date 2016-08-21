package edu.uchicago.sooji1;

import edu.uchicago.sooji1.domain.Animal;
import edu.uchicago.sooji1.domain.Breed;
import edu.uchicago.sooji1.repository.AnimalRepository;
import edu.uchicago.sooji1.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProWebServiceApplication implements CommandLineRunner
{
	@Autowired
	private AnimalRepository animalRepository;

	@Autowired
	private BreedRepository breedRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(ProWebServiceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		Animal[] animals = new Animal[3];
		animals[0] = new Animal("Cat");
		animals[1] = new Animal("Dog");
		animals[2] = new Animal("Rabbit");

		animalRepository.save(Arrays.asList(animals));

		/**
		 * Each animal has many breeds. A breed cannot have many animals for the purposes of this assignment (and I think in
		 * most cases).
		 */
		Breed[] breeds = new Breed[5];
		breeds[0] = new Breed("Siamese", "Cats with light-colored coats set off with black mask, ears, paws, and tail native to Thailand.", animals[0], "http://www.golfian.com/wp-content/uploads/2016/07/Adorable-Siamese-Cat-600x600.jpg");
		breeds[1] = new Breed("Maine Coon", "Largest domestic breed of cat.", animals[0], "http://stockfresh.com/files/c/cynoclub/m/16/4697900_stock-photo-maine-coon-kitten.jpg");
		breeds[2] = new Breed("Pug", "The Pug is a breed of dog with a wrinkly, short-muzzled face and curled tail. Originates from China.", animals[1], "http://www.dogstad.com/wp-content/uploads/2013/06/dogstad_0045_34238701-pug-dog-isolated-on-white-background-Copy-Copy.jpg");
		breeds[3] = new Breed("Yorkshire Terrier", "The Yorkshire Terrier is a small dog breed of terrier type, developed during the 19th century in Yorkshire, England, to catch rats in clothing mills.", animals[1], "http://img-aws.ehowcdn.com/600x600p/photos.demandstudios.com/getty/article/178/127/87788133.jpg");
		breeds[4] = new Breed("Holland Lop", "The Holland Lop is a breed of rabbit originating in the Netherlands.", animals[2], "http://img-aws.ehowcdn.com/600x600p/photos.demandstudios.com/getty/article/114/105/skd187613sdc.jpg");

		breedRepository.save(Arrays.asList(breeds));
	}

}
