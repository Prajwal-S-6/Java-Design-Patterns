package org.example.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman swordsmanGameUnit = new Swordsman();
		swordsmanGameUnit.move(new Point3D(1,1,1),1);
		swordsmanGameUnit.attack();

		System.out.println(swordsmanGameUnit);

		//creating a copy of Swordsman Gameunit using clone; states are reset before creating a copy
		Swordsman swordsmanPrototype1 = (Swordsman) swordsmanGameUnit.clone();
		swordsmanPrototype1.move(new Point3D(2,2,2),2);
		swordsmanPrototype1.attack();
		System.out.println(swordsmanPrototype1);

		//creating a copy of Swordsman Gameunit using clone; states are reset before creating a copy
		Swordsman swordsmanPrototype2 = (Swordsman) swordsmanGameUnit.clone();
		System.out.println(swordsmanPrototype2);


		General generalGameUnit = new General();
		generalGameUnit.move(new Point3D(1,1,1),2);
		generalGameUnit.boostMorale();
		System.out.println(generalGameUnit);

		// copy/prototype not allowed for General Gameunit; hence throws CloneNotSupportedException
		General generalPrototype = (General) generalGameUnit.clone();
		System.out.println(generalPrototype);
	}


}
